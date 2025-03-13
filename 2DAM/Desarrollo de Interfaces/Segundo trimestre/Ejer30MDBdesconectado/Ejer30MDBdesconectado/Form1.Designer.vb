<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()>
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
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.btnVer = New System.Windows.Forms.Button()
        Me.lbNombre = New System.Windows.Forms.ListBox()
        Me.lbDireccion = New System.Windows.Forms.ListBox()
        Me.lbTelefono = New System.Windows.Forms.ListBox()
        Me.btnInsertar = New System.Windows.Forms.Button()
        Me.tbNombre = New System.Windows.Forms.TextBox()
        Me.tbDireccion = New System.Windows.Forms.TextBox()
        Me.tbTelefono = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.tbNumCuenta = New System.Windows.Forms.TextBox()
        Me.lbNumeroCuenta = New System.Windows.Forms.ListBox()
        Me.btnModificar = New System.Windows.Forms.Button()
        Me.btnBuscar = New System.Windows.Forms.Button()
        Me.btnEliminar = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(627, 31)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(75, 23)
        Me.Button1.TabIndex = 0
        Me.Button1.Text = "Cargar"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'btnVer
        '
        Me.btnVer.Enabled = False
        Me.btnVer.Location = New System.Drawing.Point(627, 90)
        Me.btnVer.Name = "btnVer"
        Me.btnVer.Size = New System.Drawing.Size(75, 23)
        Me.btnVer.TabIndex = 1
        Me.btnVer.Text = "Ver"
        Me.btnVer.UseVisualStyleBackColor = True
        '
        'lbNombre
        '
        Me.lbNombre.FormattingEnabled = True
        Me.lbNombre.ItemHeight = 16
        Me.lbNombre.Location = New System.Drawing.Point(165, 31)
        Me.lbNombre.Name = "lbNombre"
        Me.lbNombre.Size = New System.Drawing.Size(132, 228)
        Me.lbNombre.TabIndex = 2
        '
        'lbDireccion
        '
        Me.lbDireccion.FormattingEnabled = True
        Me.lbDireccion.ItemHeight = 16
        Me.lbDireccion.Location = New System.Drawing.Point(305, 31)
        Me.lbDireccion.Name = "lbDireccion"
        Me.lbDireccion.Size = New System.Drawing.Size(132, 228)
        Me.lbDireccion.TabIndex = 3
        '
        'lbTelefono
        '
        Me.lbTelefono.FormattingEnabled = True
        Me.lbTelefono.ItemHeight = 16
        Me.lbTelefono.Location = New System.Drawing.Point(453, 31)
        Me.lbTelefono.Name = "lbTelefono"
        Me.lbTelefono.Size = New System.Drawing.Size(132, 228)
        Me.lbTelefono.TabIndex = 4
        '
        'btnInsertar
        '
        Me.btnInsertar.Enabled = False
        Me.btnInsertar.Location = New System.Drawing.Point(501, 344)
        Me.btnInsertar.Name = "btnInsertar"
        Me.btnInsertar.Size = New System.Drawing.Size(75, 23)
        Me.btnInsertar.TabIndex = 5
        Me.btnInsertar.Text = "Insertar"
        Me.btnInsertar.UseVisualStyleBackColor = True
        '
        'tbNombre
        '
        Me.tbNombre.Location = New System.Drawing.Point(165, 302)
        Me.tbNombre.Name = "tbNombre"
        Me.tbNombre.Size = New System.Drawing.Size(132, 22)
        Me.tbNombre.TabIndex = 6
        '
        'tbDireccion
        '
        Me.tbDireccion.Location = New System.Drawing.Point(303, 302)
        Me.tbDireccion.Name = "tbDireccion"
        Me.tbDireccion.Size = New System.Drawing.Size(132, 22)
        Me.tbDireccion.TabIndex = 7
        '
        'tbTelefono
        '
        Me.tbTelefono.Location = New System.Drawing.Point(453, 302)
        Me.tbTelefono.Name = "tbTelefono"
        Me.tbTelefono.Size = New System.Drawing.Size(132, 22)
        Me.tbTelefono.TabIndex = 8
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(162, 282)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(58, 17)
        Me.Label1.TabIndex = 9
        Me.Label1.Text = "Nombre"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(300, 282)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(67, 17)
        Me.Label2.TabIndex = 10
        Me.Label2.Text = "Direccion"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(450, 282)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(64, 17)
        Me.Label3.TabIndex = 11
        Me.Label3.Text = "Telefono"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(20, 282)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(84, 17)
        Me.Label4.TabIndex = 14
        Me.Label4.Text = "Num cuenta"
        '
        'tbNumCuenta
        '
        Me.tbNumCuenta.Location = New System.Drawing.Point(23, 302)
        Me.tbNumCuenta.Name = "tbNumCuenta"
        Me.tbNumCuenta.Size = New System.Drawing.Size(132, 22)
        Me.tbNumCuenta.TabIndex = 13
        '
        'lbNumeroCuenta
        '
        Me.lbNumeroCuenta.FormattingEnabled = True
        Me.lbNumeroCuenta.ItemHeight = 16
        Me.lbNumeroCuenta.Location = New System.Drawing.Point(23, 31)
        Me.lbNumeroCuenta.Name = "lbNumeroCuenta"
        Me.lbNumeroCuenta.Size = New System.Drawing.Size(132, 228)
        Me.lbNumeroCuenta.TabIndex = 12
        '
        'btnModificar
        '
        Me.btnModificar.Enabled = False
        Me.btnModificar.Location = New System.Drawing.Point(382, 344)
        Me.btnModificar.Name = "btnModificar"
        Me.btnModificar.Size = New System.Drawing.Size(87, 23)
        Me.btnModificar.TabIndex = 15
        Me.btnModificar.Text = "Modificar"
        Me.btnModificar.UseVisualStyleBackColor = True
        '
        'btnBuscar
        '
        Me.btnBuscar.Enabled = False
        Me.btnBuscar.Location = New System.Drawing.Point(292, 344)
        Me.btnBuscar.Name = "btnBuscar"
        Me.btnBuscar.Size = New System.Drawing.Size(75, 23)
        Me.btnBuscar.TabIndex = 16
        Me.btnBuscar.Text = "Buscar"
        Me.btnBuscar.UseVisualStyleBackColor = True
        '
        'btnEliminar
        '
        Me.btnEliminar.Enabled = False
        Me.btnEliminar.Location = New System.Drawing.Point(161, 344)
        Me.btnEliminar.Name = "btnEliminar"
        Me.btnEliminar.Size = New System.Drawing.Size(82, 23)
        Me.btnEliminar.TabIndex = 17
        Me.btnEliminar.Text = "Eliminar"
        Me.btnEliminar.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(723, 392)
        Me.Controls.Add(Me.btnEliminar)
        Me.Controls.Add(Me.btnBuscar)
        Me.Controls.Add(Me.btnModificar)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.tbNumCuenta)
        Me.Controls.Add(Me.lbNumeroCuenta)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.tbTelefono)
        Me.Controls.Add(Me.tbDireccion)
        Me.Controls.Add(Me.tbNombre)
        Me.Controls.Add(Me.btnInsertar)
        Me.Controls.Add(Me.lbTelefono)
        Me.Controls.Add(Me.lbDireccion)
        Me.Controls.Add(Me.lbNombre)
        Me.Controls.Add(Me.btnVer)
        Me.Controls.Add(Me.Button1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Button1 As Button
    Friend WithEvents btnVer As Button
    Friend WithEvents lbNombre As ListBox
    Friend WithEvents lbDireccion As ListBox
    Friend WithEvents lbTelefono As ListBox
    Friend WithEvents btnInsertar As Button
    Friend WithEvents tbNombre As TextBox
    Friend WithEvents tbDireccion As TextBox
    Friend WithEvents tbTelefono As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents tbNumCuenta As TextBox
    Friend WithEvents lbNumeroCuenta As ListBox
    Friend WithEvents btnModificar As Button
    Friend WithEvents btnBuscar As Button
    Friend WithEvents btnEliminar As Button
End Class
