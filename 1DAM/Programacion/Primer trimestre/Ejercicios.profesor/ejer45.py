mul3=0
mul5=0

for f in range(10):
    valor=int(input("Introduce un valor "))
    if valor%3==0:
        mul3=mul3+1
    if valor%5==0:
        mul5=mul5+1
print("La cantidad de múltiplos del 3 son: ")
print(mul3)
print("Y la cantidad de múltiplos del 5 son ")
print(mul5)
