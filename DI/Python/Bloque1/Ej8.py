"""Unha xoguetería ten moito éxito en dous dos seus produtos:
pallasos e bonecas. Adoita facer venda por correo e a
empresa de loxística cóbralles por peso de cada paquete así
que deben calcular o peso dos pallasos e bonecas que sairán
en cada paquete a demanda. Cada pallaso pesa 112 g e cada
boneca 75 g. Escribir un programa que lea o número de
pallasos e bonecas vendidos no último pedido e calcule o
peso total en kg do paquete que será enviado e o prezo
sendo a tarifa de 3,5 €/kg."""




pesoBoneca=0.075
pesoPallaso=0.112
prezo=3.5

numPallasos=int(input("Número de pallasos vendidos:"))
numBonecas=int(input("Número de bonecas vendidos:"))

pesoTotalPallasos=numPallasos*pesoPallaso
pesoTotalBonecas=numBonecas*pesoBoneca
pesoTotal=pesoTotalBonecas+pesoTotalPallasos

prezoPallasos=pesoTotalPallasos*prezo
prezoBonecas=pesoTotalBonecas*prezo

prezoTotal=prezoBonecas+prezoPallasos

print(f"O prezo total é de {prezoTotal}€ e o peso de {pesoTotal}kg")

