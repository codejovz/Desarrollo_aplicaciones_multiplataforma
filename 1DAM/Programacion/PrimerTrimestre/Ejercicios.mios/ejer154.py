

algo=[("Juan",[("cordoba",100),("madrid",200)])]

def cargar_candidatos():
    candidatos=[]
    cuant=int(input("Introduce cuantos candidatos quieres: "))
    for x in range(cuant):
        nom=input("Introduce el nombre del candidato: ")
        num=int(input("Introduce el numero de ciudades donde le han votado: "))
        candidatos.append((nom,[]))
        for k in range(num):
            ciu=input("Introduce en qué ciudad le han votado: ")
            vot=int(input("Introduce cuantos le han votado alli: "))
            candidatos[x][1].append((ciu,vot))
    return candidatos


def sum_votos(candidatos):
    
    print(candidatos[0][1][0][1])
    for x in range(len(candidatos)):
        totalvotos=0
        for k in range(len(candidatos[x][1][0])):
            totalvotos=totalvotos+candidatos[x][1][k][1]
        print("El candidato ",candidatos[x][0]," tiene estos votos: ",totalvotos)





#BLOQUE PRINCIPAL

candidatos=cargar_candidatos()
print(candidatos)
sum_votos(candidatos)

            
            
        
    
