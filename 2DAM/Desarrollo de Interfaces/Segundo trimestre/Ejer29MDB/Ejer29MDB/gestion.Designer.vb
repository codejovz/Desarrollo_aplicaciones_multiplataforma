<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class gestion
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
        Me.tbCuenta2 = New System.Windows.Forms.TextBox()
        Me.tbNombre2 = New System.Windows.Forms.TextBox()
        Me.tbDir2 = New System.Windows.Forms.TextBox()
        Me.tbTel2 = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.Button2 = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'tbCuenta2
        '
        Me.tbCuenta2.Location = New System.Drawing.Point(156, 33)
        Me.tbCuenta2.Name = "tbCuenta2"
        Me.tbCuenta2.Size = New System.Drawing.Size(125, 22)
        Me.tbCuenta2.TabIndex = 0
        '
        'tbNombre2
        '
        Me.tbNombre2.Location = New System.Drawing.Point(156, 86)
        Me.tbNombre2.Name = "tbNombre2"
        Me.tbNombre2.Size = New System.Drawing.Size(125, 22)
        Me.tbNombre2.TabIndex = 1
        '
        'tbDir2
        '
        Me.tbDir2.Location = New System.Drawing.Point(156, 141)
        Me.tbDir2.Name = "tbDir2"
        Me.tbDir2.Size = New System.Drawing.Size(125, 22)
        Me.tbDir2.TabIndex = 2
        '
        'tbTel2
        '
        Me.tbTel2.Location = New System.Drawing.Point(156, 198)
        Me.tbTel2.Name = "tbTel2"
        Me.tbTel2.Size = New System.Drawing.Size(125, 22)
        Me.tbTel2.TabIndex = 3
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(12, 38)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(125, 17)
        Me.Label1.TabIndex = 4
        Me.Label1.Text = "Numero de cuenta"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(12, 91)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(58, 17)
        Me.Label2.TabIndex = 5
        Me.Label2.Text = "Nombre"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(12, 146)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(67, 17)
        Me.Label3.TabIndex = 6
        Me.Label3.Text = "Direccion"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(12, 203)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(64, 17)
        Me.Label4.TabIndex = 7
        Me.Label4.Text = "Telefono"
        '
        'Button1
        '
        Me.Button1.BackColor = System.Drawing.Color.White
        Me.Button1.Location = New System.Drawing.Point(341, 247)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(83, 23)
        Me.Button1.TabIndex = 8
        Me.Button1.Text = "Salir"
        Me.Button1.UseVisualStyleBackColor = False
        '
        'Button2
        '
        Me.Button2.Location = New System.Drawing.Point(141, 247)
        Me.Button2.Name = "Button2"
        Me.Button2.Size = New System.Drawing.Size(153, 23)
        Me.Button2.TabIndex = 9
        Me.Button2.Text = "Crear cuenta"
        Me.Button2.UseVisualStyleBackColor = True
        '
        'gestion
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(436, 294)
        Me.Controls.Add(Me.Button2)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.tbTel2)
        Me.Controls.Add(Me.tbDir2)
        Me.Controls.Add(Me.tbNombre2)
        Me.Controls.Add(Me.tbCuenta2)
        Me.Name = "gestion"
        Me.Text = "CUENTAS - GESTION"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents tbCuenta2 As TextBox
    Friend WithEvents tbNombre2 As TextBox
    Friend WithEvents tbDir2 As TextBox
    Friend WithEvents tbTel2 As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Button1 As Button
    Friend WithEvents Button2 As Button
End Class
