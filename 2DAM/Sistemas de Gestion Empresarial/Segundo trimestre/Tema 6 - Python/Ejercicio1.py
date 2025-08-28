#dos de diccionarios
# dos de funciones

#Ejercicio 1
#Escribir un programa que guarde en una variable el diccionario {'Euro':'€', 'Dollar':'$', 'Yen':'¥'},
#pregunte al usuario por una divisa y
#muestre su símbolo o un mensaje de aviso si la divisa no está en el diccionario.

dicc = {'Euro':'€', 'Dollar':'$', 'Percent':'%'}

respuesta = next
respuestaEnDiccionario = False
for palabra in dicc:
    if palabra == respuesta:
        respuestaEnDiccionario = True

if respuestaEnDiccionario == False:
    print("Palabra no encontrada")
