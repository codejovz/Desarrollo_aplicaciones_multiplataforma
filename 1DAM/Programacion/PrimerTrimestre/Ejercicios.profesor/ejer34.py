per=int(input("Introduce de cuantas personas hacer el promedio de altura "))

x=1
b=0
while x<=per:
    x=x+1
    alt=float(input("Cuanto mide esta persona "))
    b=alt+b
    

print("El promedio de alturas es")
print(b/per)
    
