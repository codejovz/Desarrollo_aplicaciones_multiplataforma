lista=[]

for x in range(5):
    valor=int(input("Introduce un valor entero: "))
    lista.append(valor)

mayor=lista[0]
repetido=0
for x in range(1,5):
    if lista[x]>mayor:
        mayor=lista[x]
    else:
        if lista[x]==mayor:
            repetido=repetido+1

print("El número mayor de la lista es el " + str(mayor))

if repetido==1:
    print("El valor está repetido una vez")
else:
    if repetido>1:
        print("El valor está repetido ",repetido," veces")
    
    


            
            
