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
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.lbAlumno = New System.Windows.Forms.ListBox()
        Me.lbOptativa = New System.Windows.Forms.ListBox()
        Me.btnAnadir = New System.Windows.Forms.Button()
        Me.btnEliminar = New System.Windows.Forms.Button()
        Me.btnVaciar = New System.Windows.Forms.Button()
        Me.btnFin = New System.Windows.Forms.Button()
        Me.tbNombre = New System.Windows.Forms.TextBox()
        Me.cbAsignaturas = New System.Windows.Forms.ComboBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(12, 39)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(67, 17)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "ALUMNO"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(171, 39)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(76, 17)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "OPTATIVA"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(332, 39)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(108, 17)
        Me.Label3.TabIndex = 2
        Me.Label3.Text = "Nombre alumno"
        '
        'lbAlumno
        '
        Me.lbAlumno.FormattingEnabled = True
        Me.lbAlumno.ItemHeight = 16
        Me.lbAlumno.Location = New System.Drawing.Point(16, 78)
        Me.lbAlumno.Name = "lbAlumno"
        Me.lbAlumno.SelectionMode = System.Windows.Forms.SelectionMode.MultiSimple
        Me.lbAlumno.Size = New System.Drawing.Size(120, 148)
        Me.lbAlumno.TabIndex = 3
        '
        'lbOptativa
        '
        Me.lbOptativa.FormattingEnabled = True
        Me.lbOptativa.ItemHeight = 16
        Me.lbOptativa.Location = New System.Drawing.Point(162, 78)
        Me.lbOptativa.Name = "lbOptativa"
        Me.lbOptativa.SelectionMode = System.Windows.Forms.SelectionMode.MultiSimple
        Me.lbOptativa.Size = New System.Drawing.Size(120, 148)
        Me.lbOptativa.TabIndex = 4
        '
        'btnAnadir
        '
        Me.btnAnadir.Location = New System.Drawing.Point(16, 256)
        Me.btnAnadir.Name = "btnAnadir"
        Me.btnAnadir.Size = New System.Drawing.Size(75, 23)
        Me.btnAnadir.TabIndex = 5
        Me.btnAnadir.Text = "AÑADIR"
        Me.btnAnadir.UseVisualStyleBackColor = True
        '
        'btnEliminar
        '
        Me.btnEliminar.Location = New System.Drawing.Point(120, 256)
        Me.btnEliminar.Name = "btnEliminar"
        Me.btnEliminar.Size = New System.Drawing.Size(84, 23)
        Me.btnEliminar.TabIndex = 6
        Me.btnEliminar.Text = "ELIMINAR"
        Me.btnEliminar.UseVisualStyleBackColor = True
        '
        'btnVaciar
        '
        Me.btnVaciar.Location = New System.Drawing.Point(242, 256)
        Me.btnVaciar.Name = "btnVaciar"
        Me.btnVaciar.Size = New System.Drawing.Size(75, 23)
        Me.btnVaciar.TabIndex = 7
        Me.btnVaciar.Text = "VACIAR"
        Me.btnVaciar.UseVisualStyleBackColor = True
        '
        'btnFin
        '
        Me.btnFin.Location = New System.Drawing.Point(365, 256)
        Me.btnFin.Name = "btnFin"
        Me.btnFin.Size = New System.Drawing.Size(75, 23)
        Me.btnFin.TabIndex = 8
        Me.btnFin.Text = "FIN"
        Me.btnFin.UseVisualStyleBackColor = True
        '
        'tbNombre
        '
        Me.tbNombre.Location = New System.Drawing.Point(335, 78)
        Me.tbNombre.Name = "tbNombre"
        Me.tbNombre.Size = New System.Drawing.Size(121, 22)
        Me.tbNombre.TabIndex = 9
        '
        'cbAsignaturas
        '
        Me.cbAsignaturas.FormattingEnabled = True
        Me.cbAsignaturas.Items.AddRange(New Object() {"Informatica", "Historia del arte", "Matematicas", "Latin", "Economia"})
        Me.cbAsignaturas.Location = New System.Drawing.Point(335, 170)
        Me.cbAsignaturas.Name = "cbAsignaturas"
        Me.cbAsignaturas.Size = New System.Drawing.Size(121, 24)
        Me.cbAsignaturas.TabIndex = 10
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(332, 133)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(83, 34)
        Me.Label4.TabIndex = 11
        Me.Label4.Text = "Asignaturas" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "optativas"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.cbAsignaturas)
        Me.Controls.Add(Me.tbNombre)
        Me.Controls.Add(Me.btnFin)
        Me.Controls.Add(Me.btnVaciar)
        Me.Controls.Add(Me.btnEliminar)
        Me.Controls.Add(Me.btnAnadir)
        Me.Controls.Add(Me.lbOptativa)
        Me.Controls.Add(Me.lbAlumno)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents lbAlumno As ListBox
    Friend WithEvents lbOptativa As ListBox
    Friend WithEvents btnAnadir As Button
    Friend WithEvents btnEliminar As Button
    Friend WithEvents btnVaciar As Button
    Friend WithEvents btnFin As Button
    Friend WithEvents tbNombre As TextBox
    Friend WithEvents cbAsignaturas As ComboBox
    Friend WithEvents Label4 As Label
End Class
