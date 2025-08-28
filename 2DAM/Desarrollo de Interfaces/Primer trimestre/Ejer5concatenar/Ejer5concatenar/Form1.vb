Public Class Form1

    'Format
    'valor = 30
    'aplica el formato DESPUES de que le des algo, para devolvertelo formateado
    'caja.Text = Format(valor,"#0,0.0")
    'si lo hay, pones un decimal, una unidad, y una decena
    'la almohadilla es opcional. si pobnes solo un 0 es obligatorio, si no lo hay te va a poner un 0
    'valor = 32712,27
    '"####0,0
    '32712,27
    ' se concatena con un &
    'Formato = "###,##0.0"
    'txt.caja.Text= Format(valor, Formato)
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles btnCalcular.Click

        tbSuma.Text = Nothing
        tbMensual = Nothing

        If (tbCapital.Text = "") Then
            MsgBox("Inserta el capital")
        End If

        If (tbIntereses.Text = "") Then
            MsgBox("Inserta los intereses")
        End If

        If (tbAnos.Text = "") Then
            MsgBox("Inserta los años")
        End If

        Try

            Dim Capital As Double = tbCapital.Text
            Dim Intereses As Double = tbIntereses.Text
            Dim Years As Integer = tbAnos.Text
            Dim Cuota As Double

            Dim total = Capital + (Capital * (Intereses / 100) * Years)


            Dim mensajeTotal As String = "Capital acumulado después de: " + " años " + Str(total)

            tbSuma.Text = mensajeTotal
            Dim cuotaMensual As String = Str((total - Capital) / Years / 12)
            Dim formato As String = "####"

            MsgBox(Format(CDbl(cuotaMensual), formato))


        Catch ex As Exception
            MsgBox("ERROR")
            Close()
        End Try




    End Sub

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click

        Close()

    End Sub

    Private Sub btnBorrar_Click(sender As Object, e As EventArgs) Handles btnBorrar.Click

        tbCapital.Text = Nothing
        tbIntereses.Text = Nothing
        tbAnos.Text = Nothing
        tbSuma.Text = Nothing
        'tbMensual.Text = ""

    End Sub
End Class
