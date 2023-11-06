import random
from collections import Counter

n= int(input("Cantos elementos queres?: "))

l=[]

for i in range (n):
    
    l.append(random.randint(1,10))

print(str(l))

c=Counter(l)
print("O elemento máis repetido é: ",max(c,key=c.get))