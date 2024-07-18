#Programa para ver si un numero es primo o no

print("El porcentaje divide lo de la izq por derec y devuelve el resto")

print("4%3= ", end="")
print(4%3)





num=int(input("Introduce un numero"))

cont=1



for x in range(1,num):
    if num%x==0:
        cont=cont+1


if cont>2:
    print("El numero no es primo")
else:
    print("El numero es primo")



print(cont)
    
