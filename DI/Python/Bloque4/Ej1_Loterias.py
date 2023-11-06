import random



def menu():
    opcion=int(input("Decide que opción deseas: \n 1->Primitiva \n 2->Euromillón \n 3->Quiniela \n 4->Loteria Nacional \n 5->Cerrar \n"))
    if opcion==1:
        primitiva()
    elif opcion==2:
        euromillon()
    elif opcion==3:
        quiniela()
    elif opcion==4:
        loteria()
    elif opcion==5:
        exit
    else:
        print("Eso non é unha opción válida")
        menu()
    
    
    
def primitiva():
    file="datos.txt"
    list=[]
    for i in range(6):
        n=random.randint(1,49)
        comp=random.randint(1,9)
        while n in list:
            n=random.randint(1,49)
            
        else:
            list.append(n)
    with open(file,"a") as archivo:
        archivo.write(str(list)+"\n")
    with open(file,"r") as archivo:
        print(archivo.read())
    menu()

def euromillon():
    file="datos.txt"
    list=[]
    numEstrella=[]
    for i in range(5):
        n=random.randint(1,50)
        while n in list:
            n=random.randint(1,50)
        else:
            list.append(n)
    for i in range(2):
        n=random.randint(1,50)
        while n in numEstrella:
            n=random.randint(1,50)
        else:
            numEstrella.append(n)
    with open(file,"a") as archivo:
        archivo.write(str(list)+"\n")
    with open(file,"r") as archivo:
        print(archivo.read())
    menu()

def quiniela():
    file="datos.txt"
    list=[]
    resultados=["1","X","2"]

    for i in range(15):
        n=random.randint(0,2)
        list.append(resultados[n])
    with open(file,"a") as archivo:
        archivo.write(str(list)+"\n")
    with open(file,"r") as archivo:
        print(archivo.read())
    menu()

def loteria():
    file="datos.txt"
    num=random.randint(0,99999)
    num=str(num).zfill(5)
    with open(file,"a") as archivo:
        archivo.write(str(num)+"\n")
    with open(file,"r") as archivo:
        print(archivo.read())
    menu()

menu()
