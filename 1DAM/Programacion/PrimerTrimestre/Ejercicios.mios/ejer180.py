import random

def cargar():
    lista=[]
    for x in range(10):
        lista.append(random.randint(0,1000))
    print(lista)
    return lista

def mezclar(lista):
    lista=random.shuffle(lista)
    





lista=cargar()
mezclar(lista)
print(lista)
