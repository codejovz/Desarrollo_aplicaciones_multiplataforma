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
        Me.HSS = New System.Windows.Forms.HScrollBar()
        Me.VSS = New System.Windows.Forms.VScrollBar()
        Me.pcPais = New System.Windows.Forms.PictureBox()
        CType(Me.pcPais, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'HSS
        '
        Me.HSS.LargeChange = 30
        Me.HSS.Location = New System.Drawing.Point(9, 303)
        Me.HSS.Maximum = 300
        Me.HSS.Minimum = 5
        Me.HSS.Name = "HSS"
        Me.HSS.Size = New System.Drawing.Size(405, 33)
        Me.HSS.TabIndex = 0
        Me.HSS.Value = 5
        '
        'VSS
        '
        Me.VSS.Location = New System.Drawing.Point(443, 9)
        Me.VSS.Maximum = 200
        Me.VSS.Minimum = 5
        Me.VSS.Name = "VSS"
        Me.VSS.Size = New System.Drawing.Size(34, 245)
        Me.VSS.TabIndex = 1
        Me.VSS.Value = 5
        '
        'pcPais
        '
        Me.pcPais.Image = Global.Ejer20_scrollbar.My.Resources.Resources.inglaterra
        Me.pcPais.Location = New System.Drawing.Point(22, 12)
        Me.pcPais.Name = "pcPais"
        Me.pcPais.Size = New System.Drawing.Size(127, 84)
        Me.pcPais.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.pcPais.TabIndex = 2
        Me.pcPais.TabStop = False
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(491, 341)
        Me.Controls.Add(Me.pcPais)
        Me.Controls.Add(Me.VSS)
        Me.Controls.Add(Me.HSS)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.pcPais, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents HSS As HScrollBar
    Friend WithEvents VSS As VScrollBar
    Friend WithEvents pcPais As PictureBox
End Class
