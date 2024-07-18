paises=[]
habitantes=[]

for x in range(5):
    pais=input("Introduce el nombre de un pais: ")
    paises.append(pais)
    num=int(input("Introduce el numero de habitantes que tiene este pais: "))
    habitantes.append(num)


for k in range(4):
    for x in range(4-k):
        if paises[x]>paises[x+1]:
            aux=paises[x]
            paises[x]=paises[x+1]
            paises[x+1]=aux
            aux=habitantes[x]
            habitantes[x]=habitantes[x+1]
            habitantes[x+1]=aux
            

print("El listado de paises en orden alfabético sería:")
for x in range(5):
    print(paises[x],habitantes[x])
    

for k in range(4):
    for x in range(4-k):
        if habitantes[x]<habitantes[x+1]:
            aux=habitantes[x]
            habitantes[x]=habitantes[x+1]
            habitantes[x+1]=aux
            aux=paises[x]
            paises[x]=paises[x+1]
            paises[x+1]=aux


print("Y la lista de habitantes de mayor a menor seria")
for x in range(5):
    print(paises[x],habitantes[x])

            
