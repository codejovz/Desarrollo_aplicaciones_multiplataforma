
def meter_valores():
    cadena=input("Introduce una cadena de texto: ")
    return cadena

def dos_primeros(cadena):
    print("Los dos primeros caracteres: ",end="")
    print(cadena[:2])


def dos_ultimos(cadena):
    print("Los dos ultimos caracteres: ",end="")
    print(cadena[len(cadena)-2:len(cadena)])

def todos_men_priult(cadena):
    print("Los caracteres excepto el primero y el ultimo: ",end="")
    print(cadena[1:len(cadena)-1])


#BLOQUE PRINCIPAL

print("Elige una opcion: ")
print("1)Introducir una cadena")
print("2)Imprimir sus dos primeros caracteres")
print("3Imprimir sus dos ultimos caracteres")
print("4)Imprimir todos menos el primero y el ultimo",end="")



num=int(input())

continua='s'

while continua=='s':
    if num==1:
    cadena=meter_valores()
    else:
        if num==2:
            dos_primeros(cadena)
        else:
            if num==3:
                dos_ultimos(cadena)
            else:
                if num==4:
                    todos_men_priult(cadena)
                else:
                    print("ERROR")
    


        














