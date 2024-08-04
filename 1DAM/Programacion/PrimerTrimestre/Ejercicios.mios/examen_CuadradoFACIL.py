#Haz un cuadrado vacio, las esquinas son puntos y los bordes "|" o "-"

num=int(input("Introduce la medida del cuadrado: "))



print(".",end="")       #Borde arriba(mismo codigo que el de abajo)
for b in range(num-2):
    print("-",end="")
print(".")

for k in range(num-2):
    print("|",end="")     
    for x in range(num-2):
        print(" ", end="")
    print("|",end="")
    print()


print(".",end="")       #Borde abajo(mismo codigo que el de arriba)
for b in range(num-2):
    print("-",end="")
print(".")
        
    
