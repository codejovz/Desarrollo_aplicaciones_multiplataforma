Public Class Form1

    Dim Oconexion As New OleDb.OleDbConnection("Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" & Application.StartupPath & "\dbbanco.accdb;")
    Dim odataadapter As New OleDb.OleDbDataAdapter("SELECT * FROM tbdatos", Oconexion) 'cada adaptador tiene select diferente
    Dim Odataset As New DataSet()
    Dim Odataset2 As New DataSet()

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Oconexion.Open()

        odataadapter.Fill(Odataset, "tbdatos")

        Oconexion.Close()


        Button1.Enabled = False
        btnVer.Enabled = True
        MsgBox("Conexion establecida.")

    End Sub


    Private Sub btnVer_Click(sender As Object, e As EventArgs) Handles btnVer.Click

        lbNombre.Items.Clear()
        lbDireccion.Items.Clear()
        lbTelefono.Items.Clear()
        lbNumeroCuenta.Items.Clear()

        Dim Ofila As DataRow

        For Each Ofila In Odataset.Tables("tbdatos").Rows
            lbNumeroCuenta.Items.Add(Ofila("Numero_Cuenta"))
        Next


        For Each Ofila In Odataset.Tables("tbdatos").Rows
            lbNombre.Items.Add(Ofila("Nombre"))
        Next

        For Each Ofila In Odataset.Tables("tbdatos").Rows
            lbDireccion.Items.Add(Ofila("Direccion"))
        Next

        For Each Ofila In Odataset.Tables("tbdatos").Rows
            lbTelefono.Items.Add(Ofila("Telefono"))
        Next

        btnEliminar.Enabled = True
        btnBuscar.Enabled = True
        btnModificar.Enabled = True
        btnInsertar.Enabled = True


    End Sub

    Dim obuilder As New OleDb.OleDbCommandBuilder(odataadapter)   'hace insert, update, delete de manera automatica

    Private Sub btnInsertar_Click(sender As Object, e As EventArgs) Handles btnInsertar.Click

        Dim ofila As DataRow
        ofila = Odataset.Tables("tbdatos").NewRow
        ofila("Numero_Cuenta") = tbNumCuenta.Text
        ofila("nombre") = tbNombre.Text
        ofila("direccion") = tbDireccion.Text
        ofila("telefono") = tbTelefono.Text


        Odataset.Tables("tbdatos").Rows.Add(ofila)

        Oconexion.Open()
        odataadapter.Update(Odataset, "tbdatos")
        Oconexion.Close()

        MsgBox("Hecho!")

    End Sub

    Private Sub btnModificar_Click(sender As Object, e As EventArgs) Handles btnModificar.Click
        'buscar registro

        For Each ofila In Odataset.Tables("tbdatos").Rows

            If Not IsDBNull(ofila("nombre")) AndAlso tbNombre.Text = ofila("nombre") Then
                'volcar informacion
                ofila("direccion") = tbDireccion.Text
                ofila("telefono") = tbTelefono.Text
                'Actualizamos BBDD fisica:
                Oconexion.Open()
                odataadapter.Update(Odataset, "tbdatos")
                Oconexion.Close()

                btnVer_Click(Nothing, Nothing)
                MsgBox("Usuario actualizado.")

            End If

        Next


    End Sub

    Private Sub btnEliminar_Click(sender As Object, e As EventArgs) Handles btnEliminar.Click

        Dim nombreEliminar As String = tbNombre.Text
        Dim filaAEliminar As DataRow = Nothing

        For Each ofila As DataRow In Odataset.Tables("tbdatos").Rows

            If Not IsDBNull(ofila("nombre")) AndAlso ofila("nombre") = nombreEliminar Then
                filaAEliminar = ofila
                Exit For
            End If

        Next

        If filaAEliminar IsNot Nothing Then
            filaAEliminar.Delete()

            Oconexion.Open()
            odataadapter.Update(Odataset, "tbdatos")
            Oconexion.Close()

            MsgBox("Usuario eliminado.")
        Else
            MsgBox("Usuario no encontrado.")
        End If

    End Sub

    Private Sub btnBuscar_Click(sender As Object, e As EventArgs) Handles btnBuscar.Click

        Dim i As Integer

        Dim expresion As String = "nombre='" & Me.tbNombre.Text & "'"

        Dim filaEncontrada() As DataRow

        filaEncontrada = Me.Odataset.Tables("tbdatos").Select(expresion)

        If filaEncontrada.GetUpperBound(0) <> -1 Then

            For i = 0 To filaEncontrada.GetUpperBound(0)
                Me.lbTelefono.Items.Add(filaEncontrada(i).Item("telefono"))
                Me.lbNombre.Items.Add(filaEncontrada(i).Item("nombre"))
            Next i

        Else
            MsgBox("Error, no existe.")

        End If

    End Sub
End Class