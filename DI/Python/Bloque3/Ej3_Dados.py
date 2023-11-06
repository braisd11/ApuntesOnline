import random

dados={2:0,3:0,4:0,5:0,6:0,7:0,8:0,9:0,10:0,11:0,12:0}

lanzamientos=int(input("Escribe cantas veces queres que se lancen os dados: "))

for i in range(lanzamientos):
    numDado1=random.randint(1,6)
    numDado2=random.randint(1,6)
    jugada=numDado1+numDado2
    dados[jugada]+=1
    print(jugada)
print(dados)