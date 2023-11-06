import random

li=[]
n=int(input("Introduce cantos números hai na lista:"))

for i in range(n):
    li.append(random.randint(1,10))
print(li)

opcions=int(input("Que queres facer agora?: 1->Ordenar  2->Borrar   3->Engadir  4->Tomar elementos"))

if opcions==1:
    li.sort()
    print(li)
elif opcions==2:
    elementoABorrar=int(input("Seleccione que elemento desexa borrar:"))
    li.pop(elementoABorrar)
    print(li)
elif opcions==3:
    elementoAEngadir=int(input("Seleccione que elemento desexa engadir:"))
    li.append(elementoAEngadir)
    print(li)
elif opcions==4:
    print(li[3:6])
else:
    print("Opción no válida")