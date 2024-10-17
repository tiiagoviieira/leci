def aposta () :
    num = input('Insira o numero da jornada -> ')
    jornada = 'jornada' + num + '.csv'
    f = open('jornadas.csv','r')
    m = open(jornada,'a')
    a = []
    b = 1
    c = 0
    for linha in f:
        x = linha.split(',')
        if x[0] == num :
            aposta = input(str(b) + ' ' + x[1] + ' vs ' + x[2] + ' : ')
            m.write(str(b) + ', ' + aposta + '\n')
            b += 1
        else :
            c+=1
    f.close()
    m.close()
    m = open(jornada,'r')
    f = open('jogos.csv','r')
    for linhaf in f:
        y = linhaf.split(',')
        if c == 0 :
            print(m[enumerate])
        else :
            c -= 1

    f.close()
    m.close()

def main () :
    aposta()

main()