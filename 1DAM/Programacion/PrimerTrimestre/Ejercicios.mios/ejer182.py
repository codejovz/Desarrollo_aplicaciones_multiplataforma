import random



lista=[]
for x in range(4):
    lista.append(random.randint(1,3))
    lista.append(1)


print(lista)



while lista[0]!=1:
    random.shuffle(lista)
    print(lista)
