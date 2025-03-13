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
        Me.btnIngreso = New System.Windows.Forms.Button()
        Me.btnPago = New System.Windows.Forms.Button()
        Me.btnBuscar = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.tbNumCuenta = New System.Windows.Forms.TextBox()
        Me.tbNombre = New System.Windows.Forms.TextBox()
        Me.tbActual = New System.Windows.Forms.TextBox()
        Me.tbSalInicial = New System.Windows.Forms.TextBox()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'btnIngreso
        '
        Me.btnIngreso.Location = New System.Drawing.Point(23, 200)
        Me.btnIngreso.Name = "btnIngreso"
        Me.btnIngreso.Size = New System.Drawing.Size(75, 32)
        Me.btnIngreso.TabIndex = 0
        Me.btnIngreso.Text = "Ingreso"
        Me.btnIngreso.UseVisualStyleBackColor = True
        '
        'btnPago
        '
        Me.btnPago.Location = New System.Drawing.Point(126, 200)
        Me.btnPago.Name = "btnPago"
        Me.btnPago.Size = New System.Drawing.Size(75, 32)
        Me.btnPago.TabIndex = 1
        Me.btnPago.Text = "Pagos"
        Me.btnPago.UseVisualStyleBackColor = True
        '
        'btnBuscar
        '
        Me.btnBuscar.Location = New System.Drawing.Point(225, 200)
        Me.btnBuscar.Name = "btnBuscar"
        Me.btnBuscar.Size = New System.Drawing.Size(75, 32)
        Me.btnBuscar.TabIndex = 2
        Me.btnBuscar.Text = "Buscar"
        Me.btnBuscar.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(27, 21)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(105, 17)
        Me.Label1.TabIndex = 3
        Me.Label1.Text = "Numero cuenta"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(27, 62)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(58, 17)
        Me.Label2.TabIndex = 4
        Me.Label2.Text = "Nombre"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(27, 108)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(83, 17)
        Me.Label3.TabIndex = 5
        Me.Label3.Text = "Saldo inicial"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(27, 146)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(86, 17)
        Me.Label4.TabIndex = 6
        Me.Label4.Text = "Saldo actual"
        '
        'tbNumCuenta
        '
        Me.tbNumCuenta.Location = New System.Drawing.Point(173, 16)
        Me.tbNumCuenta.Name = "tbNumCuenta"
        Me.tbNumCuenta.Size = New System.Drawing.Size(144, 22)
        Me.tbNumCuenta.TabIndex = 7
        '
        'tbNombre
        '
        Me.tbNombre.Location = New System.Drawing.Point(173, 57)
        Me.tbNombre.Name = "tbNombre"
        Me.tbNombre.Size = New System.Drawing.Size(144, 22)
        Me.tbNombre.TabIndex = 8
        '
        'tbActual
        '
        Me.tbActual.Location = New System.Drawing.Point(173, 143)
        Me.tbActual.Name = "tbActual"
        Me.tbActual.Size = New System.Drawing.Size(144, 22)
        Me.tbActual.TabIndex = 9
        '
        'tbSalInicial
        '
        Me.tbSalInicial.Location = New System.Drawing.Point(173, 105)
        Me.tbSalInicial.Name = "tbSalInicial"
        Me.tbSalInicial.Size = New System.Drawing.Size(144, 22)
        Me.tbSalInicial.TabIndex = 10
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(324, 200)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 32)
        Me.btnSalir.TabIndex = 11
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(428, 248)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.tbSalInicial)
        Me.Controls.Add(Me.tbActual)
        Me.Controls.Add(Me.tbNombre)
        Me.Controls.Add(Me.tbNumCuenta)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.btnBuscar)
        Me.Controls.Add(Me.btnPago)
        Me.Controls.Add(Me.btnIngreso)
        Me.Name = "Form1"
        Me.Text = "CUENTAS - OPERACIONES"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnIngreso As Button
    Friend WithEvents btnPago As Button
    Friend WithEvents btnBuscar As Button
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents tbNumCuenta As TextBox
    Friend WithEvents tbNombre As TextBox
    Friend WithEvents tbActual As TextBox
    Friend WithEvents tbSalInicial As TextBox
    Friend WithEvents btnSalir As Button
End Class
