"""Escribir un programa que lle pida ao usuario seu peso (en
kg) e estatura (en metros), calcule o índice de masa
corporal e o almacene nunha variable <imc> mostrando
por pantalla a frase: Teu índice de masa corporal é <imc>,
con dos decimales."""

peso=float(input("Introduce o teu peso: "))
estatura=float(input("Introduce a tua estatura: "))

imc=peso/(estatura**2)

print(f"O teu índice de masa corporal é: {imc:.2f}")