Public Class frmdatos
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Call fecha()
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Call hora()
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Me.Hide()
        Form1.Show()


    End Sub
End Class