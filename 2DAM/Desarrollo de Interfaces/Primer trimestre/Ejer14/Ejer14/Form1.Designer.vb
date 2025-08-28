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
        Me.lbPrimera = New System.Windows.Forms.ListBox()
        Me.lbSegunda = New System.Windows.Forms.ListBox()
        Me.lbTercera = New System.Windows.Forms.ListBox()
        Me.btnDerecha = New System.Windows.Forms.Button()
        Me.btnIzquierda = New System.Windows.Forms.Button()
        Me.btnAbajo = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'lbPrimera
        '
        Me.lbPrimera.FormattingEnabled = True
        Me.lbPrimera.ItemHeight = 16
        Me.lbPrimera.Items.AddRange(New Object() {"azul", "verde", "amarillo", "rojo"})
        Me.lbPrimera.Location = New System.Drawing.Point(36, 43)
        Me.lbPrimera.Name = "lbPrimera"
        Me.lbPrimera.Size = New System.Drawing.Size(135, 148)
        Me.lbPrimera.TabIndex = 0
        '
        'lbSegunda
        '
        Me.lbSegunda.FormattingEnabled = True
        Me.lbSegunda.ItemHeight = 16
        Me.lbSegunda.Items.AddRange(New Object() {"pera", "naranja", "melon"})
        Me.lbSegunda.Location = New System.Drawing.Point(407, 43)
        Me.lbSegunda.Name = "lbSegunda"
        Me.lbSegunda.Size = New System.Drawing.Size(135, 148)
        Me.lbSegunda.TabIndex = 1
        '
        'lbTercera
        '
        Me.lbTercera.FormattingEnabled = True
        Me.lbTercera.ItemHeight = 16
        Me.lbTercera.Items.AddRange(New Object() {"blanco", "manzana"})
        Me.lbTercera.Location = New System.Drawing.Point(209, 253)
        Me.lbTercera.Name = "lbTercera"
        Me.lbTercera.Size = New System.Drawing.Size(135, 148)
        Me.lbTercera.TabIndex = 2
        '
        'btnDerecha
        '
        Me.btnDerecha.Location = New System.Drawing.Point(241, 59)
        Me.btnDerecha.Name = "btnDerecha"
        Me.btnDerecha.Size = New System.Drawing.Size(75, 23)
        Me.btnDerecha.TabIndex = 3
        Me.btnDerecha.Text = "=>"
        Me.btnDerecha.UseVisualStyleBackColor = True
        '
        'btnIzquierda
        '
        Me.btnIzquierda.Location = New System.Drawing.Point(241, 114)
        Me.btnIzquierda.Name = "btnIzquierda"
        Me.btnIzquierda.Size = New System.Drawing.Size(75, 23)
        Me.btnIzquierda.TabIndex = 4
        Me.btnIzquierda.Text = "<="
        Me.btnIzquierda.UseVisualStyleBackColor = True
        '
        'btnAbajo
        '
        Me.btnAbajo.Location = New System.Drawing.Point(241, 167)
        Me.btnAbajo.Name = "btnAbajo"
        Me.btnAbajo.Size = New System.Drawing.Size(75, 60)
        Me.btnAbajo.TabIndex = 5
        Me.btnAbajo.Text = "| |" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "\/"
        Me.btnAbajo.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(100, 294)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(82, 17)
        Me.Label1.TabIndex = 6
        Me.Label1.Text = "tercera lista"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(33, 9)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(85, 17)
        Me.Label2.TabIndex = 7
        Me.Label2.Text = "primera lista"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(404, 9)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(92, 17)
        Me.Label3.TabIndex = 8
        Me.Label3.Text = "segunda lista"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(576, 450)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.btnAbajo)
        Me.Controls.Add(Me.btnIzquierda)
        Me.Controls.Add(Me.btnDerecha)
        Me.Controls.Add(Me.lbTercera)
        Me.Controls.Add(Me.lbSegunda)
        Me.Controls.Add(Me.lbPrimera)
        Me.Name = "Form1"
        Me.Text = "Pasar un elemento entre listas"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents lbPrimera As ListBox
    Friend WithEvents lbSegunda As ListBox
    Friend WithEvents lbTercera As ListBox
    Friend WithEvents btnDerecha As Button
    Friend WithEvents btnIzquierda As Button
    Friend WithEvents btnAbajo As Button
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
End Class
