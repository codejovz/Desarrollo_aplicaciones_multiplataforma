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
        Me.hsScrollActual = New System.Windows.Forms.HScrollBar()
        Me.hsScrollSnap = New System.Windows.Forms.HScrollBar()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.lblActualTemperature = New System.Windows.Forms.Label()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.lblExp = New System.Windows.Forms.Label()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'hsScrollActual
        '
        Me.hsScrollActual.Location = New System.Drawing.Point(74, 97)
        Me.hsScrollActual.Maximum = 59
        Me.hsScrollActual.Name = "hsScrollActual"
        Me.hsScrollActual.Size = New System.Drawing.Size(221, 21)
        Me.hsScrollActual.TabIndex = 0
        '
        'hsScrollSnap
        '
        Me.hsScrollSnap.Location = New System.Drawing.Point(74, 204)
        Me.hsScrollSnap.Maximum = 60
        Me.hsScrollSnap.Name = "hsScrollSnap"
        Me.hsScrollSnap.Size = New System.Drawing.Size(221, 21)
        Me.hsScrollSnap.SmallChange = 10
        Me.hsScrollSnap.TabIndex = 1
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(74, 49)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(30, 17)
        Me.Label1.TabIndex = 2
        Me.Label1.Text = "0ºC"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(257, 49)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(38, 17)
        Me.Label2.TabIndex = 3
        Me.Label2.Text = "50ºC"
        '
        'lblActualTemperature
        '
        Me.lblActualTemperature.AutoSize = True
        Me.lblActualTemperature.Location = New System.Drawing.Point(164, 134)
        Me.lblActualTemperature.Name = "lblActualTemperature"
        Me.lblActualTemperature.Size = New System.Drawing.Size(30, 17)
        Me.lblActualTemperature.TabIndex = 4
        Me.lblActualTemperature.Text = "0ºC"
        '
        'PictureBox1
        '
        Me.PictureBox1.Location = New System.Drawing.Point(440, 97)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(96, 83)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.PictureBox1.TabIndex = 5
        Me.PictureBox1.TabStop = False
        '
        'lblExp
        '
        Me.lblExp.AutoSize = True
        Me.lblExp.Location = New System.Drawing.Point(150, 244)
        Me.lblExp.Name = "lblExp"
        Me.lblExp.Size = New System.Drawing.Size(58, 17)
        Me.lblExp.TabIndex = 6
        Me.lblExp.Text = "Muy frio"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(579, 298)
        Me.Controls.Add(Me.lblExp)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.lblActualTemperature)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.hsScrollSnap)
        Me.Controls.Add(Me.hsScrollActual)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents hsScrollActual As HScrollBar
    Friend WithEvents hsScrollSnap As HScrollBar
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents lblActualTemperature As Label
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents lblExp As Label
End Class
