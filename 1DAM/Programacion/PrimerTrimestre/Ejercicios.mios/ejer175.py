def capicua(cadena):
    indice=-1
    iguales=0
    for x in range(0,len(cadena)//2):
        if cadena[x]==cadena[indice]:
            iguales=iguales+1
        indice=indice-1
    print(cadena)
    if iguales==(len(cadena)//2):
        print("Es capicua")
    else:
        print("No es capicua")

#BLOQUE PRINCIPAL

cadena=input("Introduce una palabra:  ")

capicua(cadena)
    
