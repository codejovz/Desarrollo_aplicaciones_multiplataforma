nota1=int(input("Introduce tu primera nota"))
nota2=int(input("Introduce tu segunda nota"))
nota3=int(input("Introduce tu tercera nota"))

prom=(nota1+nota2+nota3)/3

if prom>=7:
    print("promocionado")
else:
    if prom>=4:
        print("Regular")
    else:
        print("Reprobado")
