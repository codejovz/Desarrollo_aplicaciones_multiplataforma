' Importar clases y objetos.
Imports System.Data
Imports System.Data.OleDb 'accesMicrosoft

Public Class Form1

    Dim allNames As String = ""
    Dim allPhones As String = ""
    Dim allDirections As String = ""

    Dim OConexion As New OleDbConnection()  ' Crear objeto conexión:
    Dim var_conexion = "Provider=Microsoft.Jet.OLEDB.4.0;Data Source=" & Application.StartupPath & "\dbempresas.mdb;"

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        OConexion.ConnectionString = var_conexion 'cadena de conexión; proveedor y donde esta

    End Sub


    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click

        lbDireccion.Items.Clear()
        lbNombre.Items.Clear()
        lbTelefono.Items.Clear()

        Dim OComando = New OleDbCommand("select * FROM tbempresas", OConexion)
        Dim odatareader As OleDbDataReader

        odatareader = OComando.ExecuteReader

        While odatareader.Read

            lbNombre.Items.Add(odatareader("nombre"))
            lbDireccion.Items.Add(odatareader("direccion"))
            lbTelefono.Items.Add(odatareader("telefono"))
            'odatareader.Read()

        End While

    End Sub

    Private Sub btnSalir_Click(sender As Object, e As EventArgs) Handles btnSalir.Click
        OConexion.Close()
        Me.Close()
    End Sub


    Private Sub btnConectar_Click(sender As Object, e As EventArgs) Handles btnConectar.Click
        OConexion.Open()
        MsgBox("Conectado!")

        btnAlta.Enabled = True
        Button1.Enabled = True
        btnBuscar.Enabled = True
        btnAlta.Enabled = True
        btnBaja.Enabled = True

    End Sub


    Private Sub btnAlta_Click(sender As Object, e As EventArgs) Handles btnAlta.Click
        Dim nombre = "pedro"
        Dim icomando = New OleDbCommand("INSERT INTO tbempresas (nombre, direccion, telefono) VALUES (@A, 'general 233', '8888')", OConexion)
        icomando.Parameters.AddWithValue("@A", nombre)
        'OConexion.Open()
        icomando.ExecuteNonQuery() 'actualizacion: insert | delete | update
        MsgBox("Usuario insertado!")

    End Sub

    Private Sub btnBuscar_Click(sender As Object, e As EventArgs) Handles btnBuscar.Click
        Dim nombre As String = "jorge"
        Dim bcomando = New OleDbCommand("SELECT * FROM tbempresas WHERE nombre = '" & nombre & "'", OConexion)
        Dim odatareader As OleDbDataReader
        odatareader = bcomando.ExecuteReader
        If (odatareader.Read()) Then
            MsgBox("Usuario " & nombre & " encontrado")
            tbNombre.Text = odatareader("nombre")
            tbDireccion.Text = odatareader("direccion")
            tbTelefono.Text = odatareader("telefono")
        Else
            MsgBox("No existe")
        End If


    End Sub

    Private Sub btnBaja_Click(sender As Object, e As EventArgs) Handles btnBaja.Click

        Dim nombre As String = "pedro"
        Dim bcomando = New OleDbCommand("DELETE * FROM tbempresas WHERE nombre = '" & nombre & "'", OConexion)
        bcomando.ExecuteNonQuery()

        MsgBox("Usuario " & nombre & " eliminado correctamente!")


    End Sub
End Class
