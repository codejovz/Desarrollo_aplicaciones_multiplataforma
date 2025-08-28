Public Class Form1
    Private Sub ListBox1_SelectedIndexChanged(sender As Object, e As EventArgs) Handles ListBox1.SelectedIndexChanged

        Dim seleccionado As String = ListBox1.SelectedItem
        Dim path As String = "C:\Users\jotaa\OneDrive\Escritorio\"
        tbPais.Text = seleccionado

        Select Case seleccionado
            Case "Alemania"
                tbSaludo.Text = "Hallo"
                path = path + "alemania.png"
            Case "España"
                tbSaludo.Text = "Hola"
                path = path + "espana.png"
            Case "Italia"
                tbSaludo.Text = "Ciao"
                path = path + "italia.png"
            Case "Inglaterra"
                tbSaludo.Text = "Hello"
                path = path + "inglaterra.png"
        End Select

        pbPais.SizeMode = PictureBoxSizeMode.StretchImage

        pbPais.Image = Image.FromFile(path)


    End Sub
End Class
