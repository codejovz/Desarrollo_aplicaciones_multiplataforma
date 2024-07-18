#Desarrolla una funcion que tenga como parámetro el lado de un cuadrado
#y que retorne el perimetro



def perimetro(lado):
    p=lado*2
    return p

#PROGRAMA PRINCIPAAL
lado=int(input("Introduce el lado del cuadrado: "))
print("El perimetro es:",perimetro(lado))
