prili=0
priva=0
seli=0
seva=0

while prili<15:
    prili=prili+1
    a=int(input("Introduce un valor de la primera lista"))
    priva=priva+a

while seli<15:
    seli=seli+1
    b=int(input("Introduce un valor de la segunda lista"))
    seva=seva+b

if priva>seva:
    print("La primera lista tiene un valor mayor")
else:
    if seva>priva:
        print("La segunda lista tiene un valor mayor")
    else:
        print("las dos listas son iguales")
            
    
    
    
