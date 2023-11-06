"""Dados unha cifra en segundos fai a
transformación en horas, minutos e
segundos. Repite o exercicio de
forma inversa, dada unha cifra en
horas, minutos e segundos,
transforma en segundos. """

segundosPedidos=int(input("Introduce num segundos:"))

numHoras=segundosPedidos // 3600
numSegundos=segundosPedidos % 3600
numMinutos=numSegundos // 60
numSegundosRestantes=numSegundos % 60
resultado=f"{segundosPedidos} segundos son {numHoras} hora(s), {numMinutos} minutos y {numSegundosRestantes} segundos."
print(resultado)