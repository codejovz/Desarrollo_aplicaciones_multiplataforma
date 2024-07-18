def convertir_a_HMS(seg):

    h= seg//3600
    seg=seg-h*3600
    m=seg//seg
    seg=seg-m*60
    s=seg
    return h,m,s

seg=int(input("segundos "))
h,m,s=convertir_a_HMS(seg)
print("los segundos ",segund," son ",h,":",m,":",s)
