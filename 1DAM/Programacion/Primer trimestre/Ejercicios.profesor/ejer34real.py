emp=int(input("Introduce numero de empleados "))

x=0

n=0
n2=0
m=0
m2=0

while x<emp:
    x=x+1
    sueldo=int(input("Cuanto cobras?(entre 100 y 500 "))
    if sueldo<=300:
        n=n+sueldo
        n2=n2+1
    else:
        m=m+sueldo
        m2=m2+1

print("Los empleados que cobran menos o lo mismo de 300 son ")
print(n2)

print("Y los empleados que cobran mas de 300 son ")
print(m2)

print("La empresa gasta en total ")
print(n+m)

    
