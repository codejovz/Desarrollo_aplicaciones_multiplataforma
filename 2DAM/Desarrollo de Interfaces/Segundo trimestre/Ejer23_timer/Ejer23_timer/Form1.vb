Public Class Form1

    Dim horaIntroducida As String

    Private Sub btnSetAlarma_Click(sender As Object, e As EventArgs) Handles btnSetAlarma.Click

        horaIntroducida = TextBox1.Text
        Timer1.Start()



    End Sub

    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick

        Dim ahora As Date = Now

        Dim horaActual As String = Format(ahora, "hh:mm:ss")

        'MsgBox(horaActual & " - " & horaIntroducida)
        Label2.Text = horaActual & " - " & horaIntroducida

        If horaIntroducida = horaActual Then

            Dim resultado As DialogResult = MessageBox.Show("Estaba puesta a las " & horaIntroducida, "Timer terminado", MessageBoxButtons.OK, MessageBoxIcon.Exclamation)

        End If


    End Sub
End Class
