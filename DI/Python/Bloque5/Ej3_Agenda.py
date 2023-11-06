import os

class Contacto:

    def __init__(self,nombre,correo,telefono): 
        self.nombre=nombre
        self.correo=correo
        self.telefono=telefono

    def __str__(self):
        return f"\nNombre: {self.nombre}\nCorreo: {self.correo}\nTelefono: {self.telefono}\n"
    

class Agenda:
    __file="contactos.txt"

    def __init__(self):
        self.contactos=[]

    
    def agregar(self,contacto):
        self.contactos.append(contacto)
        with open(self.__file,"a") as archivo:
            archivo.write(str(contacto))
    
    def eliminar(self,nombre):
        self.contactos.remove(self.buscar(nombre))
    
    def buscar(self,nombre):
        for i in self.contactos:
            if i.nombre == nombre:
                return i
    
    

def main():
    agenda=Agenda()
    salir=False
    while not salir:
        opcion=int(input("Selecciona:\n1->Agregar contacto\n2->Eliminar contacto\n3->Buscar contacto\n4->Salir\n"))
        if opcion==1:
            nombre=input("Escribe el nombre: ")
            correo=input("Escribe el correo: ")
            telefono=input("Escribe el telefono: ")
            contacto=Contacto(nombre,correo,telefono)
            agenda.agregar(contacto)

        elif opcion==2:
            nombre=input("Que contacto deseas eliminar?:")
            agenda.eliminar(nombre)

        elif opcion==3:
            nombre=input("Que contacto deseas buscar?:")
            print(agenda.buscar(nombre))

        elif opcion==4:
            salir=True
        else:
            print("Opción non válida")

if __name__ == "__main__":
    main()