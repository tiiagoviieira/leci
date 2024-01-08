n = int(input('Insira o numero de livros do qual pretende o valor das taxas! '))
v_final = 24,95
spa = 0,2 * n
imp = (24,95 / 1,23) * n
total = 24,95 * n
custo = 20,0 * n
lucro = total - (spa + imp + custo)
print('O lucro da livraria foi de',lucro,'euros!')

