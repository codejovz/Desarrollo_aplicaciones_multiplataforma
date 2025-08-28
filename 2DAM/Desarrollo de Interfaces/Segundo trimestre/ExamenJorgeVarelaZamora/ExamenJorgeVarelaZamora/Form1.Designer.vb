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
        Me.btnBorrar = New System.Windows.Forms.Button()
        Me.btnVender = New System.Windows.Forms.Button()
        Me.btnVendidos = New System.Windows.Forms.Button()
        Me.Button4 = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.tbModelo = New System.Windows.Forms.TextBox()
        Me.tbCilindrada = New System.Windows.Forms.TextBox()
        Me.tbMotor = New System.Windows.Forms.TextBox()
        Me.tbUnidades = New System.Windows.Forms.TextBox()
        Me.cbCoches = New System.Windows.Forms.ComboBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.lbClientes = New System.Windows.Forms.ListBox()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'btnBorrar
        '
        Me.btnBorrar.Enabled = False
        Me.btnBorrar.Location = New System.Drawing.Point(438, 351)
        Me.btnBorrar.Name = "btnBorrar"
        Me.btnBorrar.Size = New System.Drawing.Size(127, 34)
        Me.btnBorrar.TabIndex = 0
        Me.btnBorrar.Text = "BORRAR"
        Me.btnBorrar.UseVisualStyleBackColor = True
        '
        'btnVender
        '
        Me.btnVender.Enabled = False
        Me.btnVender.Location = New System.Drawing.Point(580, 351)
        Me.btnVender.Name = "btnVender"
        Me.btnVender.Size = New System.Drawing.Size(127, 34)
        Me.btnVender.TabIndex = 1
        Me.btnVender.Text = "VENDER"
        Me.btnVender.UseVisualStyleBackColor = True
        '
        'btnVendidos
        '
        Me.btnVendidos.Location = New System.Drawing.Point(731, 351)
        Me.btnVendidos.Name = "btnVendidos"
        Me.btnVendidos.Size = New System.Drawing.Size(127, 34)
        Me.btnVendidos.TabIndex = 2
        Me.btnVendidos.Text = "VENDIDOS"
        Me.btnVendidos.UseVisualStyleBackColor = True
        '
        'Button4
        '
        Me.Button4.Enabled = False
        Me.Button4.Location = New System.Drawing.Point(877, 351)
        Me.Button4.Name = "Button4"
        Me.Button4.Size = New System.Drawing.Size(127, 34)
        Me.Button4.TabIndex = 3
        Me.Button4.Text = "SALIR"
        Me.Button4.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(29, 226)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(54, 17)
        Me.Label1.TabIndex = 4
        Me.Label1.Text = "Modelo"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(29, 287)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(71, 17)
        Me.Label2.TabIndex = 5
        Me.Label2.Text = "Cilindrada"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(29, 351)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(44, 17)
        Me.Label3.TabIndex = 6
        Me.Label3.Text = "Motor"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(29, 409)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(68, 17)
        Me.Label4.TabIndex = 7
        Me.Label4.Text = "Unidades"
        '
        'tbModelo
        '
        Me.tbModelo.Location = New System.Drawing.Point(132, 227)
        Me.tbModelo.Name = "tbModelo"
        Me.tbModelo.Size = New System.Drawing.Size(100, 22)
        Me.tbModelo.TabIndex = 8
        '
        'tbCilindrada
        '
        Me.tbCilindrada.Location = New System.Drawing.Point(132, 287)
        Me.tbCilindrada.Name = "tbCilindrada"
        Me.tbCilindrada.Size = New System.Drawing.Size(100, 22)
        Me.tbCilindrada.TabIndex = 9
        '
        'tbMotor
        '
        Me.tbMotor.Location = New System.Drawing.Point(132, 346)
        Me.tbMotor.Name = "tbMotor"
        Me.tbMotor.Size = New System.Drawing.Size(100, 22)
        Me.tbMotor.TabIndex = 10
        '
        'tbUnidades
        '
        Me.tbUnidades.Location = New System.Drawing.Point(132, 406)
        Me.tbUnidades.Name = "tbUnidades"
        Me.tbUnidades.Size = New System.Drawing.Size(100, 22)
        Me.tbUnidades.TabIndex = 11
        '
        'cbCoches
        '
        Me.cbCoches.FormattingEnabled = True
        Me.cbCoches.Location = New System.Drawing.Point(513, 43)
        Me.cbCoches.Name = "cbCoches"
        Me.cbCoches.Size = New System.Drawing.Size(137, 24)
        Me.cbCoches.TabIndex = 12
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(551, 9)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(65, 17)
        Me.Label5.TabIndex = 13
        Me.Label5.Text = "COCHES"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(209, 9)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(97, 17)
        Me.Label6.TabIndex = 14
        Me.Label6.Text = "FOTOGRAFIA"
        '
        'PictureBox1
        '
        Me.PictureBox1.Location = New System.Drawing.Point(157, 56)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(166, 106)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 15
        Me.PictureBox1.TabStop = False
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(947, 9)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(74, 17)
        Me.Label7.TabIndex = 16
        Me.Label7.Text = "CLIENTES"
        '
        'lbClientes
        '
        Me.lbClientes.FormattingEnabled = True
        Me.lbClientes.ItemHeight = 16
        Me.lbClientes.Location = New System.Drawing.Point(868, 55)
        Me.lbClientes.Name = "lbClientes"
        Me.lbClientes.Size = New System.Drawing.Size(183, 180)
        Me.lbClientes.TabIndex = 17
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(1173, 541)
        Me.Controls.Add(Me.lbClientes)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.cbCoches)
        Me.Controls.Add(Me.tbUnidades)
        Me.Controls.Add(Me.tbMotor)
        Me.Controls.Add(Me.tbCilindrada)
        Me.Controls.Add(Me.tbModelo)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Button4)
        Me.Controls.Add(Me.btnVendidos)
        Me.Controls.Add(Me.btnVender)
        Me.Controls.Add(Me.btnBorrar)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnBorrar As Button
    Friend WithEvents btnVender As Button
    Friend WithEvents btnVendidos As Button
    Friend WithEvents Button4 As Button
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents tbModelo As TextBox
    Friend WithEvents tbCilindrada As TextBox
    Friend WithEvents tbMotor As TextBox
    Friend WithEvents tbUnidades As TextBox
    Friend WithEvents cbCoches As ComboBox
    Friend WithEvents Label5 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents Label7 As Label
    Friend WithEvents lbClientes As ListBox
End Class
