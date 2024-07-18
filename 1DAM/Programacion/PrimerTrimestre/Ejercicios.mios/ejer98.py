lista=[[100,7,85,8],[4,8,56,25],[67,89,23,1],[78,56]]

print(lista)

#fijar con el valor 0 todos los elementos mayores a 50 del primer elemento de la lista(solo el 100 y el 85)

for k in range(len(lista)):
               for x in range(len(lista[k])):
                   if lista[k][x]>50:
                       lista[k][x]=0

print(lista)
