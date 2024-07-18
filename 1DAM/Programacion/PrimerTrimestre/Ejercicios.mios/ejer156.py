def cargar():
    empleados=[]
    for x in range(2):
        nombre=input("Introduce el nombre del empleado: ")
        sueldo=int(input("Introduce su sueldo: "))
        empleados.append((nombre,sueldo))
    return empleados

def imprimir_empleados(empleados):
    for nombre,sueldo in empleados:
        print(nombre,sueldo)

def mayor_sueldo(empleados):
    empleado=empleados[0]
    for emp in empleados:
        if emp>empleado:
            empleado=emp
    print("El empleado que mas ha cobrado es: ",empleado)







def sueldo_menor1000(empleados):
    cant=0
    for empleado in empleados:
        if empleado[1]<1000:
            cant=cant+1
    print("La cantidad de empleados que cobra menos de 1k es: ",cant)
        








#BLOQUE PRINCIPAL

empleados=cargar()
imprimir_empleados(empleados)
mayor_sueldo(empleados)
sueldo_menor1000(empleados)
