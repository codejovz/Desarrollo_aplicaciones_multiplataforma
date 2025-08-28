Public Class Form1

    Dim tablaElementos(19) As Integer

    Dim lleno = 0
    'Matrices
    'Dim nombreTabla (dimension, empieza por 0. si se le pone nueve llega al nueve) As tipo  
    'Dim tbNombres(9)As String*20
    'Dim tbNombres() As String = {"Pepe", "Juan"}
    'Dim tbEdades(5,5) As Integer 
    'tbNombres (0) = "Pepe"
    'tbEdades (0) = 24
    'Redim hace una tabla con dimensiones variables

    Dim cont As Integer = 0

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles btnMenos.Click

        If cont > 0 Then
            cont = cont - 1
        End If

        tbElemento.Text = cont

    End Sub

    Private Sub btnMas_Click(sender As Object, e As EventArgs) Handles btnMas.Click

        If cont < 19 Then
            cont = cont + 1
        End If

        tbElemento.Text = cont

    End Sub

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click

        Close()

    End Sub


    Private Sub btnAceptar_Click(sender As Object, e As EventArgs) Handles btnAceptar.Click

        If tbElemento.Text <> Nothing AndAlso tbValor.Text <> Nothing Then

            Dim nuevoElemento As Integer = CInt(tbValor.Text)
            tablaElementos(CInt(tbElemento.Text)) = nuevoElemento
            lleno = lleno + 1

            Dim cont As Integer = 0

        Else
            MessageBox.Show("Algun campo vacio", "ERROR", MessageBoxButtons.OK, MessageBoxIcon.Warning)

        End If

    End Sub



    Private Sub btnVisualizar_Click(sender As Object, e As EventArgs) Handles btnVisualizar.Click

        Dim todoJunto As String = ""

        For i = 0 To 19
            todoJunto = todoJunto + Str(tablaElementos(i)) + vbCrLf
        Next

        tbTodo.Text = todoJunto


    End Sub
End Class
