num1=int(input("Introduce tu sueldo "))
num2=int(input("Introduce tus años de antiguedad "))

veintep=num1*20/100
cincop=num1*5/100
if num1<500 and num2>=10:
    print("Tu sueldo mas el 20% es ")
    print(num1+veintep)
else:
    if num1<500 and num2<10:
        print("Tu sueldo mas el 5% es ")
        print(num1+cincop)
    else:
        print("No tienes aumento porque cobras mas o lo mismo de 500, y es de ")
        print(num1)
        
        

    
