"""Utilizando el algoritmo de Luhn determina si el número de
un tarjeta de crédito es válido o no
Algoritmo de Luhn.- Una tarjeta de crédito, o una tarjeta SIM, si suma de la reversa de los números pares x
2 con la reversa de los números impares es un número acabado en 0. Ejemplo:
- Número de ejemplo: 4 9 9 2 7 3 9 8 7 1 6
- Se multiplica por 2 los dígitos que ocupan las posiciones pares empezando por el final:
 (1×2) = 2, (8×2) = 16, (3×2) = 6, (2×2) = 4, (9×2) = 18
- Se suman los dígitos que ocupan las posiciones impares con los dígitos de los productos obtenidos:
6 + (2) + 7 + (1+6) + 9 + (6) + 7 + (4) + 9 + (1+8) + 4 = 70.
(1+6) es por la multiplicación de 8x2 y (1+8) es por la multiplicación de 9x2 del primer punto
- Al ser 70, acabada en 0, es válido: 70 mod 10 = 0"""

numero = input("Numero de la tarjeta: ")
print(numero)
numero_invertido = numero[::-1]
print(numero_invertido)

i=0
resultado=0
for i in range(len(numero)):
    if i%2==0:
        resultado+=int(numero_invertido[i])
    else:
        numpar = int(numero_invertido[i])*2
        if numpar>9:
            resultado+=numpar//10+numpar%10
        else:
            resultado+=numpar
   

print("Aplicando el algoritmo de Luhn da: ", resultado)
if resultado%10==0:
    print("El resultado acaba en 0, por lo tanto es correcto.")
else:
    print("El resultado no acaba en 0, por lo tanto es incorrecto.")
        

    