

def cargar_palabras():
    lista=[]
    for x in range(5):
        palabra=input("Introduce una palabra")
        lista.append(palabra)
        print(lista)
    return lista

def cambiar_palabras(lista):
    aux=palabra[0]
    palabra[0]=palabra[4]
    palabra[4]=aux
    print(lista)


#BLOQUE PRINCIPAL

lista=cargar_palabras()
cambiar_palabras(lista)
        
