class Alumnos:
    def __init__(self):
        self.nombres=[]
        self.notas=[]

    def menu(self):
        opcion=0
        while opcion!=4:
            print("1)Cargar alumnos")
            print("2)Listar alumnos")
            print("3)Alumnos con 7 o mas")
            print("4)Finalizar programa")
            opcion=int(input("Introduce tu opcion: "))
            if opcion==1:
                self.cargar()
            elif opcion==2:
                self.listar()
            elif opcion==3:
                self.notas_altas()

    def cargar(self):
        for x in range(5):
            nombre=input("Introduce un nombre: ")
            nota=int(input("Introduce su nota: "))
            self.nombres.append(nombre)
            self.notas.append(nota)

    def listar(self):
        print("Listado completo de alumnos")
        for x in range(5):
            print(self.nombres[x],self.notas[x])
            print("________________________________")

    def notas_altas(self):
        print("Los alumnos con notas mayores a 7 son:")
        for x in range(5):
            if self.notas[x]>=7:
                print(self.nombres)[x]

#BLOQUE PRINCIPAL

alumnos=Alumnos()
alumnos.menu()

        

