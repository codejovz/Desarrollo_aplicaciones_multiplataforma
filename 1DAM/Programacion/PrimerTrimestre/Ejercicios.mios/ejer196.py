class Agenda():

    def __init__(self):
        self.agenda={}
        
    def menu(self):
        opcion=0
        while opcion!=5:
            print("--------------------------------")
            print("1)Cargar contactos en la agenda|")
            print("2)Listar la agenda completa    |")
            print("3)Consulta por nombre          |")
            print("4)Modificar telefono y mail    |")
            print("5)Finalizar programa           |")
            print("--------------------------------")
            opcion=int(input("Introduce una opcion: "))
            if opcion==1:
                self.cargar()
            elif opcion==2:
                self.listar()
            elif opcion==3:
                self.consultar()
            elif opcion==4:
                self.modificar()

    def cargar(self):
        nombre=input("Introduce un nombre: ")
        telefono=int(input("Introduce un telefono: "))
        mail=input("Introduce un mail: ")
        self.agenda[nombre]=(telefono,mail)

    def listar(self):
        for nombre in self.agenda:
            print(nombre," tiene los siguientes datos: ")
            print("Numero: ",self.agenda[nombre][0],"Correo: ",self.agenda[nombre][1])

    def consultar(self):
        nombre=input("Introduce un nombre: ")
        if nombre in self.agenda:
            print(nombre," tiene los siguientes datos: ")
            print("Numero: ",self.agenda[nombre][0],"Correo: ",self.agenda[nombre][1])
        else:
            print("No se encuentra en esta base de datos")
            
    def modificar(self):
        nombre=input("Introduce el nombre del que quieres cambiar los datos: ")
        if nombre in self.agenda:
            telefono=int(input("Introduce un numero de telefono: "))
            mail=input("Introduce un mail: ")
            self.agenda[nombre]=(telefono,mail)
            print("¡Hecho! Cambios guardados :P")
        else:
            print("No se encuentra en esta base de datos.")
            
            

agenda1=Agenda()

agenda1.menu()
