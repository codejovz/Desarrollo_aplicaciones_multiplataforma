



def cargar_datos():
    datos=input("Introduce palabras en este formato    alto:high,medio:medium  ")
    for x in range(len(datos)):
        if x ==":":
            completa0=datos[0]
            fincompleta=datos[x-1]
            completa=""
            for k in range(0-(x-1)):
                completa=completa+x
        print(completa)
                
    return datos

cargar_datos()

    
