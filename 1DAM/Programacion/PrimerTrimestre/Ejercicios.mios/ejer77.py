lista=[]
cont=0
for x in range(5):
    sueldo=float(input("Introduce un sueldo: "))
    lista.append(sueldo)
    cont=cont+sueldo
print("la lista es: ")
print(lista)
print("Y la media de los sueldos es: ")
print(cont/5)
