


def cargar_empleados():
    empleados=[]
    for x in range(1):
        lista_sueldos=[]
        empleados.append([])
        nom=input("Introduce el nombre del empleado: ")
        empleados[x].append(nom)
        for k in range(3):
            sueldo=int(input("Introduce sus 3 sueldos: "))
            lista_sueldos.append(sueldo)
        tupla_sueldos=tuple(lista_sueldos)
        empleados[x].append(tupla_sueldos)
    return empleados

def imprimir_todo(empleados):
    for x in range(len(empleados)):
        total=0
        for k in range(3):
            total=total+empleados[x][1][k]
        print(empleados[x][0]," ha cobrado un total de ",total,"€.")

def imprimir_mas10k(empleados):
    for x in range(len(empleados)):
        total=0
        for k in range(3):
            total=total+empleados[x][1][k]
        if total>10000:
            print("El empleado ",empleados[x][0]," ha cobrado más de 10k.")
            






#BLOQUE PRINCIPAL
empleados=cargar_empleados()
print(empleados)
imprimir_todo(empleados)
imprimir_mas10k(empleados)


        
    
