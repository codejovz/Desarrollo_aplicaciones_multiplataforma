def retornar_mayor(v1,v2):
    if v1>v2:
        mayor=v1
    else:
        mayor=v2
    return mayor

#Bloque principal

v1=int(input("Introduce un valor: "))
v2=int(input("Introduce el segundo valor: "))
print("El valor mayor es: ",retornar_mayor(v1,v2))
