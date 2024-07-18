articulos=[]
precios=[]


def cargar_articulos():
    for x in range(5):
        articulo=input("Introduce el nombre del articulo: ")
        articulos.append(articulo)
        precio=int(input("Introduce su precio: "))
        precios.append(precio)
    return [articulos,precios]

def imprimir_todo(articulos,precios):
    for x in range(len(articulos)):
        print(articulos[x]," vale ",precios[x])

def mayor_precio(articulos,precios):
    posmay=0
    for x in range(len(precios)):
        if precios[x]>precios[posmay]:
            posmay=x
    print("El producto ",articulos[posmay]," es el que mayor precio tiene, ",precios[posmay])

def introducir_importe(articulos,precios):
    importe=int(input("Introduce un importe y printeo los que tenga precio <= : "))
    for x in range(len(articulos)):
        if precios[x]<=importe:
            print(articulos[x]," ",precios[x])


cargar_articulos()
imprimir_todo(articulos,precios)
mayor_precio(articulos,precios)
introducir_importe(articulos,precios)

