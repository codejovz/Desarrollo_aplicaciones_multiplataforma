empleados=[]
faltas=[]

#3 empleados
#usuario dice cuanats faltas tiene cada usuario y que dia
#Se imprime los usuarios,numero de faltas y que dias eran
#se imprime los que menos faltas hayan tenido

for x in range(3):
    nombre=input("Introduce el nombre del empleado: ")
    empleados.append(nombre)
    num=int(input("Introduce el numero de faltas que ha tenido: "))
    faltas.append([])
    for k in range(num):
        dia=int(input("Introduce el dia que ha faltado: "))
        faltas[x].append(dia)

for k in range(3):
    print("El empleado ",epleados[x]," ha faltado un total de ", len(faltas[x])," dias:")
    for x in range(len(faltas[k])):
        print(faltas[k][x])

posmen=0

for x in range(1,3):
    if len(faltas[x])<len(faltas[posmen]):
        posmen=x

for x in range(3):
    if len(faltas[x])==len(faltas[posmen]):
        print("El empleado ",empleados[x]," ha faltado un total de ", len(empleados[x])," dias")
    


          
