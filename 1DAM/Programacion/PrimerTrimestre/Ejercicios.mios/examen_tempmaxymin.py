


num=int(input("Introduce el numero de dias: "))

dias=[]



for x in range(num):
    print("Para el dia: ",x)
    max=int(input("Introduce la temperatura maxima: "))
    min=int(input("Introduce la temperatura minima: "))
    dias.append((max,min))


for a in range(num):
    print("Dia",a,"temperatura media ",(dias[a][0]+dias[a][1])/2)


menor=0

for k in range(num):
    if dias[k][1]<dias[0][1]:
        menor=k

for z in range(num):
    if dias[z][1]==dias[menor][1]:
        print("El dia ",z,"tiene la menor temperatura, ",dias[z][1])


temperatura=int(input("Que temperatura quieres buscar: " ))

cont=0

for x in range(len(dias)):
    if dias[x][1]==temperatura or dias[x][0]==temperatura:
        print("El dia ",x,"tiene esa temperatura")
        cont=cont+1



if cont<1:
    print("No hay ningun dia con esta temperatura")
    
