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
        Me.btnBorrar = New System.Windows.Forms.Button()
        Me.tbBuscar = New System.Windows.Forms.TextBox()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'lbNombres
        '
        Me.lbNombres.FormattingEnabled = True
        Me.lbNombres.ItemHeight = 16
        Me.lbNombres.Items.AddRange(New Object() {"Jorge", "Ramon", "Valeriano", "Arguiñano", "Juan"})
        Me.lbNombres.Location = New System.Drawing.Point(38, 55)
        Me.lbNombres.Name = "lbNombres"
        Me.lbNombres.SelectionMode = System.Windows.Forms.SelectionMode.MultiSimple
        Me.lbNombres.Size = New System.Drawing.Size(120, 212)
        Me.lbNombres.TabIndex = 0
        '
        'btnBorrar
        '
        Me.btnBorrar.Location = New System.Drawing.Point(38, 287)
        Me.btnBorrar.Name = "btnBorrar"
        Me.btnBorrar.Size = New System.Drawing.Size(75, 23)
        Me.btnBorrar.TabIndex = 1
        Me.btnBorrar.Text = "Borrar"
        Me.btnBorrar.UseVisualStyleBackColor = True
        '
        'tbBuscar
        '
        Me.tbBuscar.Location = New System.Drawing.Point(206, 55)
        Me.tbBuscar.Name = "tbBuscar"
        Me.tbBuscar.Size = New System.Drawing.Size(100, 22)
        Me.tbBuscar.TabIndex = 2
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(206, 95)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(75, 23)
        Me.Button1.TabIndex = 3
        Me.Button1.Text = "Buscar"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(788, 488)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.tbBuscar)
        Me.Controls.Add(Me.btnBorrar)
        Me.Controls.Add(Me.lbNombres)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lbNombres As ListBox
    Friend WithEvents btnBorrar As Button
    Friend WithEvents tbBuscar As TextBox
    Friend WithEvents Button1 As Button
End Class
