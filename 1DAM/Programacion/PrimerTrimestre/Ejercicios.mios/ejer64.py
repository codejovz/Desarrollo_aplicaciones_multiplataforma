mail=input("Introduce un email ")

x=0
cont=0

while x<len(mail):
    if mail[x]=="@":
        cont=cont+1
    x=x+1
if cont==1:
    print("El correo es correcto")
else:
    print("El correo es incorrecto")
