def lista_palabras():
    lista=[]
    num=int(input("Introduce el numero de palabras de la lista: "))
    for x in range(num):
        palabra=input("Introduce una palabra ala lista: ")
        lista.append(palabra)
    return lista


def mas5(lista):
    for elemento in lista:
        if len(elemento)>5:
            print("Esta palabra tiene mas de 5 letras: ",elemento)
        



#PROGRAMA PRINCIPAL

lista=lista_palabras()
mas5(lista)

