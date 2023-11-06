dic={}
def crearProduto():
    produto=input("Introduce o nome do produto:\n")
    if produto.lower()=="fin":
        print(dic)
        exit
    else:
        prezo=float(input("Introduce o prezo do produto:"))
        iva=float(input("Introduce o IVA que queres por:"))
        prezoTotal=calcular(prezo,iva)
        dic[produto]=prezoTotal
        file="datos.txt"
        with open(file,"w") as archivo:
            archivo.write(str(dic))
        crearProduto()
    

def calcular(prezo,iva):
    prezoTotal=prezo+((prezo*iva)/100)
    return prezoTotal

crearProduto()