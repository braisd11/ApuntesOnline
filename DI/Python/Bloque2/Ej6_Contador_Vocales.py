"""Contador de vocales
Escribe un programa que cuente cuántas vocales (mayúsculas y minúsculas)
hay en una cadena de texto ingresada por el usuario."""

palabra=input("Introduce unha palabra: ")
cont=0

for i,letra in enumerate(palabra.lower()):
    if letra=="a" or letra=="e"or letra=="i"or letra=="o"or letra=="u":
        cont=cont+1

print(f"A palabra ten {cont} vogais.")