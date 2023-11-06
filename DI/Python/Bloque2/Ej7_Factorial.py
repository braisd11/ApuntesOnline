factorial=1
num=input("Introduce un numero enteiro: ")



if num.isdigit():
    

    if num==0:
        print("0! =1")

    else:
        for i in range(1,int(num)+1):
            factorial=factorial*i
    print(f"{num}! ={factorial}")
else:
    print("Error: o numero non pode ser negativo nin decimal")



