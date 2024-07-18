lista=[]
cant=1

for k in range(25):
    lista.append([])
    valor=1
    for x in range(cant):
        lista[k].append(valor)
        valor=valor+1
    cant=cant+1

print(lista)
