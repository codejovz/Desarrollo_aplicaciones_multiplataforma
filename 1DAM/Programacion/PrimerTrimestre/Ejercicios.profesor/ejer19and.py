num1=int(input("Introduce 1 numero "))
num2=int(input("Introduce segundo numero "))
num3=int(input("Introduce tercer numero "))

print("El mayor de los tres valores es el")

if num1>num2 and num1>num3:
    print(num1)
else:
    if num2>num3 and num2>num1:
        print(num2)
    else:
        print(num3)
