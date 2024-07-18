
alt=0
bas=0
sup=0

t=int(input("Introduce cuántos triángulos quieres: "))

for f in range(t):
    base=int(input("Introduce la base "))
    bas=bas+base
    altura=int(input("Introduce la altura "))
    alt=alt+altura
    print("La superficie del triángulo es de: ")
    print(bas*alt/2)
    if bas*alt>12:
        sup=sup+1
    alt=0
    bas=0

print("La cantidad de triángulos cuya superficie es mayor a 12 es de: ")
print(sup)
