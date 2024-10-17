p = int(input('Insira numero de pisos! '))
m = int(input('Insira numero de moradores por piso! '))
i = 1

for i in range(1,(p+1))  :
    num = (3 * i) * (m * 2)
    num_viagens =+ num

total = num_viagens * 365
v_h = total/3600
print('O elevador funciona durante',v_h,'horas por ano!')
