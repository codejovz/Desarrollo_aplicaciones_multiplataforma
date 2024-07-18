#En un curso de 4 alumnos se registraron las notas de sus examenes y se deben procesar:
#a)Nombre y nota de cada alumno(listas paralelas)
#b)Imprimir listado completo con nombres, notas, y condicion del alumno.
#De 8 para arriba es muy buena, de 4 a 7 es buena y debajo es insuficiente.
#Imprimir cuantos alumnos tienen la condicion muy buena




nombres=[]
notas=[]
condiciones=[]
contmuybuena=0
for x in range(4):
    nombre=input("Cómo se llama el alumno? ")
    nombres.append(nombre)
    nota=float(input("Introduce su nota "))
    notas.append(nota)

for x in range(4):
    if notas[x]>=8:
        condiciones.append("Muy Buena")
        contmuybuena=contmuybuena+1
    else:
        if notas[x]<8 and notas[x]>4:
            condiciones.append("Buena")
        else:
            if notas[x]<=4:
                condiciones.append("Insuciciente")

print(nombres)
print(notas)
print(condiciones)
print("El numero de alumnos que tienen la condicion muy buena es de ", contmuybuena)
    
    
