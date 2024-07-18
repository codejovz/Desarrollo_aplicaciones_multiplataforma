def mostrar_mensaje(mensaje):
    print("*****************************")
    print(mensaje)
    print("*****************************")

def carga_suma():
    valor1=int(input("Introduce el primer valor: "))
    valor2=int(input("Introduce el segundo valor: "))
    suma=valor1+valor2
    print("La suma de los dos valores es: ",suma)

#PROGRAMA PRINCIPAL

mostrar_mensaje("El programa calcula la suma de los dos valores introducidos por teclado")
carga_suma()
mostrar_mensaje("Gracias por utilizar este programa")
