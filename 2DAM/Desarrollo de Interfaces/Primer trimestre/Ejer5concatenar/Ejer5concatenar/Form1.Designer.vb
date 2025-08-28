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
        Me.tbCapital = New System.Windows.Forms.TextBox()
        Me.tbIntereses = New System.Windows.Forms.TextBox()
        Me.tbAnos = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.tbSuma = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.btnCalcular = New System.Windows.Forms.Button()
        Me.btnBorrar = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.tbMensual = New System.Windows.Forms.TextBox()
        Me.SuspendLayout()
        '
        'tbCapital
        '
        Me.tbCapital.Location = New System.Drawing.Point(49, 45)
        Me.tbCapital.Name = "tbCapital"
        Me.tbCapital.Size = New System.Drawing.Size(112, 22)
        Me.tbCapital.TabIndex = 0
        '
        'tbIntereses
        '
        Me.tbIntereses.Location = New System.Drawing.Point(197, 45)
        Me.tbIntereses.Name = "tbIntereses"
        Me.tbIntereses.Size = New System.Drawing.Size(112, 22)
        Me.tbIntereses.TabIndex = 1
        '
        'tbAnos
        '
        Me.tbAnos.Location = New System.Drawing.Point(353, 45)
        Me.tbAnos.Name = "tbAnos"
        Me.tbAnos.Size = New System.Drawing.Size(112, 22)
        Me.tbAnos.TabIndex = 2
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(46, 82)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(51, 17)
        Me.Label1.TabIndex = 3
        Me.Label1.Text = "Capital"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(194, 82)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(102, 17)
        Me.Label2.TabIndex = 4
        Me.Label2.Text = "% de intereses"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(350, 82)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(111, 17)
        Me.Label3.TabIndex = 5
        Me.Label3.Text = "periodo en años"
        '
        'tbSuma
        '
        Me.tbSuma.Location = New System.Drawing.Point(49, 119)
        Me.tbSuma.Multiline = True
        Me.tbSuma.Name = "tbSuma"
        Me.tbSuma.Size = New System.Drawing.Size(416, 70)
        Me.tbSuma.TabIndex = 6
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(110, 231)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(100, 17)
        Me.Label4.TabIndex = 7
        Me.Label4.Text = "cuota mensual"
        '
        'btnCalcular
        '
        Me.btnCalcular.Location = New System.Drawing.Point(49, 305)
        Me.btnCalcular.Name = "btnCalcular"
        Me.btnCalcular.Size = New System.Drawing.Size(75, 40)
        Me.btnCalcular.TabIndex = 9
        Me.btnCalcular.Text = "Calcular"
        Me.btnCalcular.UseVisualStyleBackColor = True
        '
        'btnBorrar
        '
        Me.btnBorrar.Location = New System.Drawing.Point(214, 305)
        Me.btnBorrar.Name = "btnBorrar"
        Me.btnBorrar.Size = New System.Drawing.Size(75, 40)
        Me.btnBorrar.TabIndex = 10
        Me.btnBorrar.Text = "Borrar"
        Me.btnBorrar.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(390, 305)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 40)
        Me.btnSalir.TabIndex = 11
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'tbMensual
        '
        Me.tbMensual.Location = New System.Drawing.Point(241, 231)
        Me.tbMensual.Name = "tbMensual"
        Me.tbMensual.Size = New System.Drawing.Size(112, 22)
        Me.tbMensual.TabIndex = 12
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(501, 367)
        Me.Controls.Add(Me.tbMensual)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnBorrar)
        Me.Controls.Add(Me.btnCalcular)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.tbSuma)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.tbAnos)
        Me.Controls.Add(Me.tbIntereses)
        Me.Controls.Add(Me.tbCapital)
        Me.Name = "Form1"
        Me.Text = "capital e intereses"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents tbCapital As TextBox
    Friend WithEvents tbIntereses As TextBox
    Friend WithEvents tbAnos As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents tbSuma As TextBox
    Friend WithEvents Label4 As Label
    Friend WithEvents btnCalcular As Button
    Friend WithEvents btnBorrar As Button
    Friend WithEvents btnSalir As Button
    Friend WithEvents tbMensual As TextBox
End Class
