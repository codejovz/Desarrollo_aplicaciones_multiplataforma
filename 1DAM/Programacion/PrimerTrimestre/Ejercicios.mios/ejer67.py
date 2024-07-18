oracion=input("Introduce una oracion")
oracion=oracion.lower()

x=0
voc=0

while x<len(oracion):
    if oracion[x]=="a" or  oracion[x]=="e" or oracion[x]=="i" or oracion[x]=="o" or oracion[x]=="u":
        voc=voc+1
    x=x+1

print("El número de vocales de la oración es de:")
print(voc)
    
