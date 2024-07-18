def cargar_datos():
    nom=[]
    ed=[]
    for x in range(2):
        v1=input("Introduce el nombre de la persona: ")
        nom.append(v1)
        v2=int(input("Introduce su edad: "))
        ed.append(v2)
    return[nom,ed]

def mayores_edad(nom,ed):
    print("Nombres de personas mayores de edad: ")
    for x in range(len(nom)):
        if ed[x]>=18:
            print(nom[x])

def promedio_edades(ed):
    suma=0
    for x in range(len(ed)):
        suma=suma+ed[x]
    promedio=suma/len(ed)
    print("Edad promedio de las personas: ",promedio)

#BLOQUE PRINCIPAL

nombres,edades=cargar_datos()#TIENES QUE CARGAR LISTA EN LA PRINCIPAL
mayores_edad(nombres,edades)
promedio_edades(edades)
        
        
