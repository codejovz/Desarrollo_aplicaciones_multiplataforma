Public Class Form1

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click

        Close()

    End Sub

    Private Sub btnRestaurar_Click(sender As Object, e As EventArgs) Handles btnRestaurar.Click

        tbArea.Text = ""
        tbRadio.Text = Nothing

    End Sub

    Private Sub btnCalcular_Click(sender As Object, e As EventArgs) Handles btnCalcular.Click

        tbArea.Enabled = True
        tbArea.Visible = True
        Dim pi As Double = 3.14159
        Dim radio As Double = CDec(tbRadio.Text)
        Dim area = pi * (radio * radio)
        tbArea.Text = area

    End Sub
End Class
