#Hacer funciones que:
#1)Carguen una lista, en la que haya 5 tuplas con un producto y un precio.
#2)Impriman cada producto con su precio.
#3)Impriman los productos cuyos precios esten comprendidos entre el 10 y el 15.







def cargar_lista():
    lista=[]
    for x in range(5):
        producto=input("Introduce el nombre del producto: ")
        precio=int(input("Introduce el precio del producto: "))
        lista.append((producto,precio))
    return lista


def decir_todo(lista):
    for elemento in lista:
        print(elemento[0]," vale ",elemento[1])



def prod10_15(lista):
    print("Estos elementos cuestan entre 10 y 15:")
    for elemento in lista:
        if elemento[1]>=10 and elemento[1]<=15:
            print(elemento[0])





#PROGRAMA PRINCIPAL



lista=cargar_lista()
decir_todo(lista)
prod10_15(lista)
