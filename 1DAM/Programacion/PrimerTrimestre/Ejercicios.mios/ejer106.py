empleados=[]
faltas=[]

#3 empleados
#usuario dice cuanats faltas tiene cada usuario y que dia
#Se imprime los usuarios,numero de faltas y que dias eran
#se imprime los que menos faltas hayan tenido

for k in range(3):
    nombre=input("Introduce el nombre del empleado: ")
    empleados.append(nombre)
    faltas.append([])
    num=int(input("Introduce el numero de dias que ha faltado: "))
    for x in range(num):
        dia=int(input("Que dia ha faltado?: "))
        faltas[k].append(dia)

print(empleados)
print(faltas)

for k in range(3):
    print("el empleado ",empleados[k]," ha faltado un total de ",len(faltas[k]),"dias")
    for x in range(len(faltas[k])):
        print(faltas[k][x])


posmen=0
for x in range(1,3):
    if len(faltas[x])<len(faltas[posmen]):
        posmen=x
    
for x in range(3):
    if len(faltas[x])==len(faltas[posmen]):
        print(empleados[x]," ha sido el que menos ha faltado, ",len(faltas[x])," dias")

