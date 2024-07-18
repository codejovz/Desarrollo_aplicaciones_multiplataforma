

def to_decimal(n):
    n= list(n)
    n.reverse()
    decimal=0
    for i in range(len(n)):
        decimal=decimal+int(n[i])*pow(2,i)
    return decimal

def to_binary(n):
    binary=[]
    while n>0:
        binary.append(str(n%2))
        n=n//2
    binary.reverse()
    return binary
    #Devuelve los numeros binarios sin separaciones return join(binary)


n=input("Introduce un numero en binario: ")
print("El numero decimal es: ",to_decimal(n))
n=int(input("Introduce un numero en decimal: "))
print("El numero en binario es: ", to_binary(n))
