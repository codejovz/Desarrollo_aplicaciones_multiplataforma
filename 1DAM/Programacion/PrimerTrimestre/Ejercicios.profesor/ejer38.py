n=int(input("Introduce cuantos numeros quieres cargar"))
x=0
par=0
impar=0
while x<n:
    x=x+1
    valor=int(input("Introduce cuanto vale este valor"))
    if valor%2==0:
        par=par+1
    else:
        impar=impar+1

print("Los números pares son")
print(par)
print("Y los numeros impares son")
print(impar)
    
