import requests
import math
#api key 3e211b46833145dfa7daa2a8c52c7276
#separar as categorias por vírgula
def calc_distancia(lat1,log1,lat2,log2):
    #a formula de haversine permite calcular a distancia entre dois pontos de uma esfera
    # formula retirada de :https://www.igismap.com/haversine-formula-calculate-geographic-distance-earth/ e posteriormente deduzida e adaptada para python
    dist_lat = math.radians(lat2-lat1) #distancia latitude radianos
    dist_log = math.radians(log2-log1) #distancia lonogitudo radianos
    lat1 = float(math.radians(lat1)) #latitude 1 radianos
    lat2 = float(math.radians(lat2)) #latitude 2 radianos
    a = (pow(math.sin(dist_lat/2),2) + pow(math.sin(dist_log/2),2)*math.cos(lat1)*math.cos(lat2))
    raio = 6371 #raio da terra em km
    c = 2*math.asin(math.sqrt(a))
    d = round(raio*c,2)  #distanca em km arredondada a 2 casas decimais
    return d

def get_resp(inputLst):
    lat = inputLst[0]
    long = inputLst[1]
    limite = inputLst[4]
    distancia_viajar = inputLst[2]*1000
    categorias = get_search(inputLst[3])
    url = f"https://api.geoapify.com/v2/places?categories={categorias}&filter=circle:{long},{lat},{distancia_viajar}&lang=en&limit={limite}&apiKey=3e211b46833145dfa7daa2a8c52c7276"
    resp = requests.get(url) #resposta nao processada
    resp = resp.json()
    #print(resp)
    return resp

def get_resp_horario(inputLst):
    lat = inputLst[0]
    long = inputLst[1]
    url = f"https://timeapi.io/api/TimeZone/coordinate?latitude={lat}&longitude={long}"
    resp = requests.get(url) #resposta nao processada
    resp = resp.json()
    utc_sec = resp['standardUtcOffset']['seconds']
    utc_sec = int(utc_sec)
    horas_dif = utc_sec//3600
    horas_dif = "UTC+" + str(horas_dif)
    return horas_dif

def get_moeda(pais):
    url = f"https://restcountries.com/v3.1/name/{pais}"
    resp = requests.get(url)
    resp = resp.json()
    for dados in resp:
        currencies = dados.get("currencies") #estrutura interna da resposta implica o uso desta formatacao
        for moeda_generico, moeda_info in currencies.items():
            moeda = moeda_info["name"]
    return moeda


def atributos(resp,inputLst): 
    atrib = {}
    for a in resp.get("features", []):
        nome_aloj = a.get("properties",{}).get("name")
        pais_aloj = a.get("properties",{}).get("country")
        cidade_aloj = a.get("properties",{}).get("city")
        morada_aloj = a.get("properties",{}).get("street")
        cp_aloj = a.get("properties",{}).get("postcode")
        loc = a.get("properties",{}).get("lat"), a.get("properties",{}).get("lon")
        web_site_loc = a.get("properties", {}).get("datasource", {}).get("raw", {}).get("website")
        contacto_loc = a.get("properties", {}).get("datasource", {}).get("raw", {}).get("phone")
        categorias_loc = a.get("properties", {}).get("categories")
        timezone = get_resp_horario(inputLst)
        moeda = get_moeda(pais_aloj)
        if nome_aloj != None:
        #criar dicionario dentro de dicionario, primeira key é o nome do sítio, as seguintes sao os atributos
            lat = float(inputLst[0])
            long = float(inputLst[1])
            lat2 = float(loc[0])
            long2 = float(loc[1])
            distancia = (str(calc_distancia(lat,long,lat2,long2))+" KM") #para no output aparecer com KM
            atrib[nome_aloj] = {
                "Nome": nome_aloj,
                "País": pais_aloj,
                "Cidade": cidade_aloj,
                "Fuso Horário" : timezone,
                "Moeda" : moeda,
                "Morada": morada_aloj,
                "Código postal": cp_aloj,
                "Geolocalizacao": loc,
                "Distancia": distancia, 
                "Website": web_site_loc,
                "Contacto": contacto_loc,
                "Categorias": categorias_loc
                }
    return atrib

def organizar_atributos(atrib):
    for local, atributos in atrib.items():
        print("-" * 30)
        print(local)
        for chave, valor in atributos.items(): #imprimir os dicionario dentro do dicionario, e caso algum valor retorne None, substituir isso por "Não encontrado"
            if isinstance(valor, dict):  
                print(f"{chave}:")
                for chave_dentro, valor_dentro in valor.items():
                    print(f"\t{chave_dentro}: {valor_dentro if valor_dentro is not None else 'Não encontrado'}")
            else:
                print(f"{chave}: {valor if valor is not None else 'Não encontrado'}")
        print("\n")

def get_input () :
    lat = get_lat()
    log = get_log()
    distancia = get_distancia()
    limite_res = get_limit()
    tipos = get_local_tipos()
    return lat , log , distancia , tipos,limite_res

def get_limit () :
    while True :
        limit_resultados = input("Limite de resultados (recomendado não mais do que 20): ")
        try:
            limit_resultados = int(limit_resultados)
            break
        except ValueError:
            print("Valor inválido. Por favor, introduza um número inteiro.")
    return limit_resultados

def get_lat () :
    while True :
        lat = input("Introduza a latitude: ")
        try:
            lat = float(lat)
            break
        except ValueError:
            print("Valor inválido. Por favor, introduza um número.")
    return lat

def get_log () :
    while True :
        log = input("Introduza a longitude: ")
        try:
            log = float(log)
            break
        except ValueError:
            print("Valor inválido. Por favor, introduza um número.")
    return log

def get_distancia () :
    while True :
        distancia = input("Introduza a distância em KM: ")
        try:
            distancia = float(distancia)
            break
        except ValueError:
            print("Valor inválido. Por favor, introduza um número.")
    return(distancia)


def get_search (atributos) :

    string_procura = ''

    for x in range(len(atributos)) :
            if x + 1 < len(atributos) :
                string_procura = string_procura + atributos[x] + ','
            else :
                string_procura = string_procura + atributos[x]

    return string_procura

def get_local_tipos() :
    # Depois coloco para dar para escolher também as subcategorias, mas n me aptecia fzr td, e depois também ia precisar das categorias sozinhas em si no 
    chosen_types = []
    categorias = {}
    print()
    print('O seguinte menu irá guialo(a) na escolha do tipo de localizações que procura! ')
    print()

    with open('categories.txt','r') as f:
        for linha in sorted(f):
            linha = linha.strip()
            if '.' not in linha :
                main_categoria = linha      
                categorias[main_categoria] = {}
            else:
                sub_categoria = linha
                categorias[main_categoria][sub_categoria] = {}
    
    
    while True :
        listOfCategorias = []
        
        i = 0
        for x in categorias.keys() :
            print(i,' -> ',x)
            listOfCategorias.append(x)
            i += 1

        print()
        num_type = input('Insira o numero do tipo de localização, caso não pretenda mais nenhum prima Enter! ')
        print()
        print("Por favor aguarde enquanto os dados são carregados.")
        
        if num_type.isdigit() :
            num_type = int(num_type)
            while True :
                listOfSubCategorias = []
                i = 0
                for x,y in categorias.items() :
                    if listOfCategorias[num_type] == x :
                        for a,b in y.items() :
                            print(i,' -> ',a)
                            listOfSubCategorias.append(a)
                            i += 1

                if len(listOfSubCategorias) != 0:                      
                    print()
                    num_subType = input('Insira o valor da subcategoria que pretende, caso pretenda a categoria principal insira ! e prima Enter\nCaso pretenda voltar ao menu anterior insira ? e Enter')
                    print()
                else :
                    num_subType = input('Voce selecionou uma categoria que não possui subcategorias, para selecionar a categoria principal\nescolhida prima ! e Enter, para voltar ao menu anterior prima ? e Enter')

                if num_subType == '!' :
                    chosen_types.append(listOfCategorias[num_type])
                elif num_subType == '?' :
                    break
                elif num_subType.isdigit() :
                    chosen_types.append(listOfSubCategorias[int(num_subType)])
                else :
                    print(' Valor introduzido não corresponde nenhuma das opções ou caractér inválido!')
        elif num_type != '' :
            print('Voce introduziu um caracter inválido!')
            print()
        else :
            break           

    return chosen_types

def main () :
        inputLst = []
        inputLst = get_input() 
        resp = get_resp(inputLst)
        atrib = atributos(resp,inputLst)
        organizar_atributos(atrib)

main()
while True:
    estado = input("Pretende pesquisar de novo? (Sim/Não) ")
    estado = estado.lower()
    if estado == "nao":
        break
    elif estado =="não":
        break
    elif estado == "sim":
        main()
    else:
        print("Introduza uma resposta válida")
        continue


