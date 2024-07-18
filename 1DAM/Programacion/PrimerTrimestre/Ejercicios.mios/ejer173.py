
def introducir_valores():
    num=int(input("Introduce cuantos valores(par): "))
    lista=[]
    for x in range(num):
        valor=int(input("Introduce un valor a la lista: "))
        lista.append(valor)
    return lista


def primera_mitad(lista):
    num=len(lista)//2
    print(lista[ :num])





#PROGRAMA PRINCIPAL

lista=introducir_valores()
print(lista)
primera_mitad(lista)
