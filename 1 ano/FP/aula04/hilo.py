# Complete the code to make the HiLo game...

import random

def main():
    # Pick a random number between 1 and 100, inclusive
    secret = random.randrange(1, 101)
    print("Can you guess my secret?")
    # put your code here
    i = 0
    a = 300
    while a != secret :
        a = int(input('Tentativa -> '))
        if a > secret :
            print('High')
        if a < secret :
            print('Low')
        i = i + 1
    print(i)
    
main() 
