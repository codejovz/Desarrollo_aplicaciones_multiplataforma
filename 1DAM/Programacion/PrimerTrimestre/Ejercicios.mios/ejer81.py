lista=[]

menor="hola"
for x in range(5):
    nombre=input("Introduce un nombre")
    if nombre<menor:
        menor=nombre

print("El nombre menor alfabéticamente es:" + str(menor))
