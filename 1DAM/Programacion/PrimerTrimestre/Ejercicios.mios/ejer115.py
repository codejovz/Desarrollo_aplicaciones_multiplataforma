#Funcion que solicita carga de tres valores y muestra el minimo
#LLamar dos veces a la funcion sin usar estructura repetitiva




def minimo():
    lista=[]
    valor1=int(input("Introduce el primer valor: "))
    valor2=int(input("Introducir el segundo valor: "))
    valor3=int(input("Introduce el tercer valor: "))
    lista.append(valor1)
    lista.append(valor2)
    lista.append(valor3)
    posmen=0
    for x in range(1,3):
        if lista[x]<lista[posmen]:
            posmen=x
    print("El numero menor es el: ",lista[posmen])

def separacion():
    print("**************************************************")

minimo()
separacion()
minimo()
