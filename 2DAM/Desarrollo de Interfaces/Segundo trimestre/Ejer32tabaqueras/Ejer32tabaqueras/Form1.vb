Public Class Form1

    Dim Oconexion As New OleDb.OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" & Application.StartupPath & "\dbtabaqueras.accdb;")
    Dim ODAtbtabaqueras As New OleDb.OleDbDataAdapter("SELECT * FROM tbtabaqueras", Oconexion)
    Dim ODAtbpedidos As New OleDb.OleDbDataAdapter("SELECT * FROM tbpedidos", Oconexion)
    Dim ODAtbmarcas As New OleDb.OleDbDataAdapter("SELECT * FROM tbmarcas", Oconexion)
    Dim Odataset As New DataSet()
    Dim obuilder As New OleDb.OleDbCommandBuilder(ODAtbpedidos)
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load


        Oconexion.Open()
        ODAtbtabaqueras.Fill(Odataset, "tbtabaqueras")
        ODAtbpedidos.Fill(Odataset, "tbpedidos")
        ODAtbmarcas.Fill(Odataset, "tbmarcas")
        Oconexion.Close()


        For Each Ofila In Odataset.Tables("tbtabaqueras").Rows
            cbTabaqueras.Items.Add(Ofila("Nombre"))
        Next

        For Each Ofila In Odataset.Tables("tbpedidos").Rows
            lbPedidos.Items.Add(Ofila("Id_pedido"))
        Next

        cbTabaqueras.SelectedIndex = 0

    End Sub

    Private Sub lbMarcas_SelectedValueChanged(sender As Object, e As EventArgs) Handles lbMarcas.SelectedValueChanged

        Select Case lbMarcas.SelectedItem
            Case "Camel"
                PictureBox1.Image = Image.FromFile(Application.StartupPath & "/MARCAS_CIGARROS/CAMEL.JPG")
            Case "Chesterfield"
                PictureBox1.Image = Image.FromFile(Application.StartupPath & "/MARCAS_CIGARROS/DUCADOS.jpg")
            Case "Lucky Strike"
                PictureBox1.Image = Image.FromFile(Application.StartupPath & "/MARCAS_CIGARROS/FORTUNA.jpg")
            Case "Marlboro"
                PictureBox1.Image = Image.FromFile(Application.StartupPath & "/MARCAS_CIGARROS/MALBORO.jpg")
        End Select

        For Each Ofila In Odataset.Tables("tbmarcas").Rows

            If (lbMarcas.SelectedItem = Ofila("nombre_marca")) Then

                tbNumCig.Text = Ofila("Nº_Cigarrillos")
                tbNicotina.Text = Ofila("Nicotina")
                tbPrecio.Text = Ofila("Precio")

            End If

        Next

    End Sub


    Private Sub cbTabaqueras_SelectedValueChanged(sender As Object, e As EventArgs) Handles cbTabaqueras.SelectedValueChanged

        lbMarcas.Items.Clear()

        For Each Ofila In Odataset.Tables("tbmarcas").Rows


            If cbTabaqueras.Text = Ofila("Nombretb") Then
                lbMarcas.Items.Add(Ofila("nombre_marca"))
            End If

        Next

        lbMarcas.SelectedIndex = 0

    End Sub


    Private Sub btnRealizarPedido_Click(sender As Object, e As EventArgs) Handles btnRealizarPedido.Click
        Dim carton As Boolean = ckCartones.Checked
        Dim cantidad As Integer = CInt(nudUnidades.Text)

        If (carton) Then
            cantidad = cantidad * 20
        End If

        Dim ofila As DataRow
        ofila = Odataset.Tables("tbpedidos").NewRow()
        ofila("Nombre_marca") = lbMarcas.SelectedItem
        ofila("cantidad") = cantidad
        ofila("total") = Val(tbPrecio.Text()) * cantidad
        ofila("Id_pedido") = lbPedidos.Items.Count() + 1
        Odataset.Tables("tbpedidos").Rows.Add(ofila)

        Try
            Oconexion.Open()
            ODAtbpedidos.Update(Odataset, "tbpedidos")
            Oconexion.Close()
        Catch ex As Exception
            MsgBox(ex.Message)
        End Try

        lbPedidos.Items.Add(lbPedidos.Items.Count() + 1)
        Dim algo As Integer = MessageBox.Show("Pregunta", "Titulo", MessageBoxButtons.YesNo, MessageBoxIcon.Information)
        MsgBox("Algo: " & algo)
    End Sub

    Private Sub lbPedidos_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lbPedidos.SelectedIndexChanged

        For Each Ofila In Odataset.Tables("tbpedidos").Rows

            If (lbPedidos.SelectedItem = Ofila("Id_pedido")) Then
                nudUnidades.Value = Ofila("cantidad")

                Select Case Ofila("Nombre_marca")
                    Case "Camel"
                        PictureBox1.Image = Image.FromFile(Application.StartupPath & "/MARCAS_CIGARROS/CAMEL.JPG")
                    Case "Chesterfield"
                        PictureBox1.Image = Image.FromFile(Application.StartupPath & "/MARCAS_CIGARROS/DUCADOS.jpg")
                    Case "Lucky Strike"
                        PictureBox1.Image = Image.FromFile(Application.StartupPath & "/MARCAS_CIGARROS/FORTUNA.jpg")
                    Case "Marlboro"
                        PictureBox1.Image = Image.FromFile(Application.StartupPath & "/MARCAS_CIGARROS/MALBORO.jpg")
                End Select

                MsgBox("Este pedido costó: " & Ofila("total"))


            End If


        Next

    End Sub

    '---------------------------------------------[TRALLA]------------------------------------------------


    Private Sub trallaNuevoPedido_Click(sender As Object, e As EventArgs) Handles trallaNuevoPedido.Click

        '---------------------------------------------[TRALLA nuevo]------------------------------------------------


    End Sub

    Private Sub btnBorrarPedido_Click(sender As Object, e As EventArgs) Handles btnBorrarPedido.Click

        Dim numPedido As String = CStr(lbPedidos.SelectedItem.ToString())
        Dim filaAEliminar As DataRow = Nothing

        For Each ofila As DataRow In Odataset.Tables("tbpedidos").Rows

            If Not IsDBNull(ofila("Id_pedido")) AndAlso ofila("Id_pedido") = numPedido Then

                filaAEliminar = ofila

                Exit For

            End If

        Next

        If filaAEliminar IsNot Nothing Then
            filaAEliminar.Delete()
            Oconexion.Open()
            ODAtbpedidos.Update(Odataset, "tbpedidos")
            Oconexion.Close()
            MsgBox("Pedido borrado")
            lbPedidos.Items.RemoveAt(lbPedidos.SelectedIndex)
        Else
            MsgBox("Error al encontrar/borrar")
        End If


    End Sub

End Class
