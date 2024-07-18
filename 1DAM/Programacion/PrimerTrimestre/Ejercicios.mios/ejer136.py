#Confeccionar un programa que permita:
#a)Cargar lista de 10 elementos enteros(positivos y negativos)
#b)Generar dos listas a partir de la primera, una con positivos y otra con negativos
#c)Imprimir las dos listas generadas.





def cargar_datos():
    todo=[]
    for x in range(3):
        num=int(input("Introduce un numero a la lista: "))
        todo.append(num)
    return (todo)


def dos_listas(todo):
    pos=[]
    neg=[]
    for x in range(len(todo)):
        if todo[x]>=0:
            pos.append(todo[x])
        else:
            neg.append(todo[x])
    return(pos,neg)

def printear(lista):
    print(lista)
    


#BLOQUE PRINCIPAL
todo=cargar_datos()#Hay que asignarselo porque aunque lo retornes no lo mete en ningun sitio
pos,neg=dos_listas(todo)
printear(pos)
printear(neg)



        
