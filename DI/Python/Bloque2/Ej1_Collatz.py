"""A conxetura de Collatz indica que calquera
número natural pode transformarse en 1
aplicando os pasos seguintes: si é par, dividir por
2, se é impar multiplicar por 3 e sumarlle 1.
Codifica un programa que pedindo un número
mostre toda a sucesión de números resultantes
ata convertilo en 1."""


num=-1;

while num <=0:
    num =int(input("Inserta un numero enteiro: "))

while num!=1:
    if (num%2)==0:
        num/=2
        
    else:
        num=(num*3)+1
        
    print(int(num),end=" ")
