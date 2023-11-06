"""Introduzca una palabra de más de 9 letras por teclado e
imprima: 
las tres primeras letras
las tres últimas letras
las situadas entre la 4º y 7º posición
"""

palabra="."
while len(palabra) <= 9:
    palabra=input("Introduce unha palabra de 9 letras:\n")

tresPrimeiras=palabra[:3]
tresUltimas=palabra[-3:]
cuartaPosicionaSeptima=palabra[4:7]


print(f"""Tres primeiras letras: {tresPrimeiras}  
Tres últimas letras: {tresUltimas} 
Letras entre la cuarta y la séptima: {cuartaPosicionaSeptima}""")