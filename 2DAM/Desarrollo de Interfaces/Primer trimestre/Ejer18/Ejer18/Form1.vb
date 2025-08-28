Public Class Form1

    Private Structure Libro
        Dim Titulo As String
        Dim Autor As String
        Dim Tema As String
        Dim Paginas As String
        Dim Formato As String
        Dim Estado As String
        Dim Portada As String
    End Structure

    Dim tbLibros(20) As Libro

    Dim NL As Integer = 0 'numero libros

    Private Sub btnNuevo_Click(sender As Object, e As EventArgs) Handles btnNuevo.Click

        btnBajas.Enabled = True

        Dim titulo As String = tbTitulo.Text
        Dim autor As String = tbAutor.Text
        Dim tema As String = cbTema.Text
        Dim paginas As String = tbNumeroPg.Text
        Dim fs As Integer = 0  'FormatosSeleccionados, numero

        If ckCartone.Checked Then
            fs = fs + 1
        End If

        If ckRustica.Checked Then
            fs = fs + 1
        End If

        If ckTapaDura.Checked Then
            fs = fs + 1
        End If

        Dim estado As String = ""

        If rbNovedad.Checked Then
            estado = "Novedad"
        End If
        If rbReedicion.Checked Then
            estado = "Reedicion"
        End If

        Dim formato As String = ""

        If ckCartone.Checked Then
            formato = formato + " cartone "
        End If

        If ckRustica.Checked Then
            formato = formato + " rustica "
        End If

        If ckTapaDura.Checked Then
            formato = formato + " tapa dura "
        End If

        Dim portada As String = cbPortada.Text




        tbLibros(NL).Titulo = titulo
        tbLibros(NL).Autor = autor
        tbLibros(NL).Tema = tema
        tbLibros(NL).Paginas = paginas
        tbLibros(NL).Formato = formato
        tbLibros(NL).Estado = estado
        tbLibros(NL).Portada = portada
        NL = NL + 1
        lbLibros.Items.Add(titulo)

    End Sub


    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        Close()
    End Sub

    Private Sub lbLibros_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lbLibros.SelectedIndexChanged

        Dim seleccionado As Integer = lbLibros.SelectedIndex

        If seleccionado <> -1 And seleccionado < tbLibros.Length Then
            MsgBox(tbLibros(seleccionado).Titulo + " " + tbLibros(seleccionado).Autor + " " + tbLibros(seleccionado).Tema + " " + tbLibros(seleccionado).Paginas + " " + tbLibros(seleccionado).Formato + " " + tbLibros(seleccionado).Estado + " " + Str(seleccionado))
            PictureBox1.Image = Image.FromFile(Application.StartupPath & "/images/" & tbLibros(seleccionado).Portada & ".png")
        End If

    End Sub

    Private Sub btnBajas_Click(sender As Object, e As EventArgs) Handles btnBajas.Click

        Dim seleccionado As Integer = lbLibros.SelectedIndex

        If seleccionado <> -1 Then
            lbLibros.Items.RemoveAt(seleccionado)
            While (seleccionado < NL)
                tbLibros(seleccionado) = tbLibros(seleccionado + 1)
                seleccionado = seleccionado + 1
            End While

        End If

        NL = NL - 1

    End Sub

    Private Sub cbPortada_SelectedIndexChanged(sender As Object, e As EventArgs) Handles cbPortada.SelectedIndexChanged

        Dim pais As String = cbPortada.Text

        If pais = "Espana" Then
            PictureBox1.Image = Image.FromFile(Application.StartupPath & "/images/espana.png")
        End If

        If pais = "Inglaterra" Then
            PictureBox1.Image = Image.FromFile(Application.StartupPath & "/images/inglaterra.png")
        End If

        If pais = "Alemania" Then
            PictureBox1.Image = Image.FromFile(Application.StartupPath & "/images/alemania.png")
        End If

    End Sub
End Class
