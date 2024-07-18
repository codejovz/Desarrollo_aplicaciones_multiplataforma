def presentacion():
    print("Programa que permite cargar dos programas por teclado")
    print("Efectua la suma de los valores")
    print("Muestra el lado de la suma")
    print("******************************************************")

def carga_suma():
    valor1=int(input("Introduce el primer valor: "))
    valor2=int(input("Introduce el segundo valor: "))
    suma=valor1+valor2
    print("La suma de los dos valores es: ",suma)

def finalizacion():
    print("******************************************************")
    print("Gracias por utilizar este programa")

#PROGRAMA PRINCIPAL

presentacion()
carga_suma()
finalizacion()
