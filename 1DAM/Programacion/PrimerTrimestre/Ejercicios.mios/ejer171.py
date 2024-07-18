def meses_faltantes(numeromes):
    meses=('enero','febrero','marzo','abril','mayo','junio','julio','agosto','septiembre','octubre','noviembre','diciembre')
    return meses[numeromes:]

print("Imprimir los meses que faltan hasta el final del año: ")

numeromes=int(input("Introduce el numero del mes: "))

mesesfalta=meses_faltantes(numeromes)

print(mesesfalta)
