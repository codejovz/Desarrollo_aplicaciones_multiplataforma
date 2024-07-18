lista1=[]
lista2=[]

for x in range(4):
    sueldo=float(input("Introduce un sueldo del turno de mañana "))
    lista1.append(sueldo)

for x in range(4):
    sueldo=int(input("Introduce un sueldo del turno de tarde "))
    lista2.append(sueldo)

print("La lista de los sueldos de los de turno de mañana es: ")
print(lista1)

print("La lista de los sueldos del turno de tarde es: ")
print(lista2)
