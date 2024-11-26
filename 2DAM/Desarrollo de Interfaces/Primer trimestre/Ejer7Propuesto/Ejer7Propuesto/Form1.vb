Public Class Form1
    'for - next y loop while
    Dim concepto As String
    Dim cant As Integer
    Dim pu As Double 'Inicializo las variables en global para llamarlas despues
    Dim dto As Integer
    Dim pvp As Double
    Private Sub tbPU_KeyDown(sender As Object, e As KeyEventArgs) Handles tbPU.KeyDown
        If e.KeyCode = Keys.Enter Then
            concepto = tbConcepto.Text
            cant = CInt(tbCant.Text)
            pu = CDbl(tbPU.Text)

            Select Case cant 'Segun la cantidad que se escoja, cambia el descuento
                Case 0 To 1
                    dto = 0
                Case 2, 3
                    dto = 3
                Case 4 To 7
                    dto = 7
                Case Is > 7
                    dto = 15
            End Select

            tbDTO.Text = Str(dto) + "%"   'Se le añade un % al descuento y se pone en el tbDTO

            pvp = cant * pu

            tbPVP.Text = Str(pvp)

        End If
    End Sub


    Private Sub btnTotal_Click(sender As Object, e As EventArgs) Handles btnTotal.Click
        'Al dar al boton Total, lo calcula restandole al pvp su descuento correspondiente
        Dim total As Double = pvp - (pvp * (dto / 100))
        tbTotal.Text = Str(total)

    End Sub
    Private Sub btnNuevo_Click(sender As Object, e As EventArgs) Handles btnNuevo.Click
        'Borra el contenido de todos los cmapos de texto
        tbConcepto.Text = Nothing
        tbCant.Text = Nothing
        tbPU.Text = Nothing
        tbDTO.Text = Nothing
        tbPVP.Text = Nothing
        tbTotal.Text = Nothing

    End Sub

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        Close() 'Cierra la aplicacion
    End Sub

    Private Sub tbConcepto_KeyDown(sender As Object, e As KeyEventArgs) Handles tbConcepto.KeyDown
        If e.KeyCode = Keys.Enter Then
            tbCant.Focus()   'Pasa de textBox en textBox pulsando Enter
        End If
    End Sub

    Private Sub tbCant_KeyDown(sender As Object, e As KeyEventArgs) Handles tbCant.KeyDown
        If e.KeyCode = Keys.Enter Then
            tbPU.Focus()
        End If
    End Sub

    'Matrices
    'Dim nombreTabla (dimension, empieza por 0. si se le pone nueve llega al nueve) As tipo  
    'Dim tbNombres(9)As String*20
    'Dim tbNombres() As String = {"Pepe", "Juan"}
    'Dim tbEdades(5,5) As Integer 
    'tbNombres (0) = "Pepe"
    'tbEdades (0) = 24
    'Redim hace una tabla con dimensiones variables



End Class
