"""Dado el radio de una circunferencia calcula su perímetro y
área. Usad función math para usar pi"""

import math

radio=float(input("Introduce o radio da circunferencia: "))

area=math.pi*(radio**2)
perimetro=2*math.pi*radio

print(f"Unha circunferencia con radio {radio} ten un perímetro de {perimetro:.2f} e un área de {area:.2f}")