#Almacenar datos de 3 alumnos, definir diccionario cuya clave es num de documento(dni)
#como valor tiene unalista con componentes de timpo tupla donde almacenamos materia y nota, el usuario decide cuantas materias tiene
#Crea las siguientes funciones:
#1)Carga los alumnos, nombres de materias y notas.
#2)Lista los alumnos con sus materias y notas.
#3)Consulta un alumno por su dni, mostrar materias y sus notas.

def cargar_datos():
    alumnos={}
    for x in range(3):
        nombre=input("Como se llama el alumno? ")
        numasig=int(input("Cuantas asignaturas tiene? "))
        asignaturas=[]
        for x in range(numasig):
            nomasig=input("Introduce como se llama la asignatura:")
            notaasig=float(input("Cuanto ha sacadpo en esta asignatura? "))
            asignaturas.append((nomasig,notaasig))
        alumnos[nombre]=asignaturas
    return alumnos
    print(alumnos)


def listar_todo(alumnos):
    for nombre in alumnos:
        print(nombre," tiene estas asignaturas: ")
        for x in range(len(alumnos[nombre])):
            print(alumnos[nombre][x][0]," ",alumnos[nombre][x][1])

def buscar_nombre(alumnos):
    continua="s"
    while continua=="s":
        nombre=input("Introduce el nombre del alumno:")
        if nombre in alumnos:
            for x in range(len(alumnos[nombre])):
                print(alumnos[nombre][x][0]," ",alumnos[nombre][x][1])
        else:
            print("Este nombre no esta en la base de datos")
        continua=input("quieres buscar otro nombre? [s/n]")
    print("Gracias por usar este programa!")
            


#PROGRAMA PRINCIPAL

alumnos=cargar_datos()
listar_todo(alumnos)
buscar_nombre(alumnos)

        
        


