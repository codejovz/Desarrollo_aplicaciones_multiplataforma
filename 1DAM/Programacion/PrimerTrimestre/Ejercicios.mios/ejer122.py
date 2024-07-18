def largo(cadena):
    return len(cadena)

#Bloque principal

nombre1=input("Introduce el primer nombre: ")
nombre2=input("Introduce el segundo nombre: ")
la1=largo(nombre1)
la2=largo(nombre2)
if la1==la2:
    print("Los dos nombres tienen las mismas letras,",nombre1," ",nombre2)
else:
    if la1>la2:
        prin
