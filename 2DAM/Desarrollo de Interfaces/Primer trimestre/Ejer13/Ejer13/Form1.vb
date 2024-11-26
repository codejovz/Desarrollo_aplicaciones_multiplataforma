Public Class Form1
    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles btnNueva.Click
        'Limpia la listbox
        lbNombres.Items.Clear()
    End Sub


    Private Sub btnAlta_Click(sender As Object, e As EventArgs) Handles btnAlta.Click
        If tbAnadir.Text <> Nothing Then

            Dim nuevaAlta As String = tbAnadir.Text()
            lbNombres.Items.Add(nuevaAlta)

        End If
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        Close()
    End Sub

    Private Sub btnBaja_Click(sender As Object, e As EventArgs) Handles btnBaja.Click

        If lbNombres.SelectedIndex <> -1 Then

            Dim nuevaBaja As Integer = lbNombres.SelectedIndex
            lbNombres.Items.RemoveAt(nuevaBaja)

        End If

    End Sub

    Private Sub lbNombres_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lbNombres.SelectedIndexChanged
        'Dim seleccionado As Integer = lbNombres.SelectedIndex

        Dim seleccionadoS As String = lbNombres.SelectedItem

        'tbElementoSeleccionado.Text = seleccionadoS
        tbElementoSeleccionado.Text = seleccionadoS


    End Sub

    Private Sub tbAnadir_KeyDown(sender As Object, e As KeyEventArgs) Handles tbAnadir.KeyDown

        If e.KeyCode = Keys.KeyCode.Enter AndAlso tbAnadir.Text <> Nothing Then

            Dim nuevaAlta As String = tbAnadir.Text()
            lbNombres.Items.Add(nuevaAlta)

        End If

    End Sub
End Class
