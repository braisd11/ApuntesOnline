"""Codificar un programa que nos pida un valor de temperatura é unha
escala, por exemplo, 273 grados en escala Kelvin e posteriormente
transforme dita temperatura nas outras escalas coñecidas, neste caso
sería en Fahrenheit e Graos centígrados Centigrados.
As fórmulas necesarias son:
K = 273,1 + ºC
ºF = 1,4 · ºC + 32"""



num=float(input("Introduce o valor de temperatura: "))
escala=-1


escala=int(input("Introduce a escala elexida (Kelvin->1 || Fahrenheit->2 || Graos Centígrados->3): "))

    
if escala==1:
    graos=num-273.1
    fahrenheit=1.4*graos+32
    print(f"Graos {graos:.2f}, Fahrenheit {fahrenheit:.2f} e Kelvin {num:.2f}")
elif escala==2:
    graos=(num-32)/1.4
    kelvin=273.1+graos
    print(f"Graos {graos:.2f}, Fahrenheit {num:.2f} e Kelvin {kelvin:.2f}")
else:
    kelvin=273.1+num
    fahrenheit=1.4*num+32
    print(f"Graos {num:.2f}, Fahrenheit {fahrenheit:.2f} e Kelvin {kelvin:.2f}")

        