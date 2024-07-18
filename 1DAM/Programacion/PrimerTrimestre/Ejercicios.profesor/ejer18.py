total=int(input("Cuantas preguntas hay en el examen?"))
correcta=int(input("cuantas contestaste correctamente?"))

multi=correcta/total
porcentaje=multi*100

if porcentaje>90:
    print("Tienes el nivel máximo")

if porcentaje>=75:
    if porcentaje<90:
        print("Tienes el nivel medio")
if porcentaje >=50:
    if porcentaje<75:
        print("Tienes un nivel regular")
if porcentaje<50:
    print("Fuera de nivel")
