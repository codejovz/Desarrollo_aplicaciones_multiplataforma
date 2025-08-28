<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()>
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
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.lbMarcas = New System.Windows.Forms.ListBox()
        Me.cbTabaqueras = New System.Windows.Forms.ComboBox()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.tbPromocion = New System.Windows.Forms.TextBox()
        Me.tbNicotina = New System.Windows.Forms.TextBox()
        Me.tbPrecio = New System.Windows.Forms.TextBox()
        Me.tbNumeros = New System.Windows.Forms.TextBox()
        Me.GroupBox3 = New System.Windows.Forms.GroupBox()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.NumUpDn = New System.Windows.Forms.NumericUpDown()
        Me.CheckBox1 = New System.Windows.Forms.CheckBox()
        Me.lbPedidos = New System.Windows.Forms.ListBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.GroupBox1.SuspendLayout()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.GroupBox2.SuspendLayout()
        Me.GroupBox3.SuspendLayout()
        CType(Me.NumUpDn, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.PictureBox1)
        Me.GroupBox1.Controls.Add(Me.Label8)
        Me.GroupBox1.Controls.Add(Me.Label7)
        Me.GroupBox1.Controls.Add(Me.lbMarcas)
        Me.GroupBox1.Controls.Add(Me.cbTabaqueras)
        Me.GroupBox1.Location = New System.Drawing.Point(43, 46)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(447, 184)
        Me.GroupBox1.TabIndex = 0
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "PRODUCTO"
        '
        'PictureBox1
        '
        Me.PictureBox1.Location = New System.Drawing.Point(314, 38)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(122, 123)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 9
        Me.PictureBox1.TabStop = False
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(160, 38)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(65, 17)
        Me.Label8.TabIndex = 8
        Me.Label8.Text = "MARCAS"
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(6, 38)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(102, 17)
        Me.Label7.TabIndex = 8
        Me.Label7.Text = "TABAQUERAS"
        '
        'lbMarcas
        '
        Me.lbMarcas.FormattingEnabled = True
        Me.lbMarcas.ItemHeight = 16
        Me.lbMarcas.Location = New System.Drawing.Point(163, 61)
        Me.lbMarcas.Name = "lbMarcas"
        Me.lbMarcas.Size = New System.Drawing.Size(128, 100)
        Me.lbMarcas.TabIndex = 7
        '
        'cbTabaqueras
        '
        Me.cbTabaqueras.FormattingEnabled = True
        Me.cbTabaqueras.Items.AddRange(New Object() {"TABACALERA", "PHILIP MORRIS", "JP MORGAN"})
        Me.cbTabaqueras.Location = New System.Drawing.Point(6, 61)
        Me.cbTabaqueras.Name = "cbTabaqueras"
        Me.cbTabaqueras.Size = New System.Drawing.Size(121, 24)
        Me.cbTabaqueras.TabIndex = 0
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.Label5)
        Me.GroupBox2.Controls.Add(Me.Label4)
        Me.GroupBox2.Controls.Add(Me.Label3)
        Me.GroupBox2.Controls.Add(Me.Label2)
        Me.GroupBox2.Controls.Add(Me.tbPromocion)
        Me.GroupBox2.Controls.Add(Me.tbNicotina)
        Me.GroupBox2.Controls.Add(Me.tbPrecio)
        Me.GroupBox2.Controls.Add(Me.tbNumeros)
        Me.GroupBox2.Location = New System.Drawing.Point(515, 46)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(356, 185)
        Me.GroupBox2.TabIndex = 1
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "CARACTERISTICAS"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(184, 43)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(72, 17)
        Me.Label5.TabIndex = 8
        Me.Label5.Text = "NICOTINA"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(184, 113)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(93, 17)
        Me.Label4.TabIndex = 8
        Me.Label4.Text = "PROMOCION"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(15, 113)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(59, 17)
        Me.Label3.TabIndex = 8
        Me.Label3.Text = "PRECIO"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(15, 43)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(118, 17)
        Me.Label2.TabIndex = 7
        Me.Label2.Text = "Nº CIGARRILLOS"
        '
        'tbPromocion
        '
        Me.tbPromocion.Location = New System.Drawing.Point(187, 133)
        Me.tbPromocion.Name = "tbPromocion"
        Me.tbPromocion.Size = New System.Drawing.Size(110, 22)
        Me.tbPromocion.TabIndex = 3
        '
        'tbNicotina
        '
        Me.tbNicotina.Location = New System.Drawing.Point(187, 63)
        Me.tbNicotina.Name = "tbNicotina"
        Me.tbNicotina.Size = New System.Drawing.Size(110, 22)
        Me.tbNicotina.TabIndex = 2
        '
        'tbPrecio
        '
        Me.tbPrecio.Location = New System.Drawing.Point(18, 133)
        Me.tbPrecio.Name = "tbPrecio"
        Me.tbPrecio.Size = New System.Drawing.Size(115, 22)
        Me.tbPrecio.TabIndex = 1
        '
        'tbNumeros
        '
        Me.tbNumeros.Location = New System.Drawing.Point(18, 63)
        Me.tbNumeros.Name = "tbNumeros"
        Me.tbNumeros.Size = New System.Drawing.Size(115, 22)
        Me.tbNumeros.TabIndex = 0
        '
        'GroupBox3
        '
        Me.GroupBox3.Controls.Add(Me.Label6)
        Me.GroupBox3.Controls.Add(Me.NumUpDn)
        Me.GroupBox3.Controls.Add(Me.CheckBox1)
        Me.GroupBox3.Location = New System.Drawing.Point(902, 46)
        Me.GroupBox3.Name = "GroupBox3"
        Me.GroupBox3.Size = New System.Drawing.Size(239, 184)
        Me.GroupBox3.TabIndex = 2
        Me.GroupBox3.TabStop = False
        Me.GroupBox3.Text = "COMPRA"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(70, 133)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(78, 17)
        Me.Label6.TabIndex = 9
        Me.Label6.Text = "UNIDADES"
        '
        'NumUpDn
        '
        Me.NumUpDn.Location = New System.Drawing.Point(23, 99)
        Me.NumUpDn.Name = "NumUpDn"
        Me.NumUpDn.Size = New System.Drawing.Size(174, 22)
        Me.NumUpDn.TabIndex = 1
        '
        'CheckBox1
        '
        Me.CheckBox1.AutoSize = True
        Me.CheckBox1.Location = New System.Drawing.Point(23, 38)
        Me.CheckBox1.Name = "CheckBox1"
        Me.CheckBox1.Size = New System.Drawing.Size(106, 21)
        Me.CheckBox1.TabIndex = 0
        Me.CheckBox1.Text = "CARTONES"
        Me.CheckBox1.UseVisualStyleBackColor = True
        '
        'lbPedidos
        '
        Me.lbPedidos.FormattingEnabled = True
        Me.lbPedidos.ItemHeight = 16
        Me.lbPedidos.Location = New System.Drawing.Point(43, 297)
        Me.lbPedidos.Name = "lbPedidos"
        Me.lbPedidos.Size = New System.Drawing.Size(191, 84)
        Me.lbPedidos.TabIndex = 3
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(40, 258)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(69, 17)
        Me.Label1.TabIndex = 4
        Me.Label1.Text = "PEDIDOS"
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(307, 297)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(172, 23)
        Me.Button1.TabIndex = 5
        Me.Button1.Text = "REALIZAR PEDIDO"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'Button2
        '
        Me.Button2.Location = New System.Drawing.Point(307, 358)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(172, 23)
        Me.Button2.TabIndex = 6
        Me.Button2.Text = "BORRAR PEDIDO"
        Me.Button2.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(1166, 525)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.lbPedidos)
        Me.Controls.Add(Me.GroupBox3)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.GroupBox1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox2.PerformLayout()
        Me.GroupBox3.ResumeLayout(False)
        Me.GroupBox3.PerformLayout()
        CType(Me.NumUpDn, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents GroupBox1 As GroupBox
    Friend WithEvents lbMarcas As ListBox
    Friend WithEvents cbTabaqueras As ComboBox
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents GroupBox3 As GroupBox
    Friend WithEvents lbPedidos As ListBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Button1 As Button
    Friend WithEvents Button2 As Button
    Friend WithEvents Label2 As Label
    Friend WithEvents tbPromocion As TextBox
    Friend WithEvents tbNicotina As TextBox
    Friend WithEvents tbPrecio As TextBox
    Friend WithEvents tbNumeros As TextBox
    Friend WithEvents Label8 As Label
    Friend WithEvents Label7 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents NumUpDn As NumericUpDown
    Friend WithEvents CheckBox1 As CheckBox
    Friend WithEvents PictureBox1 As PictureBox
End Class
