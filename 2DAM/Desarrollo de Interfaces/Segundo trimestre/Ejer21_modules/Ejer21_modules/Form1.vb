Public Class Form1
    Inherits System.Windows.Forms.Form
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Me.Hide()
        formula2.TextBox1.Text = "pepepepe"
        formula2.Button1.BackColor = Color.Red

        formula2.Show()

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Me.Hide()
        frmdatos.Show()
    End Sub
End Class
