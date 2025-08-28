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
        Me.tbTitulo = New System.Windows.Forms.TextBox()
        Me.tbAutor = New System.Windows.Forms.TextBox()
        Me.tbNumeroPg = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.btnNuevo = New System.Windows.Forms.Button()
        Me.btnAltas = New System.Windows.Forms.Button()
        Me.btnBajas = New System.Windows.Forms.Button()
        Me.btnSalir = New System.Windows.Forms.Button()
        Me.gbFormato = New System.Windows.Forms.GroupBox()
        Me.ckTapaDura = New System.Windows.Forms.CheckBox()
        Me.ckRustica = New System.Windows.Forms.CheckBox()
        Me.ckCartone = New System.Windows.Forms.CheckBox()
        Me.gbEstado = New System.Windows.Forms.GroupBox()
        Me.rbReedicion = New System.Windows.Forms.RadioButton()
        Me.rbNovedad = New System.Windows.Forms.RadioButton()
        Me.cbTema = New System.Windows.Forms.ComboBox()
        Me.lbLibros = New System.Windows.Forms.ListBox()
        Me.cbPortada = New System.Windows.Forms.ComboBox()
        Me.PictureBox1 = New System.Windows.Forms.PictureBox()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.gbFormato.SuspendLayout()
        Me.gbEstado.SuspendLayout()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'tbTitulo
        '
        Me.tbTitulo.Location = New System.Drawing.Point(193, 84)
        Me.tbTitulo.Name = "tbTitulo"
        Me.tbTitulo.Size = New System.Drawing.Size(138, 22)
        Me.tbTitulo.TabIndex = 0
        '
        'tbAutor
        '
        Me.tbAutor.Location = New System.Drawing.Point(193, 135)
        Me.tbAutor.Name = "tbAutor"
        Me.tbAutor.Size = New System.Drawing.Size(138, 22)
        Me.tbAutor.TabIndex = 1
        '
        'tbNumeroPg
        '
        Me.tbNumeroPg.Location = New System.Drawing.Point(193, 238)
        Me.tbNumeroPg.Name = "tbNumeroPg"
        Me.tbNumeroPg.Size = New System.Drawing.Size(100, 22)
        Me.tbNumeroPg.TabIndex = 3
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(190, 22)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(69, 17)
        Me.Label1.TabIndex = 5
        Me.Label1.Text = "LIBRERÍA"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(72, 87)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(58, 17)
        Me.Label2.TabIndex = 6
        Me.Label2.Text = "TÍTULO"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(72, 135)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(57, 17)
        Me.Label3.TabIndex = 7
        Me.Label3.Text = "AUTOR"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(72, 191)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(46, 17)
        Me.Label4.TabIndex = 8
        Me.Label4.Text = "TEMA"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(72, 243)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(87, 17)
        Me.Label5.TabIndex = 9
        Me.Label5.Text = "Nº PÁGINAS"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(341, 255)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(47, 17)
        Me.Label6.TabIndex = 10
        Me.Label6.Text = "Libros"
        '
        'btnNuevo
        '
        Me.btnNuevo.Location = New System.Drawing.Point(75, 304)
        Me.btnNuevo.Name = "btnNuevo"
        Me.btnNuevo.Size = New System.Drawing.Size(75, 23)
        Me.btnNuevo.TabIndex = 11
        Me.btnNuevo.Text = "Nuevo"
        Me.btnNuevo.UseVisualStyleBackColor = True
        '
        'btnAltas
        '
        Me.btnAltas.AccessibleDescription = ""
        Me.btnAltas.Location = New System.Drawing.Point(193, 304)
        Me.btnAltas.Name = "btnAltas"
        Me.btnAltas.Size = New System.Drawing.Size(75, 23)
        Me.btnAltas.TabIndex = 12
        Me.btnAltas.Tag = ""
        Me.btnAltas.Text = "Altas"
        Me.btnAltas.UseVisualStyleBackColor = True
        '
        'btnBajas
        '
        Me.btnBajas.Enabled = False
        Me.btnBajas.Location = New System.Drawing.Point(75, 356)
        Me.btnBajas.Name = "btnBajas"
        Me.btnBajas.Size = New System.Drawing.Size(75, 23)
        Me.btnBajas.TabIndex = 13
        Me.btnBajas.Text = "Bajas"
        Me.btnBajas.UseVisualStyleBackColor = True
        '
        'btnSalir
        '
        Me.btnSalir.Location = New System.Drawing.Point(193, 356)
        Me.btnSalir.Name = "btnSalir"
        Me.btnSalir.Size = New System.Drawing.Size(75, 23)
        Me.btnSalir.TabIndex = 14
        Me.btnSalir.Text = "Salir"
        Me.btnSalir.UseVisualStyleBackColor = True
        '
        'gbFormato
        '
        Me.gbFormato.Controls.Add(Me.ckTapaDura)
        Me.gbFormato.Controls.Add(Me.ckRustica)
        Me.gbFormato.Controls.Add(Me.ckCartone)
        Me.gbFormato.Location = New System.Drawing.Point(368, 22)
        Me.gbFormato.Name = "gbFormato"
        Me.gbFormato.Size = New System.Drawing.Size(200, 100)
        Me.gbFormato.TabIndex = 15
        Me.gbFormato.TabStop = False
        Me.gbFormato.Text = "Formato"
        '
        'ckTapaDura
        '
        Me.ckTapaDura.AutoSize = True
        Me.ckTapaDura.Location = New System.Drawing.Point(7, 77)
        Me.ckTapaDura.Name = "ckTapaDura"
        Me.ckTapaDura.Size = New System.Drawing.Size(94, 21)
        Me.ckTapaDura.TabIndex = 2
        Me.ckTapaDura.Text = "TapaDura"
        Me.ckTapaDura.UseVisualStyleBackColor = True
        '
        'ckRustica
        '
        Me.ckRustica.AutoSize = True
        Me.ckRustica.Location = New System.Drawing.Point(7, 49)
        Me.ckRustica.Name = "ckRustica"
        Me.ckRustica.Size = New System.Drawing.Size(77, 21)
        Me.ckRustica.TabIndex = 1
        Me.ckRustica.Text = "Rústica"
        Me.ckRustica.UseVisualStyleBackColor = True
        '
        'ckCartone
        '
        Me.ckCartone.AutoSize = True
        Me.ckCartone.Checked = True
        Me.ckCartone.CheckState = System.Windows.Forms.CheckState.Checked
        Me.ckCartone.Location = New System.Drawing.Point(6, 21)
        Me.ckCartone.Name = "ckCartone"
        Me.ckCartone.Size = New System.Drawing.Size(80, 21)
        Me.ckCartone.TabIndex = 0
        Me.ckCartone.Text = "Cartoné"
        Me.ckCartone.UseVisualStyleBackColor = True
        '
        'gbEstado
        '
        Me.gbEstado.Controls.Add(Me.rbReedicion)
        Me.gbEstado.Controls.Add(Me.rbNovedad)
        Me.gbEstado.Location = New System.Drawing.Point(368, 135)
        Me.gbEstado.Name = "gbEstado"
        Me.gbEstado.Size = New System.Drawing.Size(200, 100)
        Me.gbEstado.TabIndex = 16
        Me.gbEstado.TabStop = False
        Me.gbEstado.Text = "Estado"
        '
        'rbReedicion
        '
        Me.rbReedicion.AutoSize = True
        Me.rbReedicion.Location = New System.Drawing.Point(7, 47)
        Me.rbReedicion.Name = "rbReedicion"
        Me.rbReedicion.Size = New System.Drawing.Size(92, 21)
        Me.rbReedicion.TabIndex = 1
        Me.rbReedicion.Text = "Reedición"
        Me.rbReedicion.UseVisualStyleBackColor = True
        '
        'rbNovedad
        '
        Me.rbNovedad.AutoSize = True
        Me.rbNovedad.Checked = True
        Me.rbNovedad.Location = New System.Drawing.Point(6, 22)
        Me.rbNovedad.Name = "rbNovedad"
        Me.rbNovedad.Size = New System.Drawing.Size(86, 21)
        Me.rbNovedad.TabIndex = 0
        Me.rbNovedad.TabStop = True
        Me.rbNovedad.Text = "Novedad"
        Me.rbNovedad.UseVisualStyleBackColor = True
        '
        'cbTema
        '
        Me.cbTema.FormattingEnabled = True
        Me.cbTema.Items.AddRange(New Object() {"Aventuras", "Biografía", "Ciencia", "Ciencia Ficción", "Cine", "Economía", "Gastronomía", "Historia", "Informática", "Medicina", "Misterio", "Naturaleza", "Policíaco", "Política", "Romántica", "Teatro", "Terror"})
        Me.cbTema.Location = New System.Drawing.Point(193, 188)
        Me.cbTema.Name = "cbTema"
        Me.cbTema.Size = New System.Drawing.Size(138, 24)
        Me.cbTema.TabIndex = 17
        '
        'lbLibros
        '
        Me.lbLibros.FormattingEnabled = True
        Me.lbLibros.ItemHeight = 16
        Me.lbLibros.Location = New System.Drawing.Point(340, 295)
        Me.lbLibros.Name = "lbLibros"
        Me.lbLibros.Size = New System.Drawing.Size(228, 84)
        Me.lbLibros.TabIndex = 18
        '
        'cbPortada
        '
        Me.cbPortada.FormattingEnabled = True
        Me.cbPortada.Items.AddRange(New Object() {"Espana", "Inglaterra", "Alemania"})
        Me.cbPortada.Location = New System.Drawing.Point(623, 43)
        Me.cbPortada.Name = "cbPortada"
        Me.cbPortada.Size = New System.Drawing.Size(130, 24)
        Me.cbPortada.TabIndex = 19
        Me.cbPortada.Text = "Espana"
        '
        'PictureBox1
        '
        Me.PictureBox1.Location = New System.Drawing.Point(623, 91)
        Me.PictureBox1.Name = "PictureBox1"
        Me.PictureBox1.Size = New System.Drawing.Size(130, 121)
        Me.PictureBox1.TabIndex = 20
        Me.PictureBox1.TabStop = False
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(623, 13)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(58, 17)
        Me.Label7.TabIndex = 21
        Me.Label7.Text = "Portada"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(8.0!, 16.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.PictureBox1)
        Me.Controls.Add(Me.cbPortada)
        Me.Controls.Add(Me.lbLibros)
        Me.Controls.Add(Me.cbTema)
        Me.Controls.Add(Me.gbEstado)
        Me.Controls.Add(Me.gbFormato)
        Me.Controls.Add(Me.btnSalir)
        Me.Controls.Add(Me.btnBajas)
        Me.Controls.Add(Me.btnAltas)
        Me.Controls.Add(Me.btnNuevo)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.tbNumeroPg)
        Me.Controls.Add(Me.tbAutor)
        Me.Controls.Add(Me.tbTitulo)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.gbFormato.ResumeLayout(False)
        Me.gbFormato.PerformLayout()
        Me.gbEstado.ResumeLayout(False)
        Me.gbEstado.PerformLayout()
        CType(Me.PictureBox1, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents tbTitulo As TextBox
    Friend WithEvents tbAutor As TextBox
    Friend WithEvents tbNumeroPg As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents btnNuevo As Button
    Friend WithEvents btnAltas As Button
    Friend WithEvents btnBajas As Button
    Friend WithEvents btnSalir As Button
    Friend WithEvents gbFormato As GroupBox
    Friend WithEvents ckTapaDura As CheckBox
    Friend WithEvents ckRustica As CheckBox
    Friend WithEvents ckCartone As CheckBox
    Friend WithEvents gbEstado As GroupBox
    Friend WithEvents rbReedicion As RadioButton
    Friend WithEvents rbNovedad As RadioButton
    Friend WithEvents cbTema As ComboBox
    Friend WithEvents lbLibros As ListBox
    Friend WithEvents cbPortada As ComboBox
    Friend WithEvents PictureBox1 As PictureBox
    Friend WithEvents Label7 As Label
End Class
