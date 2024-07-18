padres=[]
hijos=[]



for x in range(3):
    padres.append([])
    ma=input("Introduce el nombre de la madre")
    pa=input("Introduce el nombre del padre")
    padres[x].append(ma)
    padres[x].append(pa)
    for y in range(3):
        numhi=int(input("Introduce el numero de hijos"))
        hijos.append([])
        for z in range(numhi):
            nomhi=input("Introduce el nombre de este hijo")
            hijos[y].append(nomhi)



for x in range(3):
    print(padres[x]," son padres de ",hijos[x])
