Public Class Form1

    Dim texto As String


    Private Sub btnSearch_Click(sender As Object, e As EventArgs) Handles btnSearch.Click

        buscar_patron(txtpalabra.Text, texto, Color.Yellow)



    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub buscar_patron(ByVal textoabuscar As String, ByVal objetotexto As Windows.Forms.RichTextBox, ByVal colortexto As Color, ByVal colorfondo As Color)
        Dim coincidencias As MatchCollection
        Dim palabra As Match
        Try
            Dim cadenaabuscar As New Regex(textoabuscar.ToString, RegexOptions.IgnoreCase)
            coincidencias = cadenaabuscar.Matches(objetotexto.Text)
            With objetotexto
                .SelectAll()
                .SelectionColor = Color.Black
            End With

            For Each palabra In coincidencias
                With objetotexto
                    .SelectionStart = palabra.Index
                    .SelectionLength = palabra.Length
                    .SelectionColor = colortexto
                    .SelectionBackColor = colorfondo
                End With
            Next
            'menu

        Catch ex As Exception
            MsgBox(ex.Message.ToString)
        End Try


    End Sub




End Class
