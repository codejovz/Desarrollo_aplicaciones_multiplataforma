class triangulo:
    def inicializar(self,altura,base):
        self.altura=altura
        self.base=base
    def imprimir_mayor(self):
        if self.altura>self.base:
            print("El lado ",self.altura," es mayor")
        else:
            if self.altura<self.base:   
                print("El lado ",self.base," es mayor")
            else:
                print("Son iguales")

    def equilatero(self):
        if self.altura==self.base:
            print("Es equilatero")
        else:
            print("No es equilatero")


triangulo1=triangulo()
altura=int(input("Medida del primer lado: "))
base=int(input("Medida del segundo lado: "))
triangulo1.inicializar(altura,base)
triangulo1.imprimir_mayor()
triangulo1.equilatero()
