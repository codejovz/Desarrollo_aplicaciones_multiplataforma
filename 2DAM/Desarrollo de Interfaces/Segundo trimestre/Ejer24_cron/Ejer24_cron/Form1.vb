Public Class Form1

    Dim decHora As Integer = 0
    Dim hora As Integer = 0
    Dim decMin As Integer = 0
    Dim min As Integer = 0
    Dim decSeg As Integer = 0
    Dim seg As Integer = 0




    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick

        seg = seg + 1

        If seg = 10 Then
            seg = 0
            decSeg = decSeg + 1
        End If

        If decSeg = 60 Then
            decSeg = 0
            min = min + 1
        End If

        If min = 10 Then
            min = 0
            decMin = decMin + 1
        End If

        If decMin = 60 Then
            decMin = 0
            hora = hora + 1
        End If

        If hora = 10 Then
            hora = 0
            decHora = decHora + 1
        End If

        labelTime.Text = decHora & hora & ":" & decMin & min & ":" & decSeg & seg




    End Sub

    Private Sub btnStart_Click(sender As Object, e As EventArgs) Handles btnStart.Click
        Timer1.Start()
    End Sub

    Private Sub btnStop_Click(sender As Object, e As EventArgs) Handles btnStop.Click
        Timer1.Stop()
    End Sub

    Private Sub btnReset_Click(sender As Object, e As EventArgs) Handles btnReset.Click

        decHora = 0
        hora = 0
        decMin = 0
        min = 0
        decSeg = 0
        seg = 0

    End Sub

    Private Sub btnAdd_Click(sender As Object, e As EventArgs) Handles btnAdd.Click

        lb1.Items.Add(decHora & hora & ":" & decMin & min & ":" & decSeg & seg)


    End Sub

    Private Sub Button4_Click(sender As Object, e As EventArgs) Handles Button4.Click
        lb1.Items.Clear()
    End Sub
End Class
