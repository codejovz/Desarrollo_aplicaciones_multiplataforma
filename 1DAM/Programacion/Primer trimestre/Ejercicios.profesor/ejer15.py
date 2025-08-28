num1=int(input("Introduce el primer numero"))
num2=int(input("Introduce el segundo numero"))
num3=int(input("Introduce el tercer numero"))

if num1>num2:
    if num1>num3:
        print(num1)

if num2>num1:
    if num2>num3:
        print(num2)

if num3>num2:
    if num3>num1:
        print(num3)
