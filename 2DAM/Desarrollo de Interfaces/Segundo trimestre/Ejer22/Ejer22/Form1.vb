Public Class Form1
    Dim temperature As Integer = 0


    Private Sub hsScrollActual_ValueChanged(sender As Object, e As EventArgs) Handles hsScrollActual.ValueChanged

        temperature = hsScrollActual.Value
        lblActualTemperature.Text = Str(temperature) + "ºC"

        If temperature < 10 Then
            hsScrollSnap.Value = 0
            lblExp.Text = "Muy frio"
            PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Assets/mf.jpg")
        End If

        If temperature >= 10 And temperature < 20 Then
            hsScrollSnap.Value = 10
            lblExp.Text = "Frio"
            PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Assets/F.jpg")
        End If

        If temperature >= 20 And temperature < 30 Then
            hsScrollSnap.Value = 20
            lblExp.Text = "Templado"
            PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Assets/T.jpg")
        End If

        If temperature >= 30 And temperature < 40 Then
            hsScrollSnap.Value = 30
            lblExp.Text = "Caliente"
            PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Assets/C.jpg")
        End If

        If temperature >= 40 And temperature < 50 Then
            hsScrollSnap.Value = 40
            lblExp.Text = "Muy caliente"
            PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Assets/MC.jpeg")
        End If

        If temperature = 50 Then
            hsScrollSnap.Value = 50
            lblExp.Text = "Ardiendo"
            PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Assets/A.jpg")
        End If

    End Sub


End Class
