Public Class Form1
    Dim Oconexion As New OleDb.OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" & Application.StartupPath & "\dbbanco.accdb;")
    Dim odataadapter As New OleDb.OleDbDataAdapter("SELECT * FROM tbdatos", Oconexion) 'cada adaptador tiene select diferente
    Dim Odataset As New DataSet()
    Dim Odataset2 As New DataSet()

    Private Sub btnCargar_Click(sender As Object, e As EventArgs) Handles btnCargar.Click


        Try

            Oconexion.Open()
            odataadapter.Fill(Odataset, "tbdatos")
            Oconexion.Close()

            btnVer.Enabled = True

            MsgBox("Conexion establecida")

        Catch ex As Exception
            MsgBox(ex.ToString)
        End Try



    End Sub

    Private Sub btnVer_Click(sender As Object, e As EventArgs) Handles btnVer.Click

        DataGridView1.ClearSelection()

        DataGridView1.DataSource = Odataset
        DataGridView1.DataMember = "tbdatos"
        btnInsertar.Enabled = True
        btnGuardar.Enabled = True



    End Sub

    Private Sub btnInsertar_Click(sender As Object, e As EventArgs) Handles btnInsertar.Click

        Dim ofila = Odataset.Tables("tbdatos").NewRow

        ofila("Numero_Cuenta") = tbCuenta.Text
        ofila("nombre") = tbNombre.Text
        ofila("direccion") = tbDireccion.Text
        ofila("telefono") = tbTelefono.Text

        Odataset.Tables("tbdatos").Rows.Add(ofila)

        Oconexion.Open()
        odataadapter.Update(Odataset, "tbdatos")
        Oconexion.Close()

    End Sub

    Private Sub btnGuardar_Click(sender As Object, e As EventArgs) Handles btnGuardar.Click

        Oconexion.Open()
        odataadapter.Update(Odataset, "tbdatos")
        Oconexion.Close()

    End Sub

    Private Sub DataGridView1_CellClick(sender As Object, e As DataGridViewCellEventArgs) Handles DataGridView1.CellClick

        Try

            tbNombre.Text = Odataset.Tables("tbdatos").Rows(e.RowIndex).Item("nombre")
            tbCuenta.Text = Odataset.Tables("tbdatos").Rows(e.RowIndex).Item("Numero_Cuenta")
            tbDireccion.Text = Odataset.Tables("tbdatos").Rows(e.RowIndex).Item("direccion")
            tbTelefono.Text = Odataset.Tables("tbdatos").Rows(e.RowIndex).Item("telefono")

        Catch ex As Exception
            MsgBox(ex.ToString)
        End Try

    End Sub



    Private Sub btnRecorrer_Click(sender As Object, e As EventArgs) Handles btnRecorrer.Click

        If DataGridView1.Rows.Count > 0 Then 'Asegura que el datagrid tenga contenido

            For Each Fila As DataGridViewRow In DataGridView1.Rows
                If Not Fila Is Nothing Then ' Comprueba si la fila tiene contenido
                    For Each Celda As DataGridViewCell In Fila.Cells 'Recorre todas las celdas de la fila
                        If Not Celda.Value Is Nothing Then 'Se asegura de que no haya celdas en blanco.
                            MsgBox(Celda.Value)
                        End If

                    Next
                End If
            Next

        End If

    End Sub

    Private Sub btnNombres_Click(sender As Object, e As EventArgs) Handles btnNombres.Click

        If DataGridView1.Rows.Count > 0 Then
            For Each Fila As DataGridViewRow In DataGridView1.Rows 'Solo coge la columna que le diga

                If Not Fila.Cells.Item("nombre").Value Is Nothing Then
                    MsgBox(Fila.Cells.Item("nombre").Value)
                End If

            Next
        End If

    End Sub
End Class
