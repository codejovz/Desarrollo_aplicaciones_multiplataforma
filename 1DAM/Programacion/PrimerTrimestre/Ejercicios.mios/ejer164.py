#Crear un diccionario con el DNI como clave
#y el nombre como descripcion.
#1)Cargar por teclado los datos de 4 personas
#2)Listado completo del diccionario
#3)Consulta el nombre de una persona introduciendo su DNI.








def cargar_diccionario():
    diccionario={}
    for x in range(3):
        dni=input("Introduce el DNI de esta persona: ")
        nombre=input("Introducesu nombre: ")
        diccionario[dni]=nombre
    return diccionario


def listado(diccionario):
    for dni in diccionario:
        print(diccionario[dni]," ",dni)
        
def buscar_nombre(diccionario):
    documento=input("Introduce elnumero del documento: ")
    if documento in diccionario:
        print(diccionario[documento])


#PROGRAMA PRINCIPAL

diccionario=cargar_diccionario()
listado(diccionario)
buscar_nombre(diccionario)
        
