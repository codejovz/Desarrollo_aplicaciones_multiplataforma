Imports System.Data
Imports System.Data.OleDb

Public Class Form1

    Dim allNames As String = ""
    Dim allPhones As String = ""
    Dim allDirections As String = ""

    Dim OConexion As New OleDbConnection()
    Dim var_conexion = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\coches\BDCOCHES.mdb;"

    Dim ODAtbvendidos As New OleDb.OleDbDataAdapter("SELECT * FROM TBVENDIDOS", OConexion)
    Dim ODAtbmodelos As New OleDb.OleDbDataAdapter("SELECT * FROM TBMODELOS", OConexion)
    Dim Odataset As New DataSet()
    Dim obuilder As New OleDb.OleDbCommandBuilder(ODAtbvendidos)
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        OConexion.ConnectionString = var_conexion
        OConexion.Open()

        Dim OComando = New OleDbCommand("select * FROM TBMODELOS", OConexion)
        Dim odatareader As OleDbDataReader

        odatareader = OComando.ExecuteReader

        cbCoches.Items.Clear()

        While odatareader.Read

            cbCoches.Items.Add(odatareader("MODELO"))

        End While

        cbCoches.SelectedIndex = 0

        lbClientes.Visible = False

    End Sub



    Private Sub btnSalir_Click(sender As Object, e As EventArgs)

    End Sub

    Private Sub cbCoches_SelectedIndexChanged(sender As Object, e As EventArgs) Handles cbCoches.SelectedIndexChanged

        Select Case cbCoches.SelectedItem
            Case "CLIO"
                PictureBox1.Image = Image.FromFile(Application.StartupPath & "\coches\clio.jpg")

            Case "SCENIC"
                PictureBox1.Image = Image.FromFile(Application.StartupPath & "\coches\scenic.jpg")
            Case "LAGUNA"
                PictureBox1.Image = Image.FromFile(Application.StartupPath & "\coches\laguna.jpg")
            Case "TWINGO"
                PictureBox1.Image = Image.FromFile(Application.StartupPath & "\coches\twingo.jpg")
        End Select

        Dim OComando = New OleDbCommand("select * FROM TBMODELOS WHERE MODELO = " & "'" & cbCoches.SelectedItem & "';", OConexion)
        Dim odatareader As OleDbDataReader

        odatareader = OComando.ExecuteReader

        While odatareader.Read

            tbModelo.Text = odatareader("MODELO")
            tbCilindrada.Text = odatareader("CILINDRADA")
            tbMotor.Text = odatareader("MOTOR")
            tbUnidades.Text = odatareader("UNIDADES")

        End While


    End Sub

    Private Sub btnVendidos_Click(sender As Object, e As EventArgs) Handles btnVendidos.Click

        btnVender.Enabled = True
        btnBorrar.Enabled = True
        Button4.Enabled = True

        lbClientes.Items.Clear()

        lbClientes.Visible = True


        Dim OComando = New OleDbCommand("select * FROM TBVENDIDOS;", OConexion)
        Dim odatareader As OleDbDataReader

        odatareader = OComando.ExecuteReader

        While odatareader.Read
            lbClientes.Items.Add(odatareader("TELEFONO"))
        End While


    End Sub

    Private Sub lbClientes_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lbClientes.SelectedIndexChanged

        Dim OComando = New OleDbCommand("select * FROM TBVENDIDOS WHERE TELEFONO = '" & lbClientes.SelectedItem & "';", OConexion)
        Dim odatareader As OleDbDataReader

        odatareader = OComando.ExecuteReader

        While odatareader.Read
            MsgBox(odatareader("MODELO"))
        End While


    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        OConexion.Close()
        Me.Close()
    End Sub

    Private Sub btnBorrar_Click(sender As Object, e As EventArgs) Handles btnBorrar.Click
        Dim seleccionado As Integer = lbClientes.SelectedIndex
        Dim numero As String = lbClientes.SelectedItem
        Dim bcomando = New OleDbCommand("DELETE * FROM TBVENDIDOS WHERE TELEFONO = '" & numero & "'", OConexion)
        bcomando.ExecuteNonQuery()

        lbClientes.Items.RemoveAt(seleccionado)

    End Sub

    Private Sub btnVender_Click(sender As Object, e As EventArgs) Handles btnVender.Click

        Dim vendible As Boolean = False
        Dim unidadesDisponibles = 0
        Dim OComando = New OleDbCommand("select * FROM TBMODELOS WHERE MODELO = '" & cbCoches.SelectedItem & "';", OConexion)
        Dim odatareader As OleDbDataReader

        odatareader = OComando.ExecuteReader

        While odatareader.Read
            If CInt(odatareader("UNIDADES")) > 0 Then
                vendible = True
                unidadesDisponibles = CInt(odatareader("UNIDADES")) - 1
            End If
        End While



        If vendible Then

            Dim telefono As String = InputBox("Introduce el numero de telefono", "P.ej: 123456789")

            If telefono Is "" Or telefono Is Nothing Then
                MsgBox("Rellena el campo del telefono")
            Else

                Dim icomando = New OleDbCommand("INSERT INTO TBVENDIDOS (TELEFONO, MODELO) VALUES (@A, @B)", OConexion)
                icomando.Parameters.AddWithValue("@A", telefono)
                icomando.Parameters.AddWithValue("@B", cbCoches.SelectedItem)
                icomando.ExecuteNonQuery()

                Dim SQL As String = "UPDATE TBMODELOS  SET UNIDADES = @c  WHERE MODELO = @p ;"

                Dim OLEcomando = New OleDbCommand(SQL, OConexion)
                OLEcomando.Parameters.AddWithValue("@p", cbCoches.SelectedItem)
                OLEcomando.Parameters.AddWithValue("@c", unidadesDisponibles)
                OLEcomando.ExecuteNonQuery()


                Dim OComando3 = New OleDbCommand("select * FROM TBMODELOS WHERE MODELO = " & "'" & cbCoches.SelectedItem & "';", OConexion)
                Dim odatareader3 As OleDbDataReader

                odatareader3 = OComando3.ExecuteReader

                While odatareader3.Read

                    tbUnidades.Text = odatareader3("UNIDADES")

                End While

                lbClientes.Items.Add(telefono)
                tbUnidades.Text = Str(CInt(tbUnidades.Text) - 1)
                MsgBox("Vendido!")

            End If

        Else
            MsgBox("Lo siento, no hay modelos de este coche disponibles.")
        End If


    End Sub

End Class
