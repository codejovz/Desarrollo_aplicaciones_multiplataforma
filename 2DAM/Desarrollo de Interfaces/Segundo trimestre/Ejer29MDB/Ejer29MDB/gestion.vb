Imports System.Data
Imports System.Data.OleDb

Public Class gestion

    Inherits Windows.Forms.Form

    Dim OConexion As New OleDbConnection()
    Dim var_conexion = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" & Application.StartupPath & "\dbbanco.accdb;"

    Private Sub gestion_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        OConexion.ConnectionString = var_conexion
        OConexion.Open()
        MsgBox("Conexion establecida")
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click

        Dim numCuenta As Integer = Val(tbCuenta2.Text())
        Dim nombre As String = tbNombre2.Text()
        Dim direccion As String = tbDir2.Text()
        Dim telefono As String = tbTel2.Text()

        Dim sql1 As String = "INSERT INTO tbcuentas (Numero_Cuenta) VALUES (@C); "
        Dim sql2 As String = "INSERT INTO tbdatos (Numero_Cuenta, Nombre, Direccion, Telefono) VALUES (@C, @N, @D, @T); "

        Dim comando1 = New OleDbCommand(sql1, OConexion)
        comando1.Parameters.AddWithValue("@C", numCuenta)
        comando1.ExecuteNonQuery()

        Dim comando2 = New OleDbCommand(sql2, OConexion)
        comando2.Parameters.AddWithValue("@C", numCuenta)
        comando2.Parameters.AddWithValue("@N", nombre)
        comando2.Parameters.AddWithValue("@D", direccion)
        comando2.Parameters.AddWithValue("@T", telefono)
        comando2.ExecuteNonQuery()

        MsgBox("Usuario '" & nombre & "' insertado!")


    End Sub


    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Menu_principal.Show()
        Me.Hide()
    End Sub


End Class