Public Class Form1
    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click

        Close()

    End Sub

    Private Sub btnRestaurar_Click(sender As Object, e As EventArgs) Handles btnRestaurar.Click

        tbCent.Text = Nothing
        tbFare.Text = Nothing

    End Sub

    Private Sub btnCalcular_Click(sender As Object, e As EventArgs) Handles btnCalcular.Click

        Dim centigrados As Double
        Dim farenheit As Double

        If tbCent.Text = "" And tbFare.Text <> "" Then

            farenheit = CDec(tbFare.Text)
            tbCent.Text = (farenheit - 32) * 5 / 9

        End If

        If tbCent.Text <> "" And tbFare.Text = "" Then

            centigrados = CDec(tbCent.Text)
            tbFare.Text = (centigrados * 9 / 5 + 32)

        End If




    End Sub

    Private Sub btnMensaje_Click(sender As Object, e As EventArgs) Handles btnMensaje.Click

        MsgBox("Buenas tardes!")

    End Sub
End Class
