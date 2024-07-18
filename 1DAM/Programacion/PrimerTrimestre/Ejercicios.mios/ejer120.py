#Confeccionar una funcion que reciba tres enteros y los muestre ordenados de menor a mayor
#En otra funcion, solicitar la carga de tres enteros por teclado y proceder a llamar a la otra

lista=[]


def funcion1():
    for x in range(3):
        num=int(input("Introduce un numero: "))
        lista.append(num)
    print(lista)

def funcion2():
        for k in range(3):
            for x in range(2-k):
                if lista[x]>lista[x+1]:
                    aux=lista[x]
                    lista[x]=lista[x+1]
                    lista[x+1]=aux
                print(lista)
        print("Tu lista ordenada es: ",lista)


#PROGRAMA PRINCIPAL
funcion1()
funcion2()
