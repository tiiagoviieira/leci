def validar (num) :
    print()
    val = True
    if len(num) < 3:
        val = False
    if num[0] == '+' :
        for x in range(1,len(num)) :
            if not num[x].isdigit() :
                val = False
    else :
        for x in range(len(num)) :
            if not num[x].isdigit() :
                val = False
    return val

        
def registarChamada () :
    origem = input('Telefone Origem -> ')
    destino = input('Telefone Destino -> ')
    duração = input('Duração (s) -> ')
    value = validar(origem) , validar(destino) , duração.isdigit()
    print(value)
    if value == (True,True,True):
        f = open('chamadas1.txt','a')
        inport = origem + '\t' + destino + '\t' + duração
        f.write(inport)
        f.close()
    else :
        print('Valor Inserido Inválido')

def lerFicheiro () :
    ficheiro = input('Ficheiro -> ')
    m = open(ficheiro,'r')
    for linha in m:
        print(linha)
    m.close()
    print()

def listarClientes() :
    listaDeClientes = []
    f = open('chamadas1.txt','r')
    val = True
    for linha in f :
        line = linha[:(linha.find('\t'))]
        if line not in listaDeClientes:
            listaDeClientes.append(line)
    f.close()
    print(listaDeClientes)
    print()

def fatura () :
    cliente = input('Insira o seu numero -> ')
    price = 0
    f = open('chamadas1.txt','r')
    for linha in f :
        x = linha.split('\t')
        if cliente == x[0] :
            if x[1][0] == '2' :
                price += float(x[2]) * 0.02
                print(linha,' ','preço -> ',float(x[2]) * 0.02,'€')
            if x[1][0] == '+' :
                price += float(x[2]) * 0.80
                print(linha,' ','preço -> ',float(x[2]) * 0.80,'€')
            if x[1][:2] == cliente[:2]:
                price += float(x[2]) * 0.04
                print(linha,' ','preço -> ',float(x[2]) * 0.04,'€')
            else :
                price += float(x[2]) * 0.10
                print(linha,' ','preço -> ',float(x[2]) * 0.10,'€')
    print()
    price = int(price)
    print('Total = ',price,'€')
    print()
    f.close()

def main () :
    print('1 -> Registar Chamada')
    print('2 -> Ler ficheiro')
    print('3 -> Listar Clientes')
    print('4 -> Fatura')
    print('5 -> Validar Numero')
    print('6 -> Terminar')
    print()
    choise = input('Opção -> ')
    if choise == '6' :
        return False
    elif choise == '1':
        registarChamada()
    elif choise == '2':
        lerFicheiro()
    elif choise == '3':
        listarClientes()
    elif choise == '4':
        fatura()
    elif choise == '5':
        num = input('Insira o Numero de telefone para validação!\n-> ')
        if validar(num) == True :
            print('Numero Válido\n')
        else :
            print('Numero Inválido\n')

while True :
    if main() == False :
        break
    else :
        main()