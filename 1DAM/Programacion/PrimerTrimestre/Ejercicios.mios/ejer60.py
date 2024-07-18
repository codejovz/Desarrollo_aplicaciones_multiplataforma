opcion="si"
suma=0
while opcion=="si":
    valor=int(input("Introduce un valor"))
    suma=suma+valor
    opcion=input("Desea agregar otro valor? ")
print("La suma de los valores es:")
print(suma)
