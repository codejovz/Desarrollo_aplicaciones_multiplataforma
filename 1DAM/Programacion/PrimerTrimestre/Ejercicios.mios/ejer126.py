#Hacer funcion que reciba un string como parametro
#y retorne la cantidad de "a" o "A"



def retornar_cant(palabra):
    cont=0
    for x in range(len(palabra)):
        if palabra[x]=="a" or palabra[x]=="A":
            cont=cont+1
    return cont


#BLOQUE PRINCIPAL

palabra=input("Introduce una palabra: ")
print("La palabra ",palabra," tiene ",retornar_cant(palabra),"a minuscula o mayuscula")
