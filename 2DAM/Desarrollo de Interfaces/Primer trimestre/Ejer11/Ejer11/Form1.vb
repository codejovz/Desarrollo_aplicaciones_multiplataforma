Public Class Form1

    Private Sub btnUno_Click(sender As Object, e As EventArgs) Handles btnUno.Click

        Dim total As String = ""

        If RadioButton1.Checked Then
            total = total + RadioButton1.Text
        End If

        If RadioButton3.Checked Then
            total = total + RadioButton3.Text
        End If

        If RadioButton4.Checked Then
            total = total + RadioButton4.Text
        End If

        If CheckBox1.Checked Then
            total = total + CheckBox1.Text
        End If

        If CheckBox2.Checked Then
            total = total + CheckBox2.Text
        End If

        If CheckBox3.Checked Then
            total = total + CheckBox3.Text
        End If

        TextBox1.Text = total

    End Sub
End Class
