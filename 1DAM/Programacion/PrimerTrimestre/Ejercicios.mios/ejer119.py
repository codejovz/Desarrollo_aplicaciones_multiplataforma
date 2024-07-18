#Desarrollar una funcion que reciba un string como parametro y nos muestre
#la cantidad de vocales
#Llamarla desde el bloque principal del programa tres veces
#con string distintos





def funcion(palabra):
    cont=0
    for x in range(len(palabra)):
        if palabra[x]=="a" or  palabra[x]=="e" or palabra[x]=="i" or palabra[x]=="o" or palabra[x]=="u":
            cont=cont+1
    print("El numero de vocales que tiene es: ",cont)

#PROGRAMA PRINCIPAL
for x in range(3):
    palabra=input("Introduce una palabra en minusculas")
    funcion(palabra)
