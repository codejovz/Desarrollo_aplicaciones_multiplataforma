def funcion(x,y):
    x=10
    y[0]=10
    print(x,y)
    print(id(x))
    print(id(y))

#PROGRAMA PRINCIPAL

x=5
y=[1,2,3,4,5]
print(x,y)
print(type(x))
print(id(x))
print(type(y))
print(id(y))

print(x,y)
funcion(x,y)
print(x,y)
print(id(x))
print(id(y))
