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
        Me.tbCuenta = New System.Windows.Forms.TextBox()
        Me.tbSinicial = New System.Windows.Forms.TextBox()
        Me.tbSactual = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.btnPago = New System.Windows.Forms.Button()
        Me.btnIngreso = New System.Windows.Forms.Button()
        Me.btnCargar = New System.Windows.Forms.Button()
        Me.btnCliente = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.tbNombre = New System.Windows.Forms.TextBox()
        Me.SuspendLayout()
        '
        'tbCuenta
        '
        Me.tbCuenta.Enabled = False
        Me.tbCuenta.Location = New System.Drawing.Point(261, 31)
        Me.tbCuenta.Multiline = True
        Me.tbCuenta.Name = "tbCuenta"
        Me.tbCuenta.Size = New System.Drawing.Size(149, 30)
        Me.tbCuenta.TabIndex = 0
        '
        'tbSinicial
        '
        Me.tbSinicial.Enabled = False
        Me.tbSinicial.Location = New System.Drawing.Point(261, 131)
        Me.tbSinicial.Name = "tbSinicial"
        Me.tbSinicial.Size = New System.Drawing.Size(100, 22)
        Me.tbSinicial.TabIndex = 2
        '
        'tbSactual
        '
        Me.tbSactual.Enabled = False
        Me.tbSactual.Location = New System.Drawing.Point(261, 175)
        Me.tbSactual.Name = "tbSactual"
        Me.tbSactual.Size = New System.Drawing.Size(100, 22)
        Me.tbSactual.TabIndex = 3
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(97, 9)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(248, 17)
        Me.Label1.TabIndex = 4
        Me.Label1.Text = "MOVIMIENTOS CUENTA CORRIENTE"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(12, 36)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(125, 17)
        Me.Label2.TabIndex = 5
        Me.Label2.Text = "Numero de cuenta"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(12, 77)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(58, 17)
        Me.Label3.TabIndex = 6
        Me.Label3.Text = "Nombre"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(12, 120)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(83, 17)
        Me.Label4.TabIndex = 7
        Me.Label4.Text = "Saldo inicial"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(12, 180)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(86, 17)
        Me.Label5.TabIndex = 8
        Me.Label5.Text = "Saldo actual"
        '
        'btnPago
        '
        Me.btnPago.Enabled = False
        Me.btnPago.Location = New System.Drawing.Point(31, 223)
        Me.btnPago.Name = "btnPago"
        Me.btnPago.Size = New System.Drawing.Size(75, 23)
        Me.btnPago.TabIndex = 9
        Me.btnPago.Text = "Pago"
        Me.btnPago.UseVisualStyleBackColor = True
        '
        'btnIngreso
        '
        Me.btnIngreso.Enabled = False
        Me.btnIngreso.Location = New System.Drawing.Point(31, 269)
        Me.btnIngreso.Name = "btnIngreso"
        Me.btnIngreso.Size = New System.Drawing.Size(75, 23)
        Me.btnIngreso.TabIndex = 10
        Me.btnIngreso.Text = "Ingreso"
        Me.btnIngreso.UseVisualStyleBackColor = True
        '
        'btnCargar
        '
        Me.btnCargar.Location = New System.Drawing.Point(172, 237)
        Me.btnCargar.Name = "btnCargar"
        Me.btnCargar.Size = New System.Drawing.Size(86, 38)
        Me.btnCargar.TabIndex = 11
        Me.btnCargar.Text = "Cargar"
        Me.btnCargar.UseVisualStyleBackColor = True
        '
        'btnCliente
        '
        Me.btnCliente.Enabled = False
        Me.btnCliente.Location = New System.Drawing.Point(335, 223)
        Me.btnCliente.Name = "btnCliente"
        Me.btnCliente.Size = New System.Drawing.Size(75, 23)
        Me.btnCliente.TabIndex = 12
        Me.btnCliente.Text = "Cliente"
        Me.btnCliente.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(335, 269)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 23)
        Me.btnSalir.TabIndex = 13
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'tbNombre
        '
        Me.tbNombre.Enabled = False
        Me.tbNombre.Location = New System.Drawing.Point(261, 77)
        Me.tbNombre.Multiline = True
        Me.tbNombre.Name = "tbNombre"
        Me.tbNombre.Size = New System.Drawing.Size(149, 30)
        Me.tbNombre.TabIndex = 14
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(435, 312)
        Me.Controls.Add(Me.tbNombre)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnCliente)
        Me.Controls.Add(Me.btnCargar)
        Me.Controls.Add(Me.btnIngreso)
        Me.Controls.Add(Me.btnPago)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.tbSactual)
        Me.Controls.Add(Me.tbSinicial)
        Me.Controls.Add(Me.tbCuenta)
        Me.Name = "Form1"
        Me.Text = "PROCESOS BANCO"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents tbCuenta As TextBox
    Friend WithEvents tbSinicial As TextBox
    Friend WithEvents tbSactual As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents btnPago As Button
    Friend WithEvents btnIngreso As Button
    Friend WithEvents btnCargar As Button
    Friend WithEvents btnCliente As Button
    Friend WithEvents btnSalir As Button
    Friend WithEvents tbNombre As TextBox
End Class
