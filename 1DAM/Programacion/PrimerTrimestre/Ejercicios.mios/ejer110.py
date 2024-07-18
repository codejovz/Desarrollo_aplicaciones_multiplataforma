empleados=[]
sueldos=[]
#pedir numero de empleados, su nombre y su sueldo
#agregarlos a una lista anidada
#borrar los que cobren mas de 10k

num=int(input("cuantos empleados quieres: "))

for x in range(num):
    nombre=input("Introduce el nombre del empleado: ")
    empleados.append(nombre)
    salario=int(input("Introduce el salario del empleado: "))
    sueldos.append(salario)

print(empleados)
print(sueldos)

posicion=0

while posicion<len(empleados):
    if sueldos[posicion]>10000:
        del empleados[posicion]
        del sueldos[posicion]
    else:
        posicion=posicion+1

print(empleados)
print(sueldos)
