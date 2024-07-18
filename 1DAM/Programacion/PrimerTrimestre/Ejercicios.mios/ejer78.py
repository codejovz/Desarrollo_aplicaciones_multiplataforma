lista=[]

suma=0
mas=0
menos=0
a=0
for x in range(5):
    altura=float(input("Introduce una altura "))
    lista.append(altura)
    suma=suma+altura
    
prom=suma/5

print("La lista es: ")
print(lista)
print("El promedio es: ")
print(prom)

print("Y las alturas mayores al promedio son: ")


if lista[0]>prom:
    print(lista[0])
    mas=mas+1
else:
    menos=menos+1
    
if lista[1]>prom:
    print(lista[1])
    mas=mas+1
else:
    menos=menos+1
    
if lista[2]>prom:
    print(lista[2])
    mas=mas+1
else:
    menos=menos+1
    
if lista[3]>prom:
    print(lista[3])
    mas=mas+1
else:
    menos=menos+1
if lista[4]>prom:
    print(lista[4])
    mas=mas+1
else:
    menos=menos+1

print("El numero de personas mas altas que el promedio esde: ")
print(mas)
print("Y el numero de personas menos altas que el promedio es de: ")
print(menos)
