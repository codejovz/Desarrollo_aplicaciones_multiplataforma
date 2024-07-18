#En una empresa se almacenan los sueldos de 10 personas
#Funcion que cargue datos
#Funcion que imprima los sueldos
#Funcion de cuantos tienen mas de 4k
#funcion que retorna promedio de sueldos
#Funcion que muestre los sueldos que estan por debajo del promedio
#se llaman desde el bloque principal




def cargar_datos():
    lista=[]
    for x in range(10):
        sueldo=int(input("Introduce un sueldo: "))
        lista.append(sueldo)
    return lista
    print(lista)
    
def imprimir_sueldo(lista):
    print("Estos son los sueldos: ")
    for x in range(len(lista)):
        print(lista[x])

def mayor_4k(lista):
    cont=0
    for x in range(len(lista)):
        if lista[x]>4000:
            cont=cont+1
    print("Hay ",cont,"sueldos mayores a 4000")

def retornar_promedio(lista):
    suma=0
    for x in range(len(lista)):
        suma=suma+lista[x]
    promedio=suma/len(lista)
    return promedio

def debajo_promedio(lista):
    for x in range(len(lista)):
        if lista[x]<retornar_promedio(lista):
            print(lista[x]," esta por debajo del promedio")

#BLOQUE PRINCIPAL

lista=cargar_datos()
imprimir_sueldo(lista)
mayor_4k(lista)
print("El promedio de los sueldos es ",retornar_promedio(lista))
debajo_promedio(lista)
    
        
        
