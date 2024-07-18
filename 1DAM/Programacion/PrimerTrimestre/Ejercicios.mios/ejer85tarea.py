lista1=[]
lista2=[]
lista3=[]

for x in range (12):
    if x<5:
        num=int(input("Introduce un numero de la primera lista "))
        lista1.append(num)
    else:
        if x<9:
            num=int(input("Introduce un numero de la primera lista "))
            lista2.append(num)
        else:
            y=x-8
            for x in range(4):
                lista3.append(lista1[y] + lista2[y])

print (lista3)



    

    
    
