print("Datos de la primera persona")
nombre1=input("Ingrese el nombre ")
edad1=int(input("Ingrese la edad "))
altura1=float(input("Introduce la altura p.ej 1.74 "))
print("Datos de la segunda persona")
nombre2=input("Ingrese el nombre ")
edad2=int(input("Ingrese la edad "))
altura2=float(input("Introduce la altura p.ej 1.74 "))
print("La persona más alta es:")
if altura1>altura2:
    print(nombre1)
else:
    print(nombre2)

