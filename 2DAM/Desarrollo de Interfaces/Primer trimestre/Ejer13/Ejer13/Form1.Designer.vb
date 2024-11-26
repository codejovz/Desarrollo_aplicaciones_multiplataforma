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
        Me.lbNombres = New System.Windows.Forms.ListBox()
        Me.btnAlta = New System.Windows.Forms.Button()
        Me.btnBaja = New System.Windows.Forms.Button()
        Me.btnNueva = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.tbAnadir = New System.Windows.Forms.TextBox()
        Me.tbElementoSeleccionado = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'lbNombres
        '
        Me.lbNombres.FormattingEnabled = True
        Me.lbNombres.ItemHeight = 16
        Me.lbNombres.Location = New System.Drawing.Point(53, 26)
        Me.lbNombres.Name = "lbNombres"
        Me.lbNombres.Size = New System.Drawing.Size(123, 132)
        Me.lbNombres.TabIndex = 0
        '
        'btnAlta
        '
        Me.btnAlta.Location = New System.Drawing.Point(296, 26)
        Me.btnAlta.Name = "btnAlta"
        Me.btnAlta.Size = New System.Drawing.Size(75, 43)
        Me.btnAlta.TabIndex = 1
        Me.btnAlta.Text = "Alta"
        Me.btnAlta.UseVisualStyleBackColor = True
        '
        'btnBaja
        '
        Me.btnBaja.Location = New System.Drawing.Point(296, 90)
        Me.btnBaja.Name = "btnBaja"
        Me.btnBaja.Size = New System.Drawing.Size(75, 37)
        Me.btnBaja.TabIndex = 2
        Me.btnBaja.Text = "Baja"
        Me.btnBaja.UseVisualStyleBackColor = True
        '
        'btnNueva
        '
        Me.btnNueva.Location = New System.Drawing.Point(296, 150)
        Me.btnNueva.Name = "btnNueva"
        Me.btnNueva.Size = New System.Drawing.Size(75, 37)
        Me.btnNueva.TabIndex = 3
        Me.btnNueva.Text = "Nueva"
        Me.btnNueva.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(296, 210)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 33)
        Me.btnSalir.TabIndex = 4
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'tbAnadir
        '
        Me.tbAnadir.Location = New System.Drawing.Point(53, 200)
        Me.tbAnadir.Name = "tbAnadir"
        Me.tbAnadir.Size = New System.Drawing.Size(158, 22)
        Me.tbAnadir.TabIndex = 5
        '
        'tbElementoSeleccionado
        '
        Me.tbElementoSeleccionado.Location = New System.Drawing.Point(53, 266)
        Me.tbElementoSeleccionado.Name = "tbElementoSeleccionado"
        Me.tbElementoSeleccionado.Size = New System.Drawing.Size(158, 22)
        Me.tbElementoSeleccionado.TabIndex = 6
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(57, 180)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(111, 17)
        Me.Label1.TabIndex = 7
        Me.Label1.Text = "Elemento añadir"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(57, 246)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(154, 17)
        Me.Label2.TabIndex = 8
        Me.Label2.Text = "Elemento seleccionado"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(400, 319)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.tbElementoSeleccionado)
        Me.Controls.Add(Me.tbAnadir)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnNueva)
        Me.Controls.Add(Me.btnBaja)
        Me.Controls.Add(Me.btnAlta)
        Me.Controls.Add(Me.lbNombres)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lbNombres As ListBox
    Friend WithEvents btnAlta As Button
    Friend WithEvents btnBaja As Button
    Friend WithEvents btnNueva As Button
    Friend WithEvents btnSalir As Button
    Friend WithEvents tbAnadir As TextBox
    Friend WithEvents tbElementoSeleccionado As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
End Class
