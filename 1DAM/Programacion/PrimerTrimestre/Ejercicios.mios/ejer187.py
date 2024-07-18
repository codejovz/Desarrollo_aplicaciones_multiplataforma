class Persona:
    def inicializar(self,nom):
        self.nombre=nom

    def imprimir(self):
        print("Nombre ",self.nombre)


class Alumno:
    def inicializar(self,nombre,nota):
        self.nombre=nombre
        self.nota=nota

    def imprimir(self):
        print("Nombre: ",self.nombre)
        print("Nota: ",self.nota)

    def mostrar_estado(self):
        if self.nota>=4:
            print("Regular")
        else:
            print("Libre")





#BLOQUE PRINCIPAL PERSONA

persona1=Persona()
persona1.inicializar("Jorge")
persona1.imprimir()

persona2=Persona()
persona2.inicializar("Youssef")
persona2.imprimir()

#BLOQUE PRINCIPAL ALUMNO

alumno1=Alumno()
alumno1.inicializar("Ana",10)
alumno1.imprimir()
alumno1.mostrar_estado()

alumno2=Alumno()
alumno2.inicializar("Yango",2)
alumno2.imprimir()
alumno2.mostrar_estado()




