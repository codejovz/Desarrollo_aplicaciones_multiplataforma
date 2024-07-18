def cargar_diccionario():
    diccionario={}
    continua="s"
    while continua=="s":
        ing=input("Introduce una palabra en ingles: ")
        cast=input("Introduce esa palabra en español: ")
        ing[diccionario]=cast
        continua=input("Quieres meter otra palabra?s/n ")
    return diccionario

def listar_diccionario(diccionario):
    print("Listado completo del diccionario: ")
    for ing in diccionario:
        print(ing,diccionario[ing])

def consulta_diccionario(diccionario):
    palabra=input("Que palabra quieres buscar?: ")
    if palabra in diccionario:
        print("En castellano significa ",diccionario[ing])
        












diccionario=cargar_diccionario
    
