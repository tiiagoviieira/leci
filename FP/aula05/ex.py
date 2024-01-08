lst = []
v = 0

def inputFloatList(lst) :
    a = input('Valor\n ->')
    i = 0

    while a != ' ' :
        lst.insert(i, int(a))
        a = input('Valor\n ->')
        i += 1
    
    i = 0
    for i in range(0,len(lst)) :
        print(lst[i],' |\n')

def coutLower(lst,v) :
    c = lst[0]
    for i in range(0,len(lst)) :
        if lst[i] < v :
            c = c + 1
    
    print('Valores inferiores a média são:',c)

def minmax(lst) :
    max = lst[0]
    min = max

    for i in range(0, len(lst)) :
        if max < lst[i] :
            max = lst[i]
        if min > lst[i] :
            min = lst[i]
    
    v = (max + min ) / 2
    print('O valor médio entre o mínimo e máximo é',v)
        
inputFloatList(lst)
minmax(lst)
coutLower(lst, v)
