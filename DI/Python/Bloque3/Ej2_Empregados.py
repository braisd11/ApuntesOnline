empleados=["Antonio","Pablo","Carlos","Jaime","Sara","Laura","Paula","Ana"]
salarios=[1500,1200,2000,3400,600,1000,1350,1280]

print(empleados)
print(salarios)

for i in range(len(empleados)):
    print(empleados[i], salarios[i])

mayor=0
pos=0

for i,salario in enumerate(salarios):
    if salario>mayor:
        mayor=salario
        pos=i

menor=salarios[0]
pos2=0

for i,salario in enumerate(salarios):
    if salario<menor:
        menor=salario
        pos2=i

print("El de mayor salario es ",empleados[pos]," y cobra ",mayor)

print("El de menor salario es ",empleados[pos2]," y cobra ",menor)
