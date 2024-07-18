class Operaciones():

    def __init__(self):
        self.numero1=int(input("Introduce el primer numero: "))
        self.numero2=int(input("Introduce el segundo numero: "))

    def suma(self):
        sumados=self.numero1+self.numero2
        print("La suma da ",sumados)

    def resta(self):
        restados=self.numero1-self.numero2
        print("La resta da ",restados)

    def multiplicacion(self):
        multiplicados=self.numero1*self.numero2
        print("La multiplicacion da ",multiplicados)

    def division(self):
        divididos=self.numero1/self.numero2
        print("La division da ",divididos)




#PROGRAMA PRINCIPAL

operacion1=Operaciones()
operacion1.suma()
operacion1.resta()
operacion1.multiplicacion()
operacion1.division()
