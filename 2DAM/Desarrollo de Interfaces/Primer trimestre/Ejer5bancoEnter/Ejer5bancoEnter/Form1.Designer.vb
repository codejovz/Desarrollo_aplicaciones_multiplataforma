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
        Me.tbCuenta = New System.Windows.Forms.TextBox()
        Me.tbSaldoInicial = New System.Windows.Forms.TextBox()
        Me.tbSaldoActual = New System.Windows.Forms.TextBox()
        Me.btnPago = New System.Windows.Forms.Button()
        Me.btnIngreso = New System.Windows.Forms.Button()
        Me.Button3 = New System.Windows.Forms.Button()
        Me.Button4 = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'tbCuenta
        '
        Me.tbCuenta.Location = New System.Drawing.Point(253, 58)
        Me.tbCuenta.Name = "tbCuenta"
        Me.tbCuenta.Size = New System.Drawing.Size(181, 22)
        Me.tbCuenta.TabIndex = 0
        '
        'tbSaldoInicial
        '
        Me.tbSaldoInicial.Enabled = False
        Me.tbSaldoInicial.Location = New System.Drawing.Point(253, 107)
        Me.tbSaldoInicial.Name = "tbSaldoInicial"
        Me.tbSaldoInicial.Size = New System.Drawing.Size(181, 22)
        Me.tbSaldoInicial.TabIndex = 1
        '
        'tbSaldoActual
        '
        Me.tbSaldoActual.Enabled = False
        Me.tbSaldoActual.Location = New System.Drawing.Point(253, 156)
        Me.tbSaldoActual.Name = "tbSaldoActual"
        Me.tbSaldoActual.Size = New System.Drawing.Size(181, 22)
        Me.tbSaldoActual.TabIndex = 2
        '
        'btnPago
        '
        Me.btnPago.Enabled = False
        Me.btnPago.Location = New System.Drawing.Point(56, 223)
        Me.btnPago.Name = "btnPago"
        Me.btnPago.Size = New System.Drawing.Size(75, 23)
        Me.btnPago.TabIndex = 3
        Me.btnPago.Text = "Pago"
        Me.btnPago.UseVisualStyleBackColor = True
        '
        'btnIngreso
        '
        Me.btnIngreso.Enabled = False
        Me.btnIngreso.Location = New System.Drawing.Point(163, 223)
        Me.btnIngreso.Name = "btnIngreso"
        Me.btnIngreso.Size = New System.Drawing.Size(75, 23)
        Me.btnIngreso.TabIndex = 4
        Me.btnIngreso.Text = "Ingreso"
        Me.btnIngreso.UseVisualStyleBackColor = True
        '
        'Button3
        '
        Me.Button3.Location = New System.Drawing.Point(264, 223)
        Me.Button3.Name = "Button3"
        Me.Button3.Size = New System.Drawing.Size(75, 23)
        Me.Button3.TabIndex = 5
        Me.Button3.Text = "Borrar"
        Me.Button3.UseVisualStyleBackColor = True
        '
        'Button4
        '
        Me.Button4.Location = New System.Drawing.Point(359, 223)
        Me.Button4.Name = "Button4"
        Me.Button4.Size = New System.Drawing.Size(75, 23)
        Me.Button4.TabIndex = 6
        Me.Button4.Text = "Salir"
        Me.Button4.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(51, 9)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(248, 17)
        Me.Label1.TabIndex = 7
        Me.Label1.Text = "MOVIMIENTOS CUENTA CORRIENTE"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(53, 61)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(125, 17)
        Me.Label2.TabIndex = 8
        Me.Label2.Text = "Numero de cuenta"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(53, 110)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(83, 17)
        Me.Label3.TabIndex = 9
        Me.Label3.Text = "Saldo inicial"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(53, 159)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(86, 17)
        Me.Label4.TabIndex = 10
        Me.Label4.Text = "Saldo actual"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(453, 280)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Button4)
        Me.Controls.Add(Me.Button3)
        Me.Controls.Add(Me.btnIngreso)
        Me.Controls.Add(Me.btnPago)
        Me.Controls.Add(Me.tbSaldoActual)
        Me.Controls.Add(Me.tbSaldoInicial)
        Me.Controls.Add(Me.tbCuenta)
        Me.Name = "Form1"
        Me.Text = "PROCESOS BANCO"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents tbCuenta As TextBox
    Friend WithEvents tbSaldoInicial As TextBox
    Friend WithEvents tbSaldoActual As TextBox
    Friend WithEvents btnPago As Button
    Friend WithEvents btnIngreso As Button
    Friend WithEvents Button3 As Button
    Friend WithEvents Button4 As Button
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
End Class
