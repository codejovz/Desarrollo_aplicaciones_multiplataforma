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
        Me.lblRadio = New System.Windows.Forms.Label()
        Me.lblArea = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.tbRadio = New System.Windows.Forms.TextBox()
        Me.tbArea = New System.Windows.Forms.TextBox()
        Me.btnCalcular = New System.Windows.Forms.Button()
        Me.btnRestaurar = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'lblRadio
        '
        Me.lblRadio.AutoSize = True
        Me.lblRadio.Location = New System.Drawing.Point(55, 72)
        Me.lblRadio.Name = "lblRadio"
        Me.lblRadio.Size = New System.Drawing.Size(69, 17)
        Me.lblRadio.TabIndex = 0
        Me.lblRadio.Text = "Radio.....:"
        '
        'lblArea
        '
        Me.lblArea.AutoSize = True
        Me.lblArea.Location = New System.Drawing.Point(55, 116)
        Me.lblArea.Name = "lblArea"
        Me.lblArea.Size = New System.Drawing.Size(66, 17)
        Me.lblArea.TabIndex = 1
        Me.lblArea.Text = "Area......:"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(86, 19)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(156, 17)
        Me.Label3.TabIndex = 2
        Me.Label3.Text = "AREA DE UN CIRCULO"
        '
        'tbRadio
        '
        Me.tbRadio.Location = New System.Drawing.Point(199, 69)
        Me.tbRadio.Name = "tbRadio"
        Me.tbRadio.Size = New System.Drawing.Size(100, 22)
        Me.tbRadio.TabIndex = 3
        '
        'tbArea
        '
        Me.tbArea.Enabled = False
        Me.tbArea.Location = New System.Drawing.Point(199, 116)
        Me.tbArea.Name = "tbArea"
        Me.tbArea.Size = New System.Drawing.Size(100, 22)
        Me.tbArea.TabIndex = 4
        Me.tbArea.Visible = False
        '
        'btnCalcular
        '
        Me.btnCalcular.Location = New System.Drawing.Point(110, 177)
        Me.btnCalcular.Name = "btnCalcular"
        Me.btnCalcular.Size = New System.Drawing.Size(75, 23)
        Me.btnCalcular.TabIndex = 5
        Me.btnCalcular.Text = "Calcular"
        Me.btnCalcular.UseVisualStyleBackColor = True
        '
        'btnRestaurar
        '
        Me.btnRestaurar.Location = New System.Drawing.Point(214, 177)
        Me.btnRestaurar.Name = "btnRestaurar"
        Me.btnRestaurar.Size = New System.Drawing.Size(85, 23)
        Me.btnRestaurar.TabIndex = 6
        Me.btnRestaurar.Text = "Restaurar"
        Me.btnRestaurar.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(167, 206)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 23)
        Me.btnSalir.TabIndex = 7
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(434, 284)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnRestaurar)
        Me.Controls.Add(Me.btnCalcular)
        Me.Controls.Add(Me.tbArea)
        Me.Controls.Add(Me.tbRadio)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.lblArea)
        Me.Controls.Add(Me.lblRadio)
        Me.Name = "Form1"
        Me.Text = "Area de un circulo"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lblRadio As Label
    Friend WithEvents lblArea As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents tbRadio As TextBox
    Friend WithEvents tbArea As TextBox
    Friend WithEvents btnCalcular As Button
    Friend WithEvents btnRestaurar As Button
    Friend WithEvents btnSalir As Button
End Class
