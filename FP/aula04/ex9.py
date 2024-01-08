num1 = 1
num2 = 0

def fibonacci(n) :
    if n == 0 :
        print(0)
    elif n == 1 :
        print(1)
    else :
        for i in range(2,(n+1)) :
            num1 = i - 1
            num2 = i - 2
            num_atual = num1 + num2
    return num_atual

n = int(input('Insira o valor\n-> '))
print(fibonacci(n))