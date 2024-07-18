
cantidad=0
n=int(input("Introduce cuántos números enteros quieres"))
for f in range(n):
    valor=int(input("Introduce el valor"))
    if valor>=1000:
        cantidad=cantidad+1
print("La cantidad de números introducidos que son menores o iguales a mil es de : ")
print(cantidad)

