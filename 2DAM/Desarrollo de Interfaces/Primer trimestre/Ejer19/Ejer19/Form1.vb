Public Class Form1


    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        Close()
    End Sub

    Private Sub PictureBox1_Click(sender As Object, e As EventArgs) Handles PictureBox1.Click

        PictureBox4.Image = Image.FromFile(Application.StartupPath & "/images/alemania.png")

    End Sub

    Private Sub PictureBox2_Click(sender As Object, e As EventArgs) Handles PictureBox2.Click
        PictureBox4.Image = Image.FromFile(Application.StartupPath & "/images/espana.png")
    End Sub

    Private Sub PictureBox3_Click(sender As Object, e As EventArgs) Handles PictureBox3.Click
        PictureBox4.Image = Image.FromFile(Application.StartupPath & "/images/inglaterra.png")
    End Sub

    Private Sub btnZoom_Click(sender As Object, e As EventArgs) Handles btnZoom.Click
        btnNoZoom.Enabled = True
        btnZoom.Enabled = False
        PictureBox4.SizeMode = PictureBoxSizeMode.Normal


    End Sub

    Private Sub btnNoZoom_Click(sender As Object, e As EventArgs) Handles btnNoZoom.Click
        btnZoom.Enabled = True
        btnNoZoom.Enabled = False
        PictureBox4.SizeMode = PictureBoxSizeMode.StretchImage
    End Sub

    Private Sub btnMas_Click(sender As Object, e As EventArgs) Handles btnMas.Click

        PictureBox4.Width = PictureBox4.Width + 4
        PictureBox4.Height = PictureBox4.Height + 4
    End Sub

    Private Sub btnMenos_Click(sender As Object, e As EventArgs) Handles btnMenos.Click
        PictureBox4.Width = PictureBox4.Width - 4
        PictureBox4.Height = PictureBox4.Height - 4
    End Sub
End Class
