Imports System.IO
Public Class Form1
    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click

        Dim archivo As String
        Dim mysaveFile As New SaveFileDialog
        mysaveFile.ShowDialog()
        archivo = mysaveFile.FileName

        If mysaveFile.FileName <> "" Then

            RichTextBox1.SaveFile(mysaveFile.FileName, RichTextBoxStreamType.PlainText)

        End If


    End Sub
End Class
