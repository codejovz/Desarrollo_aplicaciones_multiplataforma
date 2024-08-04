#1)Haz un triángulo formado por asteriscos(*) y déjale al usuario elegir cuántos pisos tiene.
#Cada piso hacia abajo tiene dos asteriscos más que el anterior.
#2)Haz un cuadrado,y déjale al usuario elegir cuántos pisos tiene. El fondo debe estar vacío
#las esquinas son ".", y los lados son "|" y "-".


#CUADRADO
def cuadrado():
    num=int(input("Introduce la medida del cuadrado: "))

#Las multiplicaciones *2 son SOLO porque en el idle ocupan la mitad,
#el salto de linea ocupa 1 espacio entero

    print(".",end="")       #Borde arriba(mismo codigo que el de abajo)
    for b in range(num*2-2):  #Le quitas dos porque te va a pintar antes y despues las esquinas
        print("-",end="")
    print(".")

    for k in range(num-2):   #Lineas horizontales sin contar con la 1 y ultima
        print("|",end="")     
        for x in range(num*2-2):
            print(" ", end="")
        print("|",end="")
        print()


    print(".",end="")       #Borde abajo(mismo codigo que el de arriba)
    for b in range(num*2-2):
        print("-",end="")
    print(".")


#TRIANGULO
def triangulo():
    num=int(input("Introduce cuantos pisos tiene el triangulo: "))

    conta=1  #Se inicializan los dos contadores, el primero es 1 porque es el de arriba
    conte=num-1   #num= las lineas que ha dicho el usuario


    for a in range(num):
        for b in range(conte):  #"CONT"ador "E"spacios
            print(" ", end="")
        conte=conte-1            #Se le va quitando un espacio por cada linea

        for c in range(conta):   #"CONT"ador "A"steriscos
            print("*", end="")
        print()
        conta=conta+2            #Se le va sumando un asterisco por cada linea
    
    
    

   
#PROGRAMA PRINCIPAL
cuadrado()
triangulo()


    

