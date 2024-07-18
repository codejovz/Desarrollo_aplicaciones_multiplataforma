import random



continua='s'


while continua=='s':
    dado1=random.randint(1,6)
    dado2=random.randint(1,6)
    print("Dado 1 ",dado1," Dado 2 ",dado2)
    suma=dado1+dado2
    if suma==7:
        print("Has ganado, da 7")
    else:
        print("Has perdido, no da 7, da ",suma)
    continua=input("Quieres volver a tirar? [s/n]")

print("Gracias por usar este programa!")
