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
        Me.btnMas = New System.Windows.Forms.Button()
        Me.btnMenos = New System.Windows.Forms.Button()
        Me.btnAceptar = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.btnVisualizar = New System.Windows.Forms.Button()
        Me.tbElemento = New System.Windows.Forms.TextBox()
        Me.tbValor = New System.Windows.Forms.TextBox()
        Me.tbTodo = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'btnMas
        '
        Me.btnMas.Location = New System.Drawing.Point(272, 34)
        Me.btnMas.Name = "btnMas"
        Me.btnMas.Size = New System.Drawing.Size(52, 47)
        Me.btnMas.TabIndex = 0
        Me.btnMas.Text = "+"
        Me.btnMas.UseVisualStyleBackColor = True
        '
        'btnMenos
        '
        Me.btnMenos.Location = New System.Drawing.Point(345, 34)
        Me.btnMenos.Name = "btnMenos"
        Me.btnMenos.Size = New System.Drawing.Size(56, 47)
        Me.btnMenos.TabIndex = 1
        Me.btnMenos.Text = "-"
        Me.btnMenos.UseVisualStyleBackColor = True
        '
        'btnAceptar
        '
        Me.btnAceptar.Location = New System.Drawing.Point(65, 211)
        Me.btnAceptar.Name = "btnAceptar"
        Me.btnAceptar.Size = New System.Drawing.Size(75, 35)
        Me.btnAceptar.TabIndex = 2
        Me.btnAceptar.Text = "Aceptar"
        Me.btnAceptar.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(272, 211)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 35)
        Me.btnSalir.TabIndex = 3
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'btnVisualizar
        '
        Me.btnVisualizar.Location = New System.Drawing.Point(444, 211)
        Me.btnVisualizar.Name = "btnVisualizar"
        Me.btnVisualizar.Size = New System.Drawing.Size(90, 35)
        Me.btnVisualizar.TabIndex = 4
        Me.btnVisualizar.Text = "Visualizar"
        Me.btnVisualizar.UseVisualStyleBackColor = True
        '
        'tbElemento
        '
        Me.tbElemento.Location = New System.Drawing.Point(176, 34)
        Me.tbElemento.Name = "tbElemento"
        Me.tbElemento.Size = New System.Drawing.Size(62, 22)
        Me.tbElemento.TabIndex = 5
        '
        'tbValor
        '
        Me.tbValor.Location = New System.Drawing.Point(150, 123)
        Me.tbValor.Name = "tbValor"
        Me.tbValor.Size = New System.Drawing.Size(135, 22)
        Me.tbValor.TabIndex = 6
        '
        'tbTodo
        '
        Me.tbTodo.Location = New System.Drawing.Point(418, 34)
        Me.tbTodo.Multiline = True
        Me.tbTodo.Name = "tbTodo"
        Me.tbTodo.ScrollBars = System.Windows.Forms.ScrollBars.Vertical
        Me.tbTodo.Size = New System.Drawing.Size(135, 129)
        Me.tbTodo.TabIndex = 7
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(61, 37)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(79, 17)
        Me.Label1.TabIndex = 8
        Me.Label1.Text = "Elemento..."
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(62, 126)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(53, 17)
        Me.Label2.TabIndex = 9
        Me.Label2.Text = "Valor..."
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(578, 273)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.tbTodo)
        Me.Controls.Add(Me.tbValor)
        Me.Controls.Add(Me.tbElemento)
        Me.Controls.Add(Me.btnVisualizar)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnAceptar)
        Me.Controls.Add(Me.btnMenos)
        Me.Controls.Add(Me.btnMas)
        Me.Name = "Form1"
        Me.Text = "Matrices"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnMas As Button
    Friend WithEvents btnMenos As Button
    Friend WithEvents btnAceptar As Button
    Friend WithEvents btnSalir As Button
    Friend WithEvents btnVisualizar As Button
    Friend WithEvents tbElemento As TextBox
    Friend WithEvents tbValor As TextBox
    Friend WithEvents tbTodo As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
End Class
