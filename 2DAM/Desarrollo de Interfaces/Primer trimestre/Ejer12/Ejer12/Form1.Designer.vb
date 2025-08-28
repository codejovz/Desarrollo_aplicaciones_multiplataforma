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
        Me.ListBox1 = New System.Windows.Forms.ListBox()
        Me.tbPais = New System.Windows.Forms.TextBox()
        Me.tbSaludo = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.pbPais = New System.Windows.Forms.PictureBox()
        CType(Me.pbPais, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'ListBox1
        '
        Me.ListBox1.FormattingEnabled = True
        Me.ListBox1.ItemHeight = 16
        Me.ListBox1.Items.AddRange(New Object() {"Alemania", "España", "Italia", "Inglaterra"})
        Me.ListBox1.Location = New System.Drawing.Point(145, 61)
        Me.ListBox1.Name = "ListBox1"
        Me.ListBox1.Size = New System.Drawing.Size(156, 164)
        Me.ListBox1.TabIndex = 0
        '
        'tbPais
        '
        Me.tbPais.Location = New System.Drawing.Point(422, 77)
        Me.tbPais.Name = "tbPais"
        Me.tbPais.Size = New System.Drawing.Size(100, 22)
        Me.tbPais.TabIndex = 1
        '
        'tbSaludo
        '
        Me.tbSaludo.Location = New System.Drawing.Point(422, 145)
        Me.tbSaludo.Name = "tbSaludo"
        Me.tbSaludo.Size = New System.Drawing.Size(100, 22)
        Me.tbSaludo.TabIndex = 2
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(422, 57)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(35, 17)
        Me.Label1.TabIndex = 3
        Me.Label1.Text = "Pais"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(422, 115)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(52, 17)
        Me.Label2.TabIndex = 4
        Me.Label2.Text = "Saludo"
        '
        'pbPais
        '
        Me.pbPais.Location = New System.Drawing.Point(566, 57)
        Me.pbPais.Name = "pbPais"
        Me.pbPais.Size = New System.Drawing.Size(148, 157)
        Me.pbPais.TabIndex = 5
        Me.pbPais.TabStop = False
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 267)
        Me.Controls.Add(Me.pbPais)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.tbSaludo)
        Me.Controls.Add(Me.tbPais)
        Me.Controls.Add(Me.ListBox1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.pbPais, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents ListBox1 As ListBox
    Friend WithEvents tbPais As TextBox
    Friend WithEvents tbSaludo As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents pbPais As PictureBox
End Class
