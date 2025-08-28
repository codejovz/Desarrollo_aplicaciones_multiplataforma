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
        Me.btnCalcular = New System.Windows.Forms.Button()
        Me.btnRestaurar = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.lblCentigrados = New System.Windows.Forms.Label()
        Me.lblFarenheit = New System.Windows.Forms.Label()
        Me.tbCent = New System.Windows.Forms.TextBox()
        Me.tbFare = New System.Windows.Forms.TextBox()
        Me.btnMensaje = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'btnCalcular
        '
        Me.btnCalcular.Location = New System.Drawing.Point(74, 179)
        Me.btnCalcular.Name = "btnCalcular"
        Me.btnCalcular.Size = New System.Drawing.Size(75, 23)
        Me.btnCalcular.TabIndex = 0
        Me.btnCalcular.Text = "Calcular"
        Me.btnCalcular.UseVisualStyleBackColor = True
        '
        'btnRestaurar
        '
        Me.btnRestaurar.Location = New System.Drawing.Point(191, 179)
        Me.btnRestaurar.Name = "btnRestaurar"
        Me.btnRestaurar.Size = New System.Drawing.Size(86, 23)
        Me.btnRestaurar.TabIndex = 1
        Me.btnRestaurar.Text = "Restaurar"
        Me.btnRestaurar.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(133, 222)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 23)
        Me.btnSalir.TabIndex = 2
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'lblCentigrados
        '
        Me.lblCentigrados.AutoSize = True
        Me.lblCentigrados.Location = New System.Drawing.Point(50, 54)
        Me.lblCentigrados.Name = "lblCentigrados"
        Me.lblCentigrados.Size = New System.Drawing.Size(133, 17)
        Me.lblCentigrados.TabIndex = 3
        Me.lblCentigrados.Text = "Grados centigrados"
        '
        'lblFarenheit
        '
        Me.lblFarenheit.AutoSize = True
        Me.lblFarenheit.Location = New System.Drawing.Point(50, 106)
        Me.lblFarenheit.Name = "lblFarenheit"
        Me.lblFarenheit.Size = New System.Drawing.Size(119, 17)
        Me.lblFarenheit.TabIndex = 4
        Me.lblFarenheit.Text = "Grados Farenheit"
        '
        'tbCent
        '
        Me.tbCent.Location = New System.Drawing.Point(245, 49)
        Me.tbCent.Name = "tbCent"
        Me.tbCent.Size = New System.Drawing.Size(122, 22)
        Me.tbCent.TabIndex = 5
        '
        'tbFare
        '
        Me.tbFare.Location = New System.Drawing.Point(245, 101)
        Me.tbFare.Name = "tbFare"
        Me.tbFare.Size = New System.Drawing.Size(122, 22)
        Me.tbFare.TabIndex = 6
        '
        'btnMensaje
        '
        Me.btnMensaje.Location = New System.Drawing.Point(311, 179)
        Me.btnMensaje.Name = "btnMensaje"
        Me.btnMensaje.Size = New System.Drawing.Size(75, 66)
        Me.btnMensaje.TabIndex = 7
        Me.btnMensaje.Text = "Mostrar mensaje"
        Me.btnMensaje.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(415, 270)
        Me.Controls.Add(Me.btnMensaje)
        Me.Controls.Add(Me.tbFare)
        Me.Controls.Add(Me.tbCent)
        Me.Controls.Add(Me.lblFarenheit)
        Me.Controls.Add(Me.lblCentigrados)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnRestaurar)
        Me.Controls.Add(Me.btnCalcular)
        Me.Name = "Form1"
        Me.Text = "Conversion de temperaturas"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnCalcular As Button
    Friend WithEvents btnRestaurar As Button
    Friend WithEvents btnSalir As Button
    Friend WithEvents lblCentigrados As Label
    Friend WithEvents lblFarenheit As Label
    Friend WithEvents tbCent As TextBox
    Friend WithEvents tbFare As TextBox
    Friend WithEvents btnMensaje As Button
End Class
