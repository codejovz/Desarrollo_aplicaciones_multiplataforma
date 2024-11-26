Public Class Form1
    'Con selection mode deja elegir varias opciones a la vez



    Dim seleccionado As String = Nothing
    Dim tablaSeleccionada As Integer = 0

    Private Sub lbPrimera_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lbPrimera.SelectedIndexChanged

        If lbPrimera.SelectedIndex <> -1 Then
            seleccionado = lbPrimera.SelectedItem
            tablaSeleccionada = 1
            btnIzquierda.Enabled = False
            btnDerecha.Enabled = True
            btnAbajo.Enabled = True
            lbSegunda.SelectedIndex = -1
            lbTercera.SelectedIndex = -1
        End If

    End Sub

    Private Sub lbSegunda_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lbSegunda.SelectedIndexChanged
        If lbSegunda.SelectedIndex <> -1 Then
            seleccionado = lbSegunda.SelectedItem
            tablaSeleccionada = 2
            btnIzquierda.Enabled = True
            btnDerecha.Enabled = False
            btnAbajo.Enabled = True
            lbPrimera.SelectedIndex = -1
            lbTercera.SelectedIndex = -1
        End If

    End Sub

    Private Sub lbTercera_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lbTercera.SelectedIndexChanged
        If lbTercera.SelectedIndex <> -1 Then
            seleccionado = lbTercera.SelectedItem
            tablaSeleccionada = 3
            btnIzquierda.Enabled = True
            btnDerecha.Enabled = True
            btnAbajo.Enabled = False
            lbPrimera.SelectedIndex = -1
            lbSegunda.SelectedIndex = -1
        End If
    End Sub

    Private Sub btnDerecha_Click(sender As Object, e As EventArgs) Handles btnDerecha.Click
        lbSegunda.Items.Add(seleccionado)
        Select Case tablaSeleccionada
            Case 1
                lbPrimera.Items.Remove(seleccionado)
            Case 2
                lbSegunda.Items.Remove(seleccionado)
            Case 3
                lbTercera.Items.Remove(seleccionado)
        End Select

    End Sub

    Private Sub btnIzquierda_Click(sender As Object, e As EventArgs) Handles btnIzquierda.Click
        lbPrimera.Items.Add(seleccionado)
        Select Case tablaSeleccionada
            Case 1
                lbPrimera.Items.Remove(seleccionado)
            Case 2
                lbSegunda.Items.Remove(seleccionado)
            Case 3
                lbTercera.Items.Remove(seleccionado)
        End Select
    End Sub

    Private Sub btnAbajo_Click(sender As Object, e As EventArgs) Handles btnAbajo.Click
        lbTercera.Items.Add(seleccionado)
        Select Case tablaSeleccionada
            Case 1
                lbPrimera.Items.Remove(seleccionado)
            Case 2
                lbSegunda.Items.Remove(seleccionado)
            Case 3
                lbTercera.Items.Remove(seleccionado)
        End Select
    End Sub
End Class
