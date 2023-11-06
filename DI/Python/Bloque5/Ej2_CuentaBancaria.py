class CuentaBancaria:
    def __init__(self,titular,saldo):
        self.titular=titular
        self.saldo=saldo

    def depositar(self,ingreso):
        self.saldo+=ingreso
        print(self.saldo)
        

    def retirar(self,retiro):
        if (self.saldo-retiro)<0:
            print("Saldo insuficiente")
            
        else:
            self.saldo-=retiro
            print(self.saldo)
            
    
    def __str__(self):
        return f"\nTitular: {self.titular}\nSaldo: {self.saldo}\n"

def main():
    cuenta=CuentaBancaria("Brais",100)
    print(cuenta)
    salir=False
    while not salir:
        opcion=int(input("Selecciona:\n1->Ingresar\n2->Retirar\n3->Salir\n"))
        if opcion==1:
            cantidad=int(input("Introduce a cantidade a ingresar:"))
            cuenta.depositar(cantidad)
            print(cuenta)
        elif opcion==2:
            cantidad=int(input("Introduce a cantidade a retirar:"))
            cuenta.retirar(cantidad)
            print(cuenta)
        elif opcion==3:
            salir=True
        else:
            print("Opción non válida")
        


if __name__ == "__main__":
    main()


