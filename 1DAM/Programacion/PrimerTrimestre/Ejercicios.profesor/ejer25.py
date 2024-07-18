num1=int(input("Introduce el valor de la coordenada X "))
num2=int(input("Introduce el valor de la coordenada Y "))

if num1>0 and num2>0:
    print("La coordenada esta en el primer cuadrante")
if num1<0 and num2>0:
    print("La coordenada esta en el segundo cuadrante")
if num1<0 and num2<0:
    print("La coordenada esta en el tercer cuadrante")
if num1>0 and num2<0:
    print("La coordenada esta en el cuarto cuadrante")
