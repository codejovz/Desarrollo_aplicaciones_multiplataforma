# x= filas; i=columnas

n=int(input("Introduce un numero impar:"))

h=n

for x in range(n):
    h=int(n-x-1)
    for i in range(n):
        if x== i or i==h:
            print("*", end="")
        else:
            if i<x:
                print(".",end="")
            else:
                print(".",end="")

    print()



# Pregunta al usuario cuántos pisos quiere
pisos = int(input("¿Cuántos pisos quieres para tu 'X'? "))

# Imprime la 'X'
for i in range(pisos):
    for j in range(pisos):
        if i == j or i + j == pisos - 1:
            print("*", end="")
        else:
            print("-", end="")
    print()


