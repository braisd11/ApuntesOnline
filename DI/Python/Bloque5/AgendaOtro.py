class Contacto:
    def __init__(self,nombre,correo,telefono):
        self.nombre = nombre
        self.correo = correo
        self.telefono = telefono
 
    def agregarContacto(Agenda):
        Contacto.nombre = input("Dime el nombre del usuario").lower()
        Contacto.correo = input("Dime el correo del usuario").lower()
        Contacto.telefono = input("Dime el telefono del usuario")
        Agenda.append([Contacto.nombre,Contacto.correo,Contacto.telefono])
        with open("telefonos.txt", "w") as archivo:
                archivo.write("\n".join(str(item) for item in Agenda))         
        archivo.close()
        
        
    def eliminarContacto(Agenda):
        Contacto.nombre = input("Dime el nombre del usuario que quieres eliminar :").lower()
        for i in Agenda:
            if Contacto.nombre in i:
                #Este metodo remove es propio de python y eliminar una variable especifica que le pasamos por paramentro
                Agenda.remove(i)
                with open("telefonos.txt", "w") as archivo:
                    archivo.write("\n".join(str(item) for item in Agenda))         
                archivo.close()
                print("Usuari@ elimando correctamente")
                
    def buscarContacto(Agenda):
        Contacto.nombre = input("Dime el nombre del usuario que quieres buscar :").lower()
        for i in Agenda:
            if Contacto.nombre in i:
                print("Se han encontrado los datos siguientes gracias al nombre de [",Contacto.nombre,"] son: ",i)
                
def main():
    user1 = Contacto("maria","maria@gmail.com","1234")
    user2 = Contacto("ana","ana@gmail.com","6789")
    Agenda = [[user1.nombre,user1.correo,user1.telefono],[user2.nombre,user2.correo,user2.telefono]]

    menu = 0
    
    while(menu != 5):
        print("1 - Agregar usuarios nuevos \n2 - Eliminar un usuario \n3 - Mostrar todos los usuarios \n4 - Buscar un usuario en especifico \n5 - Salir del programa")
        menu = int(input("Escoge opcion"))
        if(menu == 1):
            Contacto.agregarContacto(Agenda)
               
        elif(menu == 2):
            Contacto.eliminarContacto(Agenda)
                    
        elif(menu == 3):
            print("Mostrando a los todos los usuari@s")
            for i in Agenda:
                print(i)  
                
        elif(menu == 4):
            Contacto.buscarContacto(Agenda)
                                   
            
        elif(menu == 5):
            print("[ Saliendo del programa ]")
    
   
                     
    
if __name__ == "__main__":
    main()