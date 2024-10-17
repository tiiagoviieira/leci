
import math

a = float(input('A = '))
b = float(input('B = '))
c : float

d = ((a*a)+(b*b))
c = math.sqrt(d)

print('A hipotenusa tem a medida de',c)
print('O angulo tem',math.degrees(math.atan(b/a)),'graus')