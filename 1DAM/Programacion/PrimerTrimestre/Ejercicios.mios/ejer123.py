#Elaborar una funcion que reciba tres enteros
#y nos retorne el valor promedio de los mismos.

def prom(v1,v2,v3):
    suma=v1+v2+v3
    promedio=suma//3
    return promedio

#programa principal

v1=int(input("Introduce el primer valor: "))
v2=int(input("Introduce el segundo valor: "))
v3=int(input("Introduce el tercer valor: "))
print("El promedio de los tres valores es: ",prom(v1,v2,v3))
