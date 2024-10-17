
time = float(input('Insira quantidade de segundos!'))

horas = time // 3600
minutos = (time // 60 ) - (horas * 60)
segundos = time - (horas * 3600) - (minutos * 60) 

print(horas,'h :',minutos,'m :',segundos,'s')



