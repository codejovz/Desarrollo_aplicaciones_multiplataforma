Public Class Form1

    Private Const cuenta1 As Integer = 1
    Private saldoInicial1 As Double = 0.0
    Private saldoTotal1 As Double = 0.0


    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        Const constante As Integer = 1

        'evento keydown  
        'ponemos el evento key press 
        ' if e.keycode = intro Then
        'Dim pago as String = 
        'InputBox("Dame dinero" "Pagos" "1000")  sale aceptar y cancelar.


    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        Close()
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click

        tbCuenta.Text = Nothing
        tbSaldoActual.Text = Nothing
        tbSaldoInicial.Text = Nothing


    End Sub


    Private Sub tbCuenta_KeyDown(sender As Object, e As KeyEventArgs) Handles tbCuenta.KeyDown
        If e.KeyCode = Keys.Enter AndAlso CInt(tbCuenta.Text) = cuenta1 Then

            tbSaldoActual.Enabled = True
            tbSaldoInicial.Enabled = True
            tbSaldoInicial.Text = Str(saldoInicial1)
            btnPago.Enabled = True
            btnIngreso.Enabled = True

            Dim valor As String = InputBox("Dame dinero", "Cambiar dinero", "10000")

            Dim valorDouble = CDbl(valor)

            tbSaldoActual.Text = Str(saldoTotal1 + valorDouble)
            saldoTotal1 = saldoTotal1 + valorDouble
        Else
            tbSaldoActual.Enabled = False
            tbSaldoInicial.Enabled = False
        End If

    End Sub

    Private Sub btnPago_Click(sender As Object, e As EventArgs) Handles btnPago.Click

        Dim valor As String = InputBox("Cuanto?", "Retirar dinero", "0")

        saldoTotal1 = saldoTotal1 - CDbl(valor)
        tbSaldoActual.Text = Str(saldoTotal1)

    End Sub

    Private Sub btnIngreso_Click(sender As Object, e As EventArgs) Handles btnIngreso.Click

        Dim valor As String = InputBox("Cuanto?", "Ingresar dinero", "0")

        saldoTotal1 = saldoTotal1 + CDbl(valor)
        tbSaldoActual.Text = Str(saldoTotal1)

    End Sub
End Class
