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
        Me.btnImagen = New System.Windows.Forms.Button()
        Me.btnFondo = New System.Windows.Forms.Button()
        Me.btnColLetra = New System.Windows.Forms.Button()
        Me.btnTipLetra = New System.Windows.Forms.Button()
        Me.btnAbrirApp = New System.Windows.Forms.Button()
        Me.lblDAM = New System.Windows.Forms.Label()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.FontDialog1 = New System.Windows.Forms.FontDialog()
        Me.ColorDialog1 = New System.Windows.Forms.ColorDialog()
        Me.OpenFileDialog1 = New System.Windows.Forms.OpenFileDialog()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'btnImagen
        '
        Me.btnImagen.Location = New System.Drawing.Point(212, 24)
        Me.btnImagen.Name = "btnImagen"
        Me.btnImagen.Size = New System.Drawing.Size(160, 23)
        Me.btnImagen.TabIndex = 0
        Me.btnImagen.Text = "IMAGEN"
        Me.btnImagen.UseVisualStyleBackColor = True
        '
        'btnFondo
        '
        Me.btnFondo.Location = New System.Drawing.Point(212, 63)
        Me.btnFondo.Name = "btnFondo"
        Me.btnFondo.Size = New System.Drawing.Size(160, 23)
        Me.btnFondo.TabIndex = 1
        Me.btnFondo.Text = "COLOR FONDO"
        Me.btnFondo.UseVisualStyleBackColor = True
        '
        'btnColLetra
        '
        Me.btnColLetra.Location = New System.Drawing.Point(212, 106)
        Me.btnColLetra.Name = "btnColLetra"
        Me.btnColLetra.Size = New System.Drawing.Size(160, 23)
        Me.btnColLetra.TabIndex = 2
        Me.btnColLetra.Text = "COLOR LETRA"
        Me.btnColLetra.UseVisualStyleBackColor = True
        '
        'btnTipLetra
        '
        Me.btnTipLetra.Location = New System.Drawing.Point(212, 147)
        Me.btnTipLetra.Name = "btnTipLetra"
        Me.btnTipLetra.Size = New System.Drawing.Size(160, 23)
        Me.btnTipLetra.TabIndex = 3
        Me.btnTipLetra.Text = "TIPO LETRA"
        Me.btnTipLetra.UseVisualStyleBackColor = True
        '
        'btnAbrirApp
        '
        Me.btnAbrirApp.Location = New System.Drawing.Point(212, 194)
        Me.btnAbrirApp.Name = "btnAbrirApp"
        Me.btnAbrirApp.Size = New System.Drawing.Size(160, 23)
        Me.btnAbrirApp.TabIndex = 4
        Me.btnAbrirApp.Text = "ABRIR APLICACION"
        Me.btnAbrirApp.UseVisualStyleBackColor = True
        '
        'lblDAM
        '
        Me.lblDAM.AutoSize = True
        Me.lblDAM.Font = New System.Drawing.Font("Microsoft Sans Serif", 7.8!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.lblDAM.Location = New System.Drawing.Point(77, 200)
        Me.lblDAM.Name = "lblDAM"
        Me.lblDAM.Size = New System.Drawing.Size(38, 17)
        Me.lblDAM.TabIndex = 5
        Me.lblDAM.Text = "DAM"
        '
        'PictureBox1
        '
        Me.PictureBox1.Location = New System.Drawing.Point(27, 24)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(151, 126)
        Me.PictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom
        Me.PictureBox1.TabIndex = 6
        Me.PictureBox1.TabStop = False
        '
        'OpenFileDialog1
        '
        Me.OpenFileDialog1.FileName = "OpenFileDialog1"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(393, 243)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.lblDAM)
        Me.Controls.Add(Me.btnAbrirApp)
        Me.Controls.Add(Me.btnTipLetra)
        Me.Controls.Add(Me.btnColLetra)
        Me.Controls.Add(Me.btnFondo)
        Me.Controls.Add(Me.btnImagen)
        Me.Name = "Form1"
        Me.Text = "CONTROLES DIALOGOS"
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnImagen As Button
    Friend WithEvents btnFondo As Button
    Friend WithEvents btnColLetra As Button
    Friend WithEvents btnTipLetra As Button
    Friend WithEvents btnAbrirApp As Button
    Friend WithEvents lblDAM As Label
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents FontDialog1 As FontDialog
    Friend WithEvents ColorDialog1 As ColorDialog
    Friend WithEvents OpenFileDialog1 As OpenFileDialog
End Class
