dict={"vigo":0.0,"coruña":0.0,"ourense":0.0,"pontevedra":0.0,"lugo":0.0,"ferrol":0.0}
print(dict)
cidade=input("Introduce o nome da cidade:")
cidade.lower()
temperatura=float(input("Introduce a temperatura que ten:"))

dict[cidade]=temperatura
print(dict)