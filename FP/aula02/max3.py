numero = int(input('Numeros de valores a comparar! '))
a = []

for i in range(numero):
    print('Introduza o',(i+1),'º numero')
    num = input('-> ')
    a.insert(i, num)

i = 0
for i in range(len(a)):
    max = a[0]
    b = i + 1
    if a[b] > a[i]:
        max = a[(i + 1)]

print('O maximo é',max)