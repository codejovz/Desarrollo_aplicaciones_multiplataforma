def cargar():
    productos={}
    continua="s"
    while continua=="s":
        codigo=int(input("Introduce el codigo del producto: "))
        descripcion=input("Introduce la descripcion del producto: ")
        precio=float(input("Introduce el precio del producto: "))
        stock=int(input("Introduce el stock del producto: "))
        codigo[productos]=(descripcion,precio,stock)
        continua=input("Para continuar pulsa ´s´ |")
    return productos


def listado(productos):
    for codigo in productos:
        print(codigo,productos(codigo[0]),productos(codigo[1]),productos(codigo[2]))

def listado_stock_cero(productos):
    print("Listado de productos sin stock: ")
    for codigo in productos:
        if productos[codigo][2]==0:
            print(codigo,productos(codigo[0]),productos(codigo[1]),productos(codigo[2]))




#PROGRAMA PRINCIPAL
productos=cargar()
listado_stock_cero(productos)
