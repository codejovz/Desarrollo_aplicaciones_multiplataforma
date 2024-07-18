lista=[]

for x in range(5):
    valor=int(input("Introduce un valor a la lista"))
    lista.append(valor)


menor=lista[0]
for x in range(1,5):
    if lista[x]<menor:
        menor=lista[x]
        posicion=x


print("La lista es:" + str(lista))
print("Y el menor valor de la lista es de: " + str(menor))
print("Y su posición es: " + str(posicion))

    
