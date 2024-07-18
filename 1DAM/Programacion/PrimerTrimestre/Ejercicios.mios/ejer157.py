def cargar_lista():
    lista=[]
    num=int(input("Introduce el numero de palabras que vas a poner: "))
    for x in range(num):
        palabra=input("Introduce una palabra a la lista: ")
        lista.append(palabra)
    return lista

def mayor_5(lista):
    for elemento in lista:
        if len(elemento)>5:
            print(elemento)









#BLOQUE PRINCIPAL

lista=cargar_lista()
mayor_5(lista)
    
