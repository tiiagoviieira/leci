import requests

def get_currency_name(country_name):
    url = f"https://restcountries.com/v3.1/name/{country_name}"
    resp = requests.get(url)
    resp = resp.json()
    
    for dados in resp:
        currencies = dados.get("currencies")
        for moeda_generico, moeda_info in currencies.items():
            moeda = moeda_info["name"]
    return moeda

print(get_currency_name(country_name="brazil"))
