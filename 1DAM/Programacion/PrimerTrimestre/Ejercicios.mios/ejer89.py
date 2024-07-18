sueldos=[]

for x in range(5):
    valor=int(input("Introduce un elemento"))
    sueldos.append(valor)
for x in range(4):
    if sueldos[x]>sueldos[x+1]:
        aux=sueldos[x+1]
        sueldos[x+1]=sueldos[x]
        sueldos[x]=aux

print(sueldos)
