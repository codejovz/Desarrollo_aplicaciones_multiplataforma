Public Class Form1
    Private Sub btnBorrar_Click(sender As Object, e As EventArgs) Handles btnBorrar.Click

        'estudiar drop down, combobox,dropdownlist

        'mucho mas de combobox

        '

        Dim cuenta As Integer = lbNombres.Items.Count

        For a = 0 To lbNombres.Items.Count - 1

            If lbNombres.SelectedIndex <> -1 Then

                lbNombres.Items.RemoveAt(lbNombres.SelectedIndex)

            End If


        Next



    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        'FindString busca algo, si lo hay te retorna su indice. si no te da -1

        Dim cadena As String = tbBuscar.Text
        Dim index As Integer = lbNombres.FindString(cadena)

        If lbNombres.FindString(cadena) <> -1 Then
            MsgBox("Existe, en posicion " & index)
        End If
        If lbNombres.FindString(cadena) = -1 Then
            MsgBox("No existe")
        End If



    End Sub
End Class
