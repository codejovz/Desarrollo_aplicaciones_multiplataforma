#ejercicio para el fin de semana
#Crear dos listas con los nombres de 5 productos en una y sus respectivos precios en otra.
#definir dos listas paralelas.
#mostrar cuantos productos tienen un precio mayor al pirmer producto introducido

lista=[]
precios=[]

for x in range (5):
    nombre=input("Como se llama el producto ")
    lista.append(nombre)
    eur=float(input("Cuanto cuesta "))
    precios.append(eur)

mayor=precios[0]

for x in range(1,4):
    if precios[x]>mayor:
        print (lista[x])
