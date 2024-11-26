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
        Me.btnNuevo = New System.Windows.Forms.Button()
        Me.btnTotal = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.tbConcepto = New System.Windows.Forms.TextBox()
        Me.tbCant = New System.Windows.Forms.TextBox()
        Me.tbPU = New System.Windows.Forms.TextBox()
        Me.tbDTO = New System.Windows.Forms.TextBox()
        Me.tbPVP = New System.Windows.Forms.TextBox()
        Me.tbTotal = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.lbl3 = New System.Windows.Forms.Label()
        Me.lblDTO = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'btnNuevo
        '
        Me.btnNuevo.Location = New System.Drawing.Point(51, 290)
        Me.btnNuevo.Name = "btnNuevo"
        Me.btnNuevo.Size = New System.Drawing.Size(75, 23)
        Me.btnNuevo.TabIndex = 0
        Me.btnNuevo.Text = "Nuevo"
        Me.btnNuevo.UseVisualStyleBackColor = True
        '
        'btnTotal
        '
        Me.btnTotal.Location = New System.Drawing.Point(204, 290)
        Me.btnTotal.Name = "btnTotal"
        Me.btnTotal.Size = New System.Drawing.Size(75, 23)
        Me.btnTotal.TabIndex = 1
        Me.btnTotal.Text = "Total"
        Me.btnTotal.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(402, 290)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 23)
        Me.btnSalir.TabIndex = 2
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'tbConcepto
        '
        Me.tbConcepto.Location = New System.Drawing.Point(51, 67)
        Me.tbConcepto.Name = "tbConcepto"
        Me.tbConcepto.Size = New System.Drawing.Size(100, 22)
        Me.tbConcepto.TabIndex = 3
        '
        'tbCant
        '
        Me.tbCant.Location = New System.Drawing.Point(170, 67)
        Me.tbCant.Name = "tbCant"
        Me.tbCant.Size = New System.Drawing.Size(100, 22)
        Me.tbCant.TabIndex = 4
        '
        'tbPU
        '
        Me.tbPU.Location = New System.Drawing.Point(297, 67)
        Me.tbPU.Name = "tbPU"
        Me.tbPU.Size = New System.Drawing.Size(100, 22)
        Me.tbPU.TabIndex = 5
        '
        'tbDTO
        '
        Me.tbDTO.Location = New System.Drawing.Point(424, 67)
        Me.tbDTO.Name = "tbDTO"
        Me.tbDTO.Size = New System.Drawing.Size(72, 22)
        Me.tbDTO.TabIndex = 6
        '
        'tbPVP
        '
        Me.tbPVP.Location = New System.Drawing.Point(529, 67)
        Me.tbPVP.Name = "tbPVP"
        Me.tbPVP.Size = New System.Drawing.Size(100, 22)
        Me.tbPVP.TabIndex = 7
        '
        'tbTotal
        '
        Me.tbTotal.Location = New System.Drawing.Point(179, 212)
        Me.tbTotal.Name = "tbTotal"
        Me.tbTotal.Size = New System.Drawing.Size(298, 22)
        Me.tbTotal.TabIndex = 8
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(48, 33)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(85, 17)
        Me.Label1.TabIndex = 9
        Me.Label1.Text = "CONCEPTO"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(167, 33)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(45, 17)
        Me.Label2.TabIndex = 10
        Me.Label2.Text = "CANT"
        '
        'lbl3
        '
        Me.lbl3.AutoSize = True
        Me.lbl3.Location = New System.Drawing.Point(294, 33)
        Me.lbl3.Name = "lbl3"
        Me.lbl3.Size = New System.Drawing.Size(31, 17)
        Me.lbl3.TabIndex = 11
        Me.lbl3.Text = "P/U"
        '
        'lblDTO
        '
        Me.lblDTO.AutoSize = True
        Me.lblDTO.Location = New System.Drawing.Point(421, 33)
        Me.lblDTO.Name = "lblDTO"
        Me.lblDTO.Size = New System.Drawing.Size(50, 17)
        Me.lblDTO.TabIndex = 12
        Me.lblDTO.Text = "D.T.O."
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(526, 33)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(47, 17)
        Me.Label5.TabIndex = 13
        Me.Label5.Text = "P.V.P."
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(48, 212)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(58, 17)
        Me.Label6.TabIndex = 14
        Me.Label6.Text = "TOTAL:"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.lblDTO)
        Me.Controls.Add(Me.lbl3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.tbTotal)
        Me.Controls.Add(Me.tbPVP)
        Me.Controls.Add(Me.tbDTO)
        Me.Controls.Add(Me.tbPU)
        Me.Controls.Add(Me.tbCant)
        Me.Controls.Add(Me.tbConcepto)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnTotal)
        Me.Controls.Add(Me.btnNuevo)
        Me.Name = "Form1"
        Me.Text = "GESTION ARTICULOS"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents btnNuevo As Button
    Friend WithEvents btnTotal As Button
    Friend WithEvents btnSalir As Button
    Friend WithEvents tbConcepto As TextBox
    Friend WithEvents tbCant As TextBox
    Friend WithEvents tbPU As TextBox
    Friend WithEvents tbDTO As TextBox
    Friend WithEvents tbPVP As TextBox
    Friend WithEvents tbTotal As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents lbl3 As Label
    Friend WithEvents lblDTO As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents Label6 As Label
End Class
