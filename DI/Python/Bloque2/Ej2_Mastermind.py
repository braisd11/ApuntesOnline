"""Mastermind é un xogo que consiste en adiviñar un número.
Codifica un programa que xenere un número entero
aleatorio entre 1 e 100. A continuación iranos pedindo que
adiviñemos o número. A axuda do programa será que si
erramos diranos que o número que indicamos é maior ou
menor que o que número aleatorio. Deberás incluir o
número de intentos ao final da execución do programa.
Ademáis, propoñer o programa para dous xogadores, e
quen é o vencedor."""

import random

num=random.randint(1,100)
proba=-1
intentos1=0
intentos2=0

while proba!=num:
    proba=-1
    while proba<1 or proba>100:
        proba=int(input("Proba con un número entre o 1 e o 100:"))

    if proba>num:
        print("O número buscado é menor.")
        intentos1+=1

    elif proba<num:
        print("O número buscado é maior.")
        intentos1+=1
    if proba==num:
        print(f"Correcto. Tardaches {intentos1} intentos en acertar.")


num=random.randint(1,100)
proba=-1
while proba!=num:
    proba=-1
    while proba<1 or proba>100:
        proba=int(input("Proba con un número entre o 1 e o 100:"))

    if proba>num:
        print("O número buscado é menor.")
        intentos2+=1

    elif proba<num:
        print("O número buscado é maior.")
        intentos2+=1
    if proba==num:
        print(f"Correcto. Tardaches {intentos2} intentos en acertar.")

if intentos1<intentos2:
    print("Gañou o xogador 1.")
elif intentos2<intentos1:
    print("Gañou o xogador 2.")
else:
    print("Empatástedes")