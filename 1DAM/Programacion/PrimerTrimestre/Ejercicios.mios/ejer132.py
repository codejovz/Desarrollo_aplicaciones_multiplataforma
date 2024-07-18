#Confeccionar funcion que cargue lista y la retorne
#Segunda funcion determina el menor y el mayor y los retorna
#El bloque principal llama a las dos funciones




def cargar_lista():
    li=[]
    for x in range(5):
        valor=int(input("Introduce un valor a la lista: "))
        li.append(valor)
    return li

def retornar_mayormenor(li):
    ma=li[0]
    me=li[0]
    for x in range(1,len(li)):
        if li[x]>ma:
            ma=li[x]
        else:
            if li[x]<me:
                me=li[x]
    return [ma,me]

#BLOQUE PRINCIPAL

lista=cargar_lista()
rango=retornar_mayormenor(lista)
print("Mayor elemento de la lista: ",rango[0])
print("Menor elemento de la lista: ",rango[1])
