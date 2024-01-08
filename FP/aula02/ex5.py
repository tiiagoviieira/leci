tempo= float(input('Tempo em segundos'))


preçosegundo= 0.12/60
if tempo<60:
    custo= '0.12€'

else:
    custo = tempo*preçosegundo

print (custo)