class Empleado:


    def __init__(self):
        print("Estamos en innit")
        self.nombre=input("Introduce un nombre: ")
        self.sueldo=int(input("Introduce un sueldo: "))

    def imprimir(self):
        print("Ya no estamos en innit")
        print("Se llama ",self.nombre)
        print("y cobra ",self.sueldo)
    def paga_impuestos(self):
        if self.sueldo>3000:
            print("Debe pagar impuestos.")
        else:
            print("No debe pagar impuestos")





#BLOQUE PRINCIPAL

empleado1=Empleado()
empleado1.imprimir(self)
empleado1.paga_impuestos(self)
    
