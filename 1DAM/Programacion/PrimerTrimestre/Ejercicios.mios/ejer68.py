pas=input("Introduce una contraseña de 10 a 20 caracteres si no da error: ")

x=0
cont=0

while x<len(pas):
    cont=cont+1
    x=x+1
if cont>=10 and cont<=20:
    print("La contraseña es correcta")
else:
    print("Contraseña incorrecta")
