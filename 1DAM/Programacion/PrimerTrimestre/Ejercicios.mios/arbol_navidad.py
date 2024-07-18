#Haz la forma de un arbol, compuesto por un triangulo
#y un cuadrado, y dejale elegir al usuario el numero de lineas
#por el que esta compuesto

num=int(input("Introduce el numero de lineas horizontales del arbol: "))
conta=1
conte=num-1

for x in range(num):
    for e in range(conte):
        print(" ",end="")
2    for a in range(conta):
        print("*",end="")
    conte=conte-1
    conta=conta+2
    print()

espt=num//2
a=0
e=0
for t in range(num//2):
    for e in range(espt):
        print(" ",end="")
    for a in range(num):
        print("|",end="")
    print()


print()
print()
print()



print("FELIZ NAVIDAD COÑ",end="")
for x in range(500):
    print("O",end="")
    
