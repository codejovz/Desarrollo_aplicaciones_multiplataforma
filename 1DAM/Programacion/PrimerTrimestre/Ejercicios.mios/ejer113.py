def carga_suma():
    valor1=int(input("Introduce el primer valor: "))
    valor2=int(input("Introduce el segundo valor: "))
    suma=valor1+valor2
    print("La suma de los dos valores es de ",suma)

def separacion():
    print("--------------------------------------------")

for x in range(5):
    carga_suma()
    separacion()
