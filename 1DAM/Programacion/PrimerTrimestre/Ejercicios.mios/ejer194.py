class Operacion:

    def __init__(self):
        self.valor1=int(input("Introduce el primer valor: "))
        self.valor2=int(input("Introduce el segundo valor: "))
        self.sumar()
        self.restar()
        self.multiplicar()
        self.dividir()

    def sumar(self):
        suma=self.valor1+self.valor2
        print("La suma es ",suma)

    def restar(self):
        resta=self.valor1-self.valor2
        print("La resta da ",resta)

    def multiplicar(self):
        multiplicacion=self.valor1*self.valor2
        print("La multiplicacion da ",multiplicacion)

    def dividir(self)
        
