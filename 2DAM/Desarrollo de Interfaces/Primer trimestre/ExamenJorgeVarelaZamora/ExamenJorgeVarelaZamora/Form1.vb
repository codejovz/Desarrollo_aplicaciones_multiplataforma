Public Class Form1

    Dim seleccionado As Integer = -1

    Dim Cartones As Integer = 1

    Private Structure Marca
        Dim Marca As String
        Dim NumeroCig As Integer
        Dim Precio As Integer
        Dim Nicotina As Integer
        Dim Promocion As Integer
    End Structure

    Dim tbMarcas(3) As Marca



    Private Structure Pedido
        Dim Tabaquera As String
        Dim Marca As String
        Dim NumeroCig As Integer
        Dim Precio As Integer
        Dim Nicotina As Integer
        Dim Promocion As Integer
        Dim Cartones As Boolean
        Dim Compra As Integer
    End Structure

    Dim tbPedidos(20) As Pedido

    Dim numPedido As Integer = 0



    Private Sub cbTabaqueras_SelectedIndexChanged(sender As Object, e As EventArgs) Handles cbTabaqueras.SelectedIndexChanged

        Dim indice As Integer = cbTabaqueras.SelectedIndex

        If indice <> -1 Then
            lbMarcas.Items.Clear()

            Select Case indice ' Suponemos que cada empresa tiene tabacos diferentes
                Case 0
                    lbMarcas.Items.Add("Fortuna")
                    lbMarcas.Items.Add("Ducados")
                    lbMarcas.Items.Add("Camel")
                    lbMarcas.Items.Add("Malboro")
                Case 1
                    lbMarcas.Items.Add("Ducados")
                    lbMarcas.Items.Add("Camel")
                Case 2
                    lbMarcas.Items.Add("Camel")
                    lbMarcas.Items.Add("Malboro")
            End Select

        End If

        'Inicializo todas las marcas con sus caracteristicas:


        tbMarcas(0).Marca = "Fortuna"
        tbMarcas(0).NumeroCig = 2
        tbMarcas(0).Precio = 5
        tbMarcas(0).Nicotina = 20
        tbMarcas(0).Promocion = 20

        tbMarcas(1).Marca = "Ducados"
        tbMarcas(1).NumeroCig = 22
        tbMarcas(1).Precio = 6
        tbMarcas(1).Nicotina = 10
        tbMarcas(1).Promocion = 20

        tbMarcas(2).Marca = "Camel"
        tbMarcas(2).NumeroCig = 21
        tbMarcas(2).Precio = 4
        tbMarcas(2).Nicotina = 11
        tbMarcas(2).Promocion = 20

        tbMarcas(3).Marca = "Malboro"
        tbMarcas(3).NumeroCig = 20
        tbMarcas(3).Precio = 3
        tbMarcas(3).Nicotina = 45
        tbMarcas(3).Promocion = 20



    End Sub

    Private Sub lbMarcas_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lbMarcas.SelectedIndexChanged

        Dim indice As Integer = lbMarcas.SelectedIndex

        Dim marca As String

        If indice <> -1 Then

            marca = lbMarcas.SelectedItem

            Select Case marca
                Case "Fortuna"
                    PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Images/FORTUNA.jpg")
                    tbNumeros.Text = tbMarcas(0).NumeroCig
                    tbPrecio.Text = tbMarcas(0).Precio
                    tbNicotina.Text = tbMarcas(0).Nicotina
                    tbPromocion.Text = Str(tbMarcas(0).Promocion) & "% descuento"
                    seleccionado = 0

                Case "Ducados"
                    PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Images/DUCADOS.jpg")
                    tbNumeros.Text = tbMarcas(1).NumeroCig
                    tbPrecio.Text = tbMarcas(1).Precio
                    tbNicotina.Text = tbMarcas(1).Nicotina
                    tbPromocion.Text = Str(tbMarcas(1).Promocion) & "% descuento"
                    seleccionado = 1
                Case "Camel"
                    PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Images/CAMEL.jpg")
                    tbNumeros.Text = tbMarcas(2).NumeroCig
                    tbPrecio.Text = tbMarcas(2).Precio
                    tbNicotina.Text = tbMarcas(2).Nicotina
                    tbPromocion.Text = Str(tbMarcas(2).Promocion) & "% descuento"
                    seleccionado = 2
                Case "Malboro"
                    PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Images/MALBORO.jpg")
                    tbNumeros.Text = tbMarcas(3).NumeroCig
                    tbPrecio.Text = tbMarcas(3).Precio
                    tbNicotina.Text = tbMarcas(3).Nicotina
                    tbPromocion.Text = Str(tbMarcas(3).Promocion) & "% descuento"
                    seleccionado = 3
            End Select

        End If

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click

        Dim total As Integer

        If NumUpDn.Value <> 0 AndAlso seleccionado <> -1 Then 'Controla que se pida uno y que haya marca seleccionada

            Dim precio As Integer = tbMarcas(seleccionado).Precio - (tbMarcas(seleccionado).Precio * (tbMarcas(seleccionado).Promocion / 100)) * NumUpDn.Value * Cartones


            Dim resultado As DialogResult = MessageBox.Show("EL TOTAL ES...." & precio, "EXAMEN_1EVA_2DAM_2...", MessageBoxButtons.OK)


            tbPedidos(numPedido).Tabaquera = cbTabaqueras.Text
            tbPedidos(numPedido).Marca = tbMarcas(numPedido).Marca
            tbPedidos(numPedido).NumeroCig = tbMarcas(numPedido).NumeroCig
            tbPedidos(numPedido).Precio = tbMarcas(numPedido).Precio
            tbPedidos(numPedido).Nicotina = tbMarcas(numPedido).Nicotina
            tbPedidos(numPedido).Promocion = tbMarcas(numPedido).Promocion
            tbPedidos(numPedido).Cartones = Cartones
            tbPedidos(numPedido).Compra = NumUpDn.Value

            lbPedidos.Items.Add(numPedido + 1) 'Inicializa a 1 como en la foto

            numPedido = numPedido + 1


        End If







    End Sub

    Private Sub CheckBox1_CheckedChanged(sender As Object, e As EventArgs) Handles CheckBox1.CheckedChanged

        If CheckBox1.Checked = True Then
            Cartones = 20
        End If

        If CheckBox1.Checked = False Then
            Cartones = 1
        End If

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click

        Dim indice As Integer = lbPedidos.SelectedIndex

        If indice <> -1 Then

            For cont = 0 To lbPedidos.Items.Count

                tbPedidos(indice).Tabaquera = tbPedidos(indice + 1).Tabaquera
                tbPedidos(indice).Marca = tbPedidos(indice + 1).Marca
                tbPedidos(indice).NumeroCig = tbPedidos(indice + 1).NumeroCig
                tbPedidos(indice).Precio = tbPedidos(indice + 1).Precio
                tbPedidos(indice).Nicotina = tbPedidos(indice + 1).Nicotina
                tbPedidos(indice).Promocion = tbPedidos(indice + 1).Promocion
                tbPedidos(indice).Cartones = tbPedidos(indice + 1).Cartones
                tbPedidos(indice).Compra = tbPedidos(indice + 1).Compra

            Next

            lbPedidos.Items.RemoveAt(indice)


        End If


    End Sub

    Private Sub lbPedidos_SelectedIndexChanged(sender As Object, e As EventArgs) Handles lbPedidos.SelectedIndexChanged

        Dim indice As Integer = lbPedidos.SelectedIndex

        If indice <> -1 Then


            cbTabaqueras.Text = tbPedidos(indice).Tabaquera

            lbMarcas.Text = tbPedidos(indice).Marca

            tbNumeros.Text = tbPedidos(indice).NumeroCig

            tbPrecio.Text = tbPedidos(indice).Precio & "% descuento"

            tbNicotina.Text = tbPedidos(indice).Nicotina


            tbPromocion.Text = tbPedidos(indice).Promocion

            If tbPedidos(indice).Cartones = 1 Then
                CheckBox1.Checked = False
            End If

            If tbPedidos(indice).Cartones = 20 Then
                CheckBox1.Checked = True
            End If


            NumUpDn.Value = tbPedidos(indice).Compra

            Select Case tbPedidos(indice).Marca
                Case "Fortuna"
                    PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Images/FORTUNA.jpg")
                    lbMarcas.SelectedIndex = 0
                Case "Ducados"
                    PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Images/DUCADOS.jpg")
                    lbMarcas.SelectedIndex = 1
                Case "Camel"
                    PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Images/CAMEL.jpg")
                    lbMarcas.SelectedIndex = 2
                Case "Malboro"
                    PictureBox1.Image = Image.FromFile(Application.StartupPath & "/Images/MALBORO.jpg")
                    lbMarcas.SelectedIndex = 3
            End Select



        End If



    End Sub
End Class
