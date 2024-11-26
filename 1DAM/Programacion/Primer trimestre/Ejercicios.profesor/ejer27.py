num1=int(input("Introduce numero 1 "))
num2=int(input("Introduce numero 2 "))
num3=int(input("Introduce el numero3 "))

if num1>num2 and num1>num3:
         print("El numero mayor es")
         print(num1)
         numm=num1
else:
    if num2>num1 and num2>num3:
         print("El numero mayor es")
         print(num2)
         numm=num2
    else:
        print("El numero mayor es")
        print(num3)
        numm=num3
#numm es el numero mayor
#nume es el numero menor


if num1<num2 and num1<num3:
         print("El numero menor es")
         print(num1)
         nume=num1
else:
    if num2<num1 and num2<num3:
         print("El numero menor es")
         print(num2)
         nume=num2
    else:
        print("El numero menor es")
        print(num3)
        nume=num3

print("El rango es de ")
print(numm-nume)



        
