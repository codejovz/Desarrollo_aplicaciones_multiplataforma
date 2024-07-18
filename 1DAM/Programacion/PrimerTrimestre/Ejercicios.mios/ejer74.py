x=0
cont=0

lista=["juan","jorge","youssef","angel","pablo"]

for x in range(len(lista)):
    if len(lista[x])>=5:
        cont=cont+1
        print(lista[x])
    x=x+1
print(cont)
