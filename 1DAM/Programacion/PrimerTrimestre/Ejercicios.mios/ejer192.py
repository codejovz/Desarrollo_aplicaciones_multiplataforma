


class Cuadrado:
    
    def __init__(self):
        self.lado=int(input("Introduce el lado del cuadrado: "))

    def imprimir(self):
        print("El lado del cuadrado es: ",self.lado)
        
    def perimetro(self):
        perimetro=self.lado*4
        print("El perimetro es ",perimetro)

    def superficie(self):
        superficie=self.lado*self.lado
        print("La superficie es ",superficie)
        



#PROGRAMA PRINCIPAL


cuadrado1=Cuadrado()
cuadrado1.imprimir()
cuadrado1.perimetro()
cuadrado1.superficie()




        

    
