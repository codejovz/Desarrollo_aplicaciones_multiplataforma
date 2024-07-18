lista=[]

num1=int(input("Introduce el numero de empleados"))

x=0
while x<num1:
    x=x+1
    sueldo=int(input("Introduce el sueldo del empleado"))
    lista.append(sueldo)


for k in range(num1-1):
    for x in range(num1-1-k):
        print(x)
        if lista[x]>lista[x+1]:
            aux=lista[x+1]
            lista[x+1]=lista[x]
            lista[x]=aux

print(lista)
    
    
