Public Class Form1





    'OpenFileDialog
    'SaveFileDialog

    'Metodo comun: ShowDialog()
    'Propiedades : Filename / Filter

    'OpenFileDialog1.ShowDialog()

    'Dim nombreFichero as String =  OpenFileDialog1.FileName  almacena nombre de archivo y ruta

    'OpenFileDialog1.Filter ="WordDocument+(*.doc)"
    '                           descripcion tipo fichero          *.doc es el filtro real

    'ColorDialog -------------ColorDialog1.Color
    'FontDialog  -------------FontDialog1.Font

    'Process.start(OpenFileDialog1.Filename)



    Private Sub btnTipLetra_Click(sender As Object, e As EventArgs) Handles btnTipLetra.Click

        FontDialog1.ShowDialog()
        lblDAM.Font = FontDialog1.Font

    End Sub

    Private Sub btnColLetra_Click(sender As Object, e As EventArgs) Handles btnColLetra.Click
        ColorDialog1.ShowDialog()
        lblDAM.ForeColor = ColorDialog1.Color
    End Sub

    Private Sub btnFondo_Click(sender As Object, e As EventArgs) Handles btnFondo.Click


        ColorDialog1.ShowDialog()
        Me.BackColor = ColorDialog1.Color
    End Sub

    Private Sub btnImagen_Click(sender As Object, e As EventArgs) Handles btnImagen.Click
        OpenFileDialog1.Filter = "Image Files (*.jpg; *.jpeg; *.png; *.gif)|*.jpg; *.jpeg; *.png; *.gif"
        OpenFileDialog1.ShowDialog()

        Dim imagen As String = OpenFileDialog1.FileName

        PictureBox1.Image = Image.FromFile(imagen)


    End Sub

    Private Sub btnAbrirApp_Click(sender As Object, e As EventArgs) Handles btnAbrirApp.Click

        OpenFileDialog1.Filter = "App Files (*.exe)|*.exe"
        OpenFileDialog1.ShowDialog()
        Process.Start(OpenFileDialog1.FileName)

    End Sub

End Class