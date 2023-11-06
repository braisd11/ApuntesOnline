"""Dados unha cifra en segundos fai a
transformación en horas, minutos e
segundos. Repite o exercicio de
forma inversa, dada unha cifra en
horas, minutos e segundos,
transforma en segundos. """

horas=int(input("Introduce num horas: "))
minutos=int(input("Introduce num minutos: "))
segundos=int(input("Introduce num segundos: "))

segundosHoras=horas*3600

segundosMinutos=minutos*60

print(f"{horas} horas, {minutos} minutos y {segundos} segundos son {segundosHoras+segundosMinutos+segundos} segundos")