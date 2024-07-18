lista=[[4,12,5,66],[14,6,25],[3,4,5,67,89,23,1],[78,56]]

print(lista)

for k in range(len(lista)):
    for x in range(len(lista[k])):
        if lista[k][x]>10:
            lista[k][x]=0
print(lista)
