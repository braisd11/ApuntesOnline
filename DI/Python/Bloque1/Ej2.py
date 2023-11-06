"""Escribir un programa que pregunte ao usuario polo
número de horas traballadas e o coste por hora en € con
dous decimais. Despois debe mostrar por pantalla a paga
que lle corresponde na mesma condición."""


numHoras=int(input("Introduce numero de horas:"))
costeHora=float(input("Introduce precio/hora:"))
resultado=float(numHoras)*costeHora
print(f"El resultado es:{resultado:.2f}")