Public Class Form1

    Private Sub btnAnadir_Click(sender As Object, e As EventArgs) Handles btnAnadir.Click

        Dim nombre As String = tbNombre.Text()
        Dim optativa As String = cbAsignaturas.Text()

        lbAlumno.Items.Add(nombre)
        lbOptativa.Items.Add(optativa)
        cbAsignaturas.Items.Add(optativa)

    End Sub

    Private Sub btnVaciar_Click(sender As Object, e As EventArgs) Handles btnVaciar.Click
        lbAlumno.Items.Clear()
        lbOptativa.Items.Clear()
        cbAsignaturas.Text() = Nothing
    End Sub

    Private Sub btnFin_Click(sender As Object, e As EventArgs) Handles btnFin.Click
        Close()
    End Sub

    Private Sub btnEliminar_Click(sender As Object, e As EventArgs) Handles btnEliminar.Click

        Dim nombre As Integer = lbAlumno.SelectedIndex
        Dim optativa As Integer = lbOptativa.SelectedIndex

        If nombre = -1 And lbAlumno.Items.Count <> 0 Then
            lbAlumno.Items.RemoveAt(0)
            lbOptativa.Items.RemoveAt(0)

        End If


        For a As Integer = 0 To lbAlumno.Items.Count() - 1
            Dim nombre1 As Integer = lbAlumno.SelectedIndex

            If nombre1 <> -1 Then
                lbAlumno.Items.RemoveAt(nombre1)
                lbOptativa.Items.RemoveAt(nombre1)
            End If

        Next






    End Sub

    Private Sub lbAlumno_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lbAlumno.SelectedIndexChanged

        lbOptativa.SelectedIndex = lbAlumno.SelectedIndex
    End Sub

    Private Sub lbOptativa_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lbOptativa.SelectedIndexChanged
        lbAlumno.SelectedIndex = lbOptativa.SelectedIndex
    End Sub




End Class
