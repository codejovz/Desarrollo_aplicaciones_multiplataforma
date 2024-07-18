def cargar():
    productos={}
    for x in range(2):
        nombre=input("Introduce el nombre del producto: ")
        precio=int(input("Introduce el precio del porducto: "))
        productos[nombre]=precio
    return productos


def imprimir_todo(productos):
    print(productos)





def imprimir(productos):
    for nombre in productos:
        print(nombre,productos[nombre])










#PROGRAMA PRINCIPAL

productos=cargar()
imprimir_todo(productos)
imprimir(productos)
