class Punto:
    def __init__(self,x,y):
        self.x=x
        self.y=y
    def imprimir(self):
        print("Coordenada del punto: ")
        print("(",self.x","self.y")")

    def imprimir_cuadrante(self):
        if self.x>0 and self.y>0:
            print("Primer cuadrante")
        else:
            if self.x<0 and self.y>0:
                print("Segundo cuadrante.")
            else:
                if self.x<0 and self.y<0:
                    print("Tercer cuadrante")
                else:
                    if self.x>0 and self.y<0:
                        print("Cuarto cuadrante")


#BLOQUE PRINCIPAL



punto1=punto(10,-2)
                        
