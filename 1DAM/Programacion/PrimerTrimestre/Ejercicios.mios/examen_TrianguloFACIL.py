#Haz un triangulo, y dejale al usuario decidir cuantos pisos tiene el triangulo

num=int(input("De cuantos asteriscos quieres que este formada la base?: "))

contadora=1      #Se inicializan los dos contadores, el primero es 1 porque es el de arriba
contadore=num-1
while contadora<num:
    for x in range(num):             #num= las lineas que ha dicho el usuario
        for e in range(contadore):   #contador "E"spacios
            print(" ", end="")
        contadore=contadore-1        #Se le va quitando un espacio por cada linea
        
        for a in range(contadora):   #contador "A"steriscos
            print("*", end="")
        print()
        contadora=contadora+2        #Se le va sumando un asterisco por cada linea
    
