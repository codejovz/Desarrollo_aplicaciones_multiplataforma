
tri=int(input("Cuántos triángulos quieres leer? "))
lado1=0
lado2=0
lado3=0
equ=0
esc=0
iso=0
for f in range(tri):
              lad1=int(input("Introduce la medida del primer lado"))
              lado1=lado1+lad1
              lad2=int(input("Introduce la medida del segundo lado"))
              lado2=lado2+lad2
              lad3=int(input("Introduce la medida del tercer lado: "))
              lado3=lado3+lad3
              
              if lado1 == lado2 and lado2 == lado3:
                  print("Es equilátero")
                  equ=equ+1
              else:
                  if lado1!=lado2 and lado2!=lado3:
                      print("Es escaleno")
                      esc=esc+1
                  else:
                      if lado1==lado2 or lado2==lado3:
                          print("Es isósceles")
                          iso=iso+1

print("La cantidad de triángulos equiláteros es de: ")
print(equ)
print("La cantidad de triángulos escalenos es de: ")
print(esc)
print("La cantidad de triángulos isósceles es de: ")
print(iso)






#equilatero tres lados iguales
#isosceles dos lados iguales
#escaleno no tiene lados iguales
