#Crear un diccionario con el DNI como clave
#una tupla para cada asignatura y nota
#1)Cargar por teclado los datos de 4 personas
#2)Listado completo del diccionario
#3)Consulta el nombre de una persona introduciendo su DNI.

def cargar_datos():
    alumnos={}
    numpers=int(input("Introduce el numero de personas: "))
    for x in range(numpers):
        dni=input("Introduce su DNI: ")
        asignaturas=[]
        numasig=int(input("Cuantas asignaturas tiene? "))
        for x in range(numasig):
            asig=input("Como se llama la asignatura? ")
            nota=float(input("Cuanto ha sacado en esta asignatura? "))
            asignaturas.append((asig,nota))
        alumnos[dni]=asignaturas
    return alumnos


def listar_todo(alumnos):
    for dni in alumnos:
        print("El alumno con el dni ",dni,"tiene las siguientes asig/notas:")
        for x in range(len(alumnos[dni])):
            print(alumnos[dni][x][0],alumnos[dni][x][1])

def consultar_alumno(alumnos):
    dni=input("introduce el dni del alumno a buscar: ")
    if dni in alumnos:
        print(alumnos[dni])
    else:
        print("Este alumno no esta en nuestra base de datos")



#PROGRAMA PRINCIPAL
print("Elige una opcion:")
print("1)Cargar datos")
print("2)listar todo")
print("3)Realizar consulta")
print("4)Salir del programa")

continua="s"
while continua=="s":
    num=int(input("Elige opcion[1-4] "))
    if num==4:
        continua="n"
    else:
        if num==1:
            alumnos=cargar_datos()
        else:
            if num==2:
                listar_todo(alumnos)
            else:
                if num==3:
                    consultar_alumno(alumnos)
                else:
                    print("Numero introducido erroneo")
        continua=input("Quieres continuar?[s/n]")
    
print("Gracias por usar este programa!")



























