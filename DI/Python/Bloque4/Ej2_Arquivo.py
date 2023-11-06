nomeFicheiro=input("Escribe o nome do arquivo (Sen a súa extensión):")
nomeFicheiro=nomeFicheiro+".txt"

def menu():
    opcion=int(input("Que queres facer?: \n 1->Contar as vogais\n 2->Engadir unha frase\n 3->Cerrar o programa\n"))
    if opcion==1:
        contarVogais()
    elif opcion==2:
        engadirLina()
    elif opcion==3:
        exit
    else:
        print("Non é unha opción válida")
        menu()



def contarVogais():
    with open(nomeFicheiro,"r")as archivo:
        contador=0
        for i,letra in enumerate(archivo.read()):
            if letra=='a' or letra=='e' or letra=='i' or letra=='o' or letra=='u':
                contador+=1
        print(archivo.read())
    print(f"O arquivo ten {contador} vocais.")
    menu()

def engadirLina():
    with open(nomeFicheiro,"a") as archivo:
        texto=input("Escribe a mensaxe que desexas engadir: ")
        archivo.write(texto.lower()+"\n")
    menu()

menu()