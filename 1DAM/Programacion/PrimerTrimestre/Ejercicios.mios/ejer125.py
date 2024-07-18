lista=[]

def retornar_superficie(lado1,lado2):
    superficie=lado1*lado2
    lista.append(superficie)
    return superficie


#BLOQUE PRINCIPAL

for x in range(2):
    lado1=int(input("Introduce el lado menor del rectangulo: "))
    lado2=int(input("Introduce el lado mayor del rectangulo: "))
    print("La superficie de este rectangulo es: ",retornar_superficie(lado1,lado2))

if lista[0]>lista[1]:
          print("La superficie del primer rectangulo es mayor, ",lista[0],">",lista[1])
else:
    print("La superficie del segundo rectangulo es mayor, ",lista[1],">",lista[0])
