



x=1
mayor=0
menor=0
while x<=10:
    x=x+1
    nota=int(input("Introduce una puta nota"))
    if nota<7:
        menor=menor+1
    else:
        mayor=mayor+1

print("Cuantas notas mayores o iguales a 7 hay?")
print(mayor)
print("Cuantas notas menores de 7 hay?")
print(menor)
