pais=[]
temperaturas=[]
medias=[]

for k in range(4):
    nombre=input("introduce el nombre de este pais")
    pais.append(nombre)
    temperaturas.append([])
    for x in range(3):
        mens=int(input("Introduce la temperatura de un mes"))
        temperaturas[k].append(mens)


print("b)")

for x in range(4):
    print(pais[x])
    for k in range(3):
        print(temperaturas[x][k])

print("c)")


for x in range(4):
    print("la media de temperatura de",pais[x],"es:")
    media=(temperaturas[x][0]+temperaturas[x][1]+temperaturas[x][2])/3
    medias.append(media)
    print(medias[x])

posmayor=0

for x in range(1,4):
    if medias[x]>medias[posmayor]:
        posmayor=x

print(pais[posmayor])
print(medias[posmayor])


