Imports System.Data
Imports System.Data.OleDb


'tbcuentas | Numero_Cuenta | Saldo | Saldo_inicial |
'tbdatos   | Numero_Cuenta | Nombre | Direccion | Telefono |

Public Class Form1

    Inherits Windows.Forms.Form

    Dim OConexion As New OleDbConnection()
    Dim var_conexion = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=" & Application.StartupPath & "\dbbanco.accdb;"
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        OConexion.ConnectionString = var_conexion
        OConexion.Open()
        MsgBox("Conexion establecida")

    End Sub

    Private Sub btnBuscar_Click(sender As Object, e As EventArgs) Handles btnBuscar.Click

        Dim numeroCuenta As Integer = Val(tbNumCuenta.Text)
        Dim sql1 As String = "SELECT * FROM tbcuentas WHERE Numero_Cuenta = @A;"
        Dim sql2 As String = "SELECT * FROM tbdatos WHERE Numero_Cuenta = @A;"
        Dim comando1 = New OleDbCommand(sql1, OConexion)
        comando1.Parameters.AddWithValue("@A", numeroCuenta)
        Dim odataReader As OleDbDataReader
        odataReader = comando1.ExecuteReader

        If (odataReader.Read()) Then
            'tbNombre = odataReader("Nombre")
            'tbSalInicial.Text = odataReader("Saldo")
            tbActual.Text = odataReader("Saldo")
        End If

        Dim comando2 = New OleDbCommand(sql2, OConexion)
        comando2.Parameters.AddWithValue("@A", numeroCuenta)
        Dim odataReader2 As OleDbDataReader
        odataReader2 = comando2.ExecuteReader

        If (odataReader2.Read()) Then
            tbNombre.Text = odataReader2("Nombre")
        Else
            MsgBox("Usuario no encontrado")
        End If

    End Sub

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click

        Menu_principal.Show()
        Me.Hide()

    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs)
        tbNumCuenta.Clear()
        tbNombre.Clear()
        tbSalInicial.Clear()
        tbActual.Clear()
    End Sub

    Private Sub btnPago_Click(sender As Object, e As EventArgs) Handles btnPago.Click

        Dim numCuenta As String = tbNumCuenta.Text
        Dim pago As String = Val(InputBox("Cuanto quieres pagar?", "Nuevo pago", "0"))
        Dim sql As String = "UPDATE tbcuentas set Saldo = Saldo - @p WHERE Numero_cuenta = @c"
        Dim OLEcomando = New OleDbCommand(sql, OConexion)
        OLEcomando.Parameters.AddWithValue("@p", pago)
        OLEcomando.Parameters.AddWithValue("c", numCuenta)
        OLEcomando.ExecuteNonQuery()

        MsgBox("Pago realizado correctamente!")

    End Sub

    Private Sub btnIngreso_Click(sender As Object, e As EventArgs) Handles btnIngreso.Click

        Dim ingreso As String = Val(InputBox("Cuanto quieres ingresar?", "Nuevo ingreso", "0"))
        Dim numCuenta = tbNumCuenta.Text
        Dim sql As String = "UPDATE tbcuentas set Saldo = Saldo + @i where Numero_Cuenta = @c;"
        Dim bcomando = New OleDbCommand(sql, OConexion)
        bcomando.Parameters.AddWithValue("@i", ingreso)
        bcomando.Parameters.AddWithValue("@c", numCuenta)
        bcomando.ExecuteNonQuery()

        MsgBox("Ingreso realizado correctamente!")

    End Sub

    Private Sub tbnBack_Click(sender As Object, e As EventArgs)

        gestion.Show()
        Me.Hide()

    End Sub
End Class