lista=[]

num1=int(input("Introduce cuantos elementos quieres que tenga la lista: "))
num2=int(input("Introduce el numero de elementos que tiene la sublista: "))

for k in range(num1):
    lista.append([])
    for x in range(num2):
        valor=int(input("Introduce un valor a la sublista"))
        lista[k].append(valor)

print(lista)

suma=0

for k in range(num1):
    for x in range(num2):
        suma=suma+lista[k][x]

print("La suma de todos los subelementos es:",suma)
        
     
