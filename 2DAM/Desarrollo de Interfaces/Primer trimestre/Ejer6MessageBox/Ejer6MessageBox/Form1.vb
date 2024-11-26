Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load


    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim pulsado = MessageBox.Show("hola", "algo", MessageBoxButtons.OK, MessageBoxIcon.Warning)
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Dim dos As Integer = MessageBox.Show("hola", "algo", MessageBoxButtons.OKCancel)
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Dim tres As Integer = MessageBox.Show("hola", "algo", MessageBoxButtons.RetryCancel)
    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        Dim cuatro As Integer = MessageBox.Show("hola", "algo", MessageBoxButtons.AbortRetryIgnore)
    End Sub

    Private Sub Button5_Click(sender As Object, e As EventArgs) Handles Button5.Click
        Dim cinco As Integer = MessageBox.Show("hola", "algo", MessageBoxButtons.YesNoCancel)
    End Sub
End Class
