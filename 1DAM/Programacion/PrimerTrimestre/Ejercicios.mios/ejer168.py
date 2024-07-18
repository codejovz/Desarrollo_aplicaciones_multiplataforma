
def cargar_datos():
    empleados={}
    num=int(input("Introduce cuantos empleados hay: "))
    for x in range(num):
        expediente=int(input("Clave/numero de expediente: "))
        nombre=input("Introduce su nombre: ")
        profesion=input("Introduce su profesion: ")
        sueldo=int(input("Introduce su sueldo: "))
        empleados[expediente]=[nombre,profesion,sueldo]
    return empleados


def imprimir_empleados(empleados):
    print("La lista de empleados completa es: ")
    for expediente in empleados:
        print(expediente,empleados[expediente][0],empleados[expediente][1],empleados[expediente][2])

def modificar_sueldo(empleados):
    expediente=int(input("Introduce el numero de expediente: "))
    if expediente in empleados:
        sueldo=float(input("Introduce nuevo sueldo: "))
        empleados[expediente][2]=sueldo
    else:
        print("No existe este expediente.")

def imprimir_analistas(empleados):
    print("Lista de analistas de sistemas:")
    for expediente in empleados:
        if empleados[expediente][1]=="analista de sistemas":
            print(expediente,empleados[expediente][0],empleados[expediente][2])



#PROGRAMA PRINCIPAL

print("Elige una opcion:")
print("1)carcar datos")
print("2)Imprimir empleados")
print("3)Modificar sueldo")
print("4)Imprimir analistas")
print("5)Salir del programa")
continua="s"

num=int(input("Elige una opcion:"))


if num==5:
    continua="n"

while continua=="s":
    if num==1:
        empleados=cargar_datos()
    else:
        if num==2:
            imprimir_empleados(empleados)
        else:
            if num==3:
                modificar_sueldo(empleados)
            else:
                if num==4:
                    imprimir_analistas(empleados)
                else:
                    print("opcion erronea")
    continua=input("Quieres continuar?[s/n]")
print("Gracias por usar este programa!")
        



#empleados=cargar_datos()
#imprimir_empleados(empleados)
#modificar_sueldo(empleados)
#imprimir_analistas(empleados)
