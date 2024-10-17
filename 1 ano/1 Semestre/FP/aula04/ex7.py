num = (input('Insira o valor real que pretende! \n Quando a sequencia de numeros estiver pronta prima enter! '))

a = [1] * 100
j = 0

for i in range(len(num)) :
    if num[i] != ' ' :
        a[j] = int(num[i])
        j = j + 1

total = 0
for d in range(j) :
    total = (a[d]) + total


media = total / j

# para testes vvvvvv
#for i in range(0,j) :
#    print(a[i])
#print(total)


print(media)