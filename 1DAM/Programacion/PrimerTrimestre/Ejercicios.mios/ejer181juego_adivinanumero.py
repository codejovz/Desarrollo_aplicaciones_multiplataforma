

import random


num=random.randint(1,100)


eleccion=0
while eleccion!=num:
    eleccion=int(input('Introduce un numero: '))
    if eleccion>num:
        print("He pensado en un numero menor")
    else:
        if eleccion<num:
            print("He pensado en un numero mayor")
        else:
            print("Has ganado!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")





































