cantidad=0
x=1
n=int(input("Cuantas piezas cargara"))
while x<=n:
    x=x+1
    largo=float(input("Introduce la medida de la pieza"))
    if largo>=1.2 and largo<=1.3:
        cantidad=cantidad+1
print("La cantidad de piezas validas es")
print(cantidad)
