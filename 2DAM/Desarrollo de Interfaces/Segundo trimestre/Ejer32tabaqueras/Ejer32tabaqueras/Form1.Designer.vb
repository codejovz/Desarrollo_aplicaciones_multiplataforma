<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
    'Se puede modificar usando el Diseñador de Windows Forms.  
    'No lo modifique con el editor de código.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.lbPedidos = New System.Windows.Forms.ListBox()
        Me.btnRealizarPedido = New System.Windows.Forms.Button()
        Me.btnBorrarPedido = New System.Windows.Forms.Button()
        Me.lbMarcas = New System.Windows.Forms.ListBox()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.cbTabaqueras = New System.Windows.Forms.ComboBox()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.Label9 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.tbPromocion = New System.Windows.Forms.TextBox()
        Me.tbPrecio = New System.Windows.Forms.TextBox()
        Me.tbNicotina = New System.Windows.Forms.TextBox()
        Me.tbNumCig = New System.Windows.Forms.TextBox()
        Me.GroupBox3 = New System.Windows.Forms.GroupBox()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.nudUnidades = New System.Windows.Forms.NumericUpDown()
        Me.ckCartones = New System.Windows.Forms.CheckBox()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.trallaNuevoPedido = New System.Windows.Forms.Button()
        Me.GroupBox1.SuspendLayout()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox2.SuspendLayout()
        Me.GroupBox3.SuspendLayout()
        CType(Me.nudUnidades, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'lbPedidos
        '
        Me.lbPedidos.FormattingEnabled = True
        Me.lbPedidos.ItemHeight = 16
        Me.lbPedidos.Location = New System.Drawing.Point(59, 268)
        Me.lbPedidos.Name = "lbPedidos"
        Me.lbPedidos.Size = New System.Drawing.Size(156, 132)
        Me.lbPedidos.TabIndex = 0
        '
        'btnRealizarPedido
        '
        Me.btnRealizarPedido.Location = New System.Drawing.Point(254, 268)
        Me.btnRealizarPedido.Name = "btnRealizarPedido"
        Me.btnRealizarPedido.Size = New System.Drawing.Size(190, 23)
        Me.btnRealizarPedido.TabIndex = 1
        Me.btnRealizarPedido.Text = "REALIZAR PEDIDOS"
        Me.btnRealizarPedido.UseVisualStyleBackColor = True
        '
        'btnBorrarPedido
        '
        Me.btnBorrarPedido.Location = New System.Drawing.Point(254, 316)
        Me.btnBorrarPedido.Name = "btnBorrarPedido"
        Me.btnBorrarPedido.Size = New System.Drawing.Size(190, 23)
        Me.btnBorrarPedido.TabIndex = 2
        Me.btnBorrarPedido.Text = "BORRAR PEDIDO"
        Me.btnBorrarPedido.UseVisualStyleBackColor = True
        '
        'lbMarcas
        '
        Me.lbMarcas.FormattingEnabled = True
        Me.lbMarcas.ItemHeight = 16
        Me.lbMarcas.Location = New System.Drawing.Point(188, 53)
        Me.lbMarcas.Name = "lbMarcas"
        Me.lbMarcas.Size = New System.Drawing.Size(156, 100)
        Me.lbMarcas.TabIndex = 3
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.PictureBox1)
        Me.GroupBox1.Controls.Add(Me.Label2)
        Me.GroupBox1.Controls.Add(Me.Label1)
        Me.GroupBox1.Controls.Add(Me.cbTabaqueras)
        Me.GroupBox1.Controls.Add(Me.lbMarcas)
        Me.GroupBox1.Location = New System.Drawing.Point(31, 48)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(488, 170)
        Me.GroupBox1.TabIndex = 4
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "PRODUCTO"
        '
        'PictureBox1
        '
        Me.PictureBox1.Location = New System.Drawing.Point(376, 48)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(100, 105)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 10
        Me.PictureBox1.TabStop = False
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(204, 27)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(65, 17)
        Me.Label2.TabIndex = 9
        Me.Label2.Text = "MARCAS"
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(25, 27)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(102, 17)
        Me.Label1.TabIndex = 8
        Me.Label1.Text = "TABAQUERAS"
        '
        'cbTabaqueras
        '
        Me.cbTabaqueras.FormattingEnabled = True
        Me.cbTabaqueras.Location = New System.Drawing.Point(6, 47)
        Me.cbTabaqueras.Name = "cbTabaqueras"
        Me.cbTabaqueras.Size = New System.Drawing.Size(129, 24)
        Me.cbTabaqueras.TabIndex = 7
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.Label9)
        Me.GroupBox2.Controls.Add(Me.Label6)
        Me.GroupBox2.Controls.Add(Me.Label5)
        Me.GroupBox2.Controls.Add(Me.Label4)
        Me.GroupBox2.Controls.Add(Me.Label3)
        Me.GroupBox2.Controls.Add(Me.tbPromocion)
        Me.GroupBox2.Controls.Add(Me.tbPrecio)
        Me.GroupBox2.Controls.Add(Me.tbNicotina)
        Me.GroupBox2.Controls.Add(Me.tbNumCig)
        Me.GroupBox2.Location = New System.Drawing.Point(541, 48)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(336, 170)
        Me.GroupBox2.TabIndex = 5
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "CARACTERISTICAS"
        '
        'Label9
        '
        Me.Label9.AutoSize = True
        Me.Label9.Location = New System.Drawing.Point(287, 112)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(20, 17)
        Me.Label9.TabIndex = 10
        Me.Label9.Text = "%"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(178, 89)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(93, 17)
        Me.Label6.TabIndex = 11
        Me.Label6.Text = "PROMOCION"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(14, 89)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(59, 17)
        Me.Label5.TabIndex = 10
        Me.Label5.Text = "PRECIO"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(178, 35)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(72, 17)
        Me.Label4.TabIndex = 9
        Me.Label4.Text = "NICOTINA"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(24, 33)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(118, 17)
        Me.Label3.TabIndex = 8
        Me.Label3.Text = "Nº CIGARRILLOS"
        '
        'tbPromocion
        '
        Me.tbPromocion.Location = New System.Drawing.Point(181, 109)
        Me.tbPromocion.Name = "tbPromocion"
        Me.tbPromocion.Size = New System.Drawing.Size(100, 22)
        Me.tbPromocion.TabIndex = 7
        Me.tbPromocion.TextAlign = System.Windows.Forms.HorizontalAlignment.Right
        '
        'tbPrecio
        '
        Me.tbPrecio.Location = New System.Drawing.Point(17, 109)
        Me.tbPrecio.Name = "tbPrecio"
        Me.tbPrecio.Size = New System.Drawing.Size(100, 22)
        Me.tbPrecio.TabIndex = 6
        '
        'tbNicotina
        '
        Me.tbNicotina.Location = New System.Drawing.Point(181, 55)
        Me.tbNicotina.Name = "tbNicotina"
        Me.tbNicotina.Size = New System.Drawing.Size(100, 22)
        Me.tbNicotina.TabIndex = 5
        '
        'tbNumCig
        '
        Me.tbNumCig.Location = New System.Drawing.Point(17, 55)
        Me.tbNumCig.Name = "tbNumCig"
        Me.tbNumCig.Size = New System.Drawing.Size(100, 22)
        Me.tbNumCig.TabIndex = 4
        '
        'GroupBox3
        '
        Me.GroupBox3.Controls.Add(Me.Label7)
        Me.GroupBox3.Controls.Add(Me.nudUnidades)
        Me.GroupBox3.Controls.Add(Me.ckCartones)
        Me.GroupBox3.Location = New System.Drawing.Point(919, 48)
        Me.GroupBox3.Name = "GroupBox3"
        Me.GroupBox3.Size = New System.Drawing.Size(265, 170)
        Me.GroupBox3.TabIndex = 6
        Me.GroupBox3.TabStop = False
        Me.GroupBox3.Text = "COMPRA"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(29, 98)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(78, 17)
        Me.Label7.TabIndex = 8
        Me.Label7.Text = "UNIDADES"
        '
        'nudUnidades
        '
        Me.nudUnidades.Location = New System.Drawing.Point(32, 73)
        Me.nudUnidades.Name = "nudUnidades"
        Me.nudUnidades.Size = New System.Drawing.Size(120, 22)
        Me.nudUnidades.TabIndex = 7
        '
        'ckCartones
        '
        Me.ckCartones.AutoSize = True
        Me.ckCartones.Location = New System.Drawing.Point(32, 31)
        Me.ckCartones.Name = "ckCartones"
        Me.ckCartones.Size = New System.Drawing.Size(106, 21)
        Me.ckCartones.TabIndex = 0
        Me.ckCartones.Text = "CARTONES"
        Me.ckCartones.UseVisualStyleBackColor = True
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(64, 239)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(69, 17)
        Me.Label8.TabIndex = 9
        Me.Label8.Text = "PEDIDOS"
        '
        'trallaNuevoPedido
        '
        Me.trallaNuevoPedido.Location = New System.Drawing.Point(557, 282)
        Me.trallaNuevoPedido.Name = "trallaNuevoPedido"
        Me.trallaNuevoPedido.Size = New System.Drawing.Size(594, 173)
        Me.trallaNuevoPedido.TabIndex = 10
        Me.trallaNuevoPedido.Text = "trallaNuevoPedido"
        Me.trallaNuevoPedido.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(1196, 497)
        Me.Controls.Add(Me.trallaNuevoPedido)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.GroupBox3)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.btnBorrarPedido)
        Me.Controls.Add(Me.btnRealizarPedido)
        Me.Controls.Add(Me.lbPedidos)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox2.PerformLayout()
        Me.GroupBox3.ResumeLayout(False)
        Me.GroupBox3.PerformLayout()
        CType(Me.nudUnidades, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lbPedidos As ListBox
    Friend WithEvents btnRealizarPedido As Button
    Friend WithEvents btnBorrarPedido As Button
    Friend WithEvents lbMarcas As ListBox
    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents Label2 As Label
    Friend WithEvents Label1 As Label
    Friend WithEvents cbTabaqueras As ComboBox
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents Label6 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents tbPromocion As TextBox
    Friend WithEvents tbPrecio As TextBox
    Friend WithEvents tbNicotina As TextBox
    Friend WithEvents tbNumCig As TextBox
    Friend WithEvents GroupBox3 As GroupBox
    Friend WithEvents Label7 As Label
    Friend WithEvents nudUnidades As NumericUpDown
    Friend WithEvents ckCartones As CheckBox
    Friend WithEvents Label8 As Label
    Friend WithEvents Label9 As Label
    Friend WithEvents trallaNuevoPedido As Button
End Class
