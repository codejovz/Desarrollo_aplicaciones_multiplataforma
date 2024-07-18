def calculoFactorial(n):
    resultado = 1

    for i in range(1, n + 1):
        resultado *=i

    return resultado


numero=int(input("Introduce un numero para hacerle la factorial"))

factorial_resultado = calculoFactorial(numero)
print("El factorial de ",numero,"es: ", factorial_resultado)

