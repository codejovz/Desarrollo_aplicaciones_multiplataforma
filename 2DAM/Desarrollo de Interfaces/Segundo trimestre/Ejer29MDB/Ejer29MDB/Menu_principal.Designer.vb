<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Menu_principal
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
        Me.Label1 = New System.Windows.Forms.Label()
        Me.btnOperar = New System.Windows.Forms.Button()
        Me.btnGestion = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(106, 39)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(132, 34)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "BANCO " & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "IES VISTA ALEGRE"
        Me.Label1.TextAlign = System.Drawing.ContentAlignment.TopCenter
        '
        'btnOperar
        '
        Me.btnOperar.Location = New System.Drawing.Point(48, 110)
        Me.btnOperar.Name = "btnOperar"
        Me.btnOperar.Size = New System.Drawing.Size(95, 50)
        Me.btnOperar.TabIndex = 1
        Me.btnOperar.Text = "OPERAR"
        Me.btnOperar.UseVisualStyleBackColor = True
        '
        'btnGestion
        '
        Me.btnGestion.Location = New System.Drawing.Point(197, 110)
        Me.btnGestion.Name = "btnGestion"
        Me.btnGestion.Size = New System.Drawing.Size(95, 50)
        Me.btnGestion.TabIndex = 2
        Me.btnGestion.Text = "GESTIÓN"
        Me.btnGestion.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(123, 178)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(95, 29)
        Me.btnSalir.TabIndex = 3
        Me.btnSalir.Text = "SALIR"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'Menu_principal
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(356, 265)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnGestion)
        Me.Controls.Add(Me.btnOperar)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Menu_principal"
        Me.Text = "BANCO"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents btnOperar As Button
    Friend WithEvents btnGestion As Button
    Friend WithEvents btnSalir As Button
End Class
