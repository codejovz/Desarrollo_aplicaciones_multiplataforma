nombres=[]
sueldos=[]
totalsueldos=[]

for x in range(3):
    nom=input("Introduce el nombre del empleado: ")
    nombres.append(nom)
    su1=int(input("Introduce el primer sueldo: "))
    su2=int(input("Introduce el segundo sueldo: "))
    su3=int(input("Introduce el tercer sueldo: "))
    sueldos.append([su1,su2,su3])

for x in range(3):
    total=sueldos[x][0]+sueldos[x][1]+sueldos[x][2]
    totalsueldos.append(total)

for x in range(3):
    print(nombres[x],totalsueldos[x])

posmayor=0
mayor=totalsueldos[0]
for x in range(1,3):
    if totalsueldos[x]>mayor:
        mayor=totalsueldos[x]
        posmayor=x

print("Empleado con mayores ingresos en los ultimos tres meses: ")
print(nombres[posmayor])
print("con un ingreso de ",mayor,"$")

