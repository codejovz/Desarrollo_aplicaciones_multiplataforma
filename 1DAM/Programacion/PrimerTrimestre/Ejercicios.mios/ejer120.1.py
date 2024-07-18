def retornar_superficie(lado):
    sup=lado*lado
    return sup

#BLOQUE PRINCIPAL DEL PROGRAMA

va=int(input("Introduce el valor del lado del cuadrado: "))
superficie=retornar_superficie(va)
print("La superficie del cuadrado es: ",superficie)


