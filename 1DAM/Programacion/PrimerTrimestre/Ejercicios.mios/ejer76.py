lista=[]
valor=int(input("Introduce valor(0 para finalizar) "))
while valor!=0:
    lista.append(valor)
    valor=int(input("Introduce valor(0 para finalizar) "))
print("El tamaño de la lista es ")
print(len(lista))
print(lista)
