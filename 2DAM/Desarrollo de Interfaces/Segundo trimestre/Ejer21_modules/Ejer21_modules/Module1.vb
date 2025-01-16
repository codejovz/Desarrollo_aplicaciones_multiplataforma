Module Module1
    Public formula1 As New Form1()
    Public formula2 As New Form2()

    Public variale As Date = Now
    Public valor As String

    Sub fecha()

        valor = Format(variale, "dd/mm/yy")
        frmdatos.txtfecha.Visible = True
        frmdatos.txthora.Visible = True
        frmdatos.txtfecha.Text = valor

    End Sub

    Sub hora()

        valor = Format(variale, "h:m:s")
        frmdatos.txtfecha.Visible = True
        frmdatos.txthora.Visible = True
        frmdatos.txthora.Text = valor

    End Sub



End Module

