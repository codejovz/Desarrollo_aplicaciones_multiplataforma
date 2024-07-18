def mostrar_perimetro(lado):
    per=lado*4
    print("El perimetro es ",per)

def mostrar_superficie(lado):
    sup=lado*lado
    print("La superficie es ",sup)

def cargar_dato():
    la=int(input("Introduce el lado: "))
    respuesta=input("Quiere calcular el [perimetro] o la [superficie]?  ")
    if respuesta=="perimetro":
        mostrar_perimetro(la)
    if respuesta=="superficie":
        mostrar_superficie(la)

#PROGRAMA PRINCIPAL

cargar_dato()
