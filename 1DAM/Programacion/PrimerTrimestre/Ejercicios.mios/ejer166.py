def cargar():
    agenda={}
    continua1="s"
    while continua1=="s":
        fecha=input("Introduce la fecha en formato dd/mm/aa: ")
        continua2="s"
        lista=[]
        while continua2=="s":
            hora=input("Introduce la hora con formato hh:mm ")
            actividad=input("Introduce la descripcion de la actividad: ")
            lista.append((hora,actividad))
            continua2=input("Otra actividad en la misma fecha? s/n ")
        agenda[fecha]=lista
        continua1=input("Quieres introducir otra fecha? s/n")
    return agenda

def imprimir(agenda):
    print("Listado completo de la agenda: ")
    for fecha in agenda:
        print("Para la fecha: ",fecha)
        for hora,actividad in agenda[fecha]:
            print(hora,actividad)

def consulta_fecha(agenda):
    fecha=input("Introduce la fecha que quieres consultar: ")
    if fecha in agenda:
        for hora,actividad in agenda[fecha]:
            print(hora,actividad)
    else:
        print("No hay actividades agendadas para esta fecha")

#BLOQUE PRINCIPAL

agenda=cargar()
imprimir(agenda)
consulta_fecha(agenda)
        
