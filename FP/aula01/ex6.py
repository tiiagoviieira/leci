import math

x1 = float(input('Coodenada X1 -> '))
x2 = float(input('Coodenada X2 -> '))
y1 = float(input('Coodenada Y1 -> '))
y2 = float(input('Coodenada Y2 -> '))

total = math.sqrt(pow((x1-y1),2)+pow((x2-y2),2))
print(total)