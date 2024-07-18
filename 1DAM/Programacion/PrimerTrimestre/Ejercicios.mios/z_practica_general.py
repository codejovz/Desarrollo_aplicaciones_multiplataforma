

num=int(input("Introduce el numero de filas que quieres que tenga el triangulo:"))

conta=1
conte=num-1

for x in range(num):
    for e in range(conte):
        print(" ",end="")
    conte=conte-1
    for a in range(conta):
        print("*",end="")
    conta=conta+2
    print()




x=0
e=0
a=0


num=int(input("Introduce la medida del cuadrado: "))


print(".",end="")
for l in range(num-2):
    print("-",end="")
print(".")

for x in range(num-2):
    print("|",end="")
    for i in range(num-2):
        print(" ",end="")
    print("|")

print(".",end="")
for l in range(num-2):
    print("-",end="")
print(".")
    
