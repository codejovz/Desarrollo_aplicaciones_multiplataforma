lista=[4,9,8,5,4,]
x=0
cont=0

for x in range(5):
    if lista[x]>=7:
        cont=cont+1
        print(lista[x])
    x=x+1

print("son mayores o iguales de 5: ")
print(cont)


