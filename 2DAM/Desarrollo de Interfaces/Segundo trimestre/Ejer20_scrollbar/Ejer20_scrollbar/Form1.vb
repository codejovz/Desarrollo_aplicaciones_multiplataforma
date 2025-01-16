Public Class Form1

    Private Sub HSS_Scroll(sender As Object, e As ScrollEventArgs) Handles HSS.Scroll
        Dim anchura As Integer = HSS.Value
        pcPais.Width = anchura
    End Sub

    Private Sub VSS_Scroll(sender As Object, e As ScrollEventArgs) Handles VSS.Scroll
        Dim altura As Integer = VSS.Value
        pcPais.Height = altura
    End Sub

End Class
