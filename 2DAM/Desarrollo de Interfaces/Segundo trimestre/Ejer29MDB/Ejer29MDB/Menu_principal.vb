Public Class Menu_principal

    Inherits Windows.Forms.Form

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        Me.Close()
    End Sub

    Private Sub btnGestion_Click(sender As Object, e As EventArgs) Handles btnGestion.Click
        gestion.Show()
        Me.Hide()
    End Sub

    Private Sub btnOperar_Click(sender As Object, e As EventArgs) Handles btnOperar.Click
        Form1.Show()
        Me.Hide()
    End Sub
End Class