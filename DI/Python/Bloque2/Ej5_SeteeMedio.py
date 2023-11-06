"""Codifica un programa que simule unha partida ao 7 e medio coa
baralla española entre dous xogadores. Para elo o programa
sacara para cada xogador un número aleatorio entre 1 e 10 tendo
en conta que o 8, 9 e 10 simularán a sota, cabalo e rei,
respectivamente que no xogo do 7 e medio valen medio punto.
Cada xogador pódese plantar cando queira e gañará o que máis
se aproxime por debaixo ao 7 e medio.
Por exemplo:
O xogador A saca o 4 e 2 e a sota (8) ten 6 e medio e plántase.
O xogador B saca o 4 e 5 e xa perde porque pasou de 7 e medio.
Gaña o xogador A.
Cada partida finalizada pregunta se queremos seguir ou deixar o
xogo."""

import random
num=0
xogar=1
puntos1=0
puntos2=0

print("Vai a xogar o xogador 1: ")
while xogar==1 and puntos1<=7.5:
    xogar=int(input("Queres seguir xogando? (Sí->1 || Non->Calquera outro número)"))
    if xogar==1:
        num=random.randint(1,10)
        if num==8 or num==9 or num==10:
            puntos1+=0.5
        else:
            puntos1+=num
        print(f"Tes {puntos1} puntos")
    else:
        print(f"Plantácheste con {puntos1} punto(s)")
    if puntos1>7.5:
        print(f"Perdiches. Sumaches {puntos1} puntos")
        
    
num=0
xogar=1
print("Vai a xogar o xogador 2: ")
while xogar==1 and puntos2<=7.5:
    xogar=int(input("Queres seguir xogando? (Sí->1 || Non->Calquera outro número)"))
    if xogar==1:
        num=random.randint(1,10)
        if num==8 or num==9 or num==10:
            puntos2+=0.5
        else:
            puntos2+=num
        print(f"Tes {puntos2} puntos")
    else:
        print(f"Plantácheste con {puntos2} punto(s)")
    if puntos2>7.5:
        print(f"Perdiches. Sumaches {puntos2} puntos")
        

if puntos1>puntos2 and puntos1<7.5:
    print("Gañou o xogador1.")
elif puntos2>puntos1 and puntos2<7.5:
    print("Gañou o xogador2.")
elif puntos1<7.5 and puntos2>7.5:
    print("Gañou o xogador1.")
elif puntos2<7.5 and puntos1>7.5:
    print("Gañou o xogador2.")
else:
    print("Non gañou ninguén.")