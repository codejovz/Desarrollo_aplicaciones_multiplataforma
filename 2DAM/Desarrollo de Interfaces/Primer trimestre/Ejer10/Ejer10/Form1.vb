Public Class Form1

    'Estructura

    Private Structure cuenta
        Dim numero As Integer
        Dim nombre As String
        Dim saldoInicial As Double
        Dim saldoActual As Double
    End Structure

    Dim TBcuentas(1) As cuenta
    Dim NCuenta As Integer
    Dim existe As Boolean

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        Close()
    End Sub

    Private Sub btnCliente_Click(sender As Object, e As EventArgs) Handles btnCliente.Click
        existe = False
        NCuenta = tbCuenta.Text()

        tbNombre.Enabled = True
        tbSinicial.Enabled = True
        tbSactual.Enabled = True

        For i = 0 To 1
            If NCuenta = TBcuentas(i).numero Then
                tbNombre.Text = TBcuentas(i).nombre
                tbSinicial.Text = TBcuentas(i).saldoInicial
                tbSactual.Text = TBcuentas(i).saldoActual
                existe = True
            End If
        Next

        If existe = False Then
            MsgBox("No existe esta cuenta")
            tbNombre.Text = Nothing
            tbSinicial.Text = Nothing
            tbSactual.Text = Nothing
        End If

    End Sub

    Private Sub btnCargar_Click(sender As Object, e As EventArgs) Handles btnCargar.Click

        For i = 0 To 1

            NCuenta = i
            Dim IDcuenta As String = CStr(InputBox("Introduce su ID", "bancomatriz"))
            Dim nombre As String = CStr(InputBox("Introduce su nombre", "bancomatriz"))
            Dim saldoInicial As Double = CDbl(InputBox("Introduce su saldo inicial", "bancomatriz"))

            TBcuentas(NCuenta).numero = IDcuenta
            TBcuentas(NCuenta).nombre = nombre
            TBcuentas(NCuenta).saldoInicial = saldoInicial
            TBcuentas(NCuenta).saldoActual = saldoInicial

        Next

        tbCuenta.Enabled = True
        btnCliente.Enabled = True
        btnIngreso.Enabled = True
        btnPago.Enabled = True

    End Sub

    Private Sub btnIngreso_Click(sender As Object, e As EventArgs) Handles btnIngreso.Click

        NCuenta = CInt(InputBox("Introduce numero de cuenta", "bancomatriz"))
        Dim suma = CDbl(InputBox("Cuanto dinero quieres meter?", "bancomatriz"))

        TBcuentas(NCuenta).saldoActual = TBcuentas(NCuenta).saldoActual + suma

    End Sub

    Private Sub btnPago_Click(sender As Object, e As EventArgs) Handles btnPago.Click

        NCuenta = CInt(InputBox("Introduce numero de cuenta", "bancomatriz"))
        Dim resta = CDbl(InputBox("Cuanto dinero quieres sacar?", "bancomatriz"))

        TBcuentas(NCuenta).saldoActual = TBcuentas(NCuenta).saldoActual - resta

    End Sub

    Private Sub tbCuenta_KeyDown(sender As Object, e As KeyEventArgs) Handles tbCuenta.KeyDown


        If e.KeyCode = Keys.Enter Then

            existe = False
            NCuenta = tbCuenta.Text()

            tbNombre.Enabled = True
            tbSinicial.Enabled = True
            tbSactual.Enabled = True

            For i = 0 To 1
                If NCuenta = TBcuentas(i).numero Then
                    tbNombre.Text = TBcuentas(i).nombre
                    tbSinicial.Text = TBcuentas(i).saldoInicial
                    tbSactual.Text = TBcuentas(i).saldoActual
                    existe = True
                End If
            Next

            If existe = False Then
                MsgBox("No existe esta cuenta")
                tbNombre.Text = Nothing
                tbSinicial.Text = Nothing
                tbSactual.Text = Nothing
            End If

            tbCuenta.Text = ""

        End If

    End Sub
End Class
