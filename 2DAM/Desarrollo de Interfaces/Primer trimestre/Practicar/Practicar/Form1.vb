Public Class Form1
    Private Sub btnConvertir_Click(sender As Object, e As EventArgs) Handles btnConvertir.Click

        Dim contenTb1 As Integer = tb1.Text

        lblResultado.Visible = True

        tb2.Text = CDec(contenTb1)

        lblResultado.Text = Str(contenTb1)


    End Sub
End Class
