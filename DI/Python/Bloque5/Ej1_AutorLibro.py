class Autor:

    def __init__(self,nombre,nacionalidad):
        self.nombre=nombre
        self.nacionalidad=nacionalidad
    
class Libro:
    def __init__(self,autor,titulo,precio):
        self.autor=autor
        self.titulo=titulo
        self.precio=precio

    def __str__(self):
        return f"Titulo: {self.titulo}\nAutor: {self.autor.nombre}\nPrecio: {self.precio} €\n"




def main():
    autor=Autor("Felipe","Mexicano")
    libro=Libro(autor,"Caperucita",18)
    print(libro)

if __name__ == "__main__":
    main()