# ESTRUCTURA DE DATOS DEFINIDA POR USUARIO


 - Creación
 ```VB
	private structure n_estructura
		public var1 As tipo
		public var1 As tipo
	end structure

	private structure empleados
		public nombre As String
		public ape As String
		public sueldo As Integer
	end structure
```

 - Definición
```VB
	Dim emple1 As empleados
	Dim tbEmpleados(2) As empleados
	tbEmpleados(0).nombre = "pepe"
	tbEmpleados(2).seldo = 700
```

 - Utilización
```VB
	emple1.nombre = pepe
	emple1.ape = ruiz
	emple1.sueldo = 700
```

 - Adicional
```VB
Dim nombreTabla '(dimension, empieza por 0. si se le pone nueve llega al nueve) As tipo  
Dim tbNombres(9)As String*20
Dim tbNombres() As String = {"Pepe", "Juan"}
Dim tbEdades(5,5) As Integer 
tbNombres (0) = "Pepe"
tbEdades (0) = 24
'Redim hace una tabla con dimensiones variables

```