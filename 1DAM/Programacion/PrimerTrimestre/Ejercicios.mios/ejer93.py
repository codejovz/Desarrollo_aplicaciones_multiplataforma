alumnos=[]
notas[]

for x in range(5):
    nombre=input("Introduce el nombre del alumno")
    alumnos.append(nombre)
    nota=float(input("Introduce su nota"))
    notas.append(nota)

for k in range(4):
    for x in range(4-k):
        if notas[x]<notas[x+1]:
            aux=notas[x]
            notas[x]=notas[x+1]
            notas[x+1]=aux
            aux=alumnos[x]
            alumnos[x]=alumnos[x+1]
            alumnos[x+1]=aux


            
        
