"""Escribe un programa que solicite la fecha de
nacimiento de un usuario y calcule su edad actual."""

from datetime import datetime

diaNacimiento=int(input("Introduce día de nacimiento: "))
mesNacimiento=int(input("Introduce mes de nacimiento: "))
anhoNacimiento=int(input("Introduce anho de nacimiento: "))

edad=0

fechaActual=datetime.now()

anhoActual=fechaActual.year
mesActual=fechaActual.month
diaActual=fechaActual.day

if mesActual >= mesNacimiento:
    if diaActual >= diaNacimiento:
        edad=anhoActual-anhoNacimiento
    else: 
        edad=(anhoActual-anhoNacimiento)-1

else:
    edad=(anhoActual-anhoNacimiento)-1

print(f"Tienes {edad} años.")
