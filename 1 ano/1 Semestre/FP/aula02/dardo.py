import math as m

x = float(input('X -> '))
y = float(input('Y -> '))

arg = m.degrees(m.tan(y/x)) - ((360/20)/2)
d = m.sqrt(pow((x - 0),2) + pow((y - 0),2))

def multiple(d):
    if d < 3.0 or d > 5.0 and d < 10.0 :
        m = 1
    elif d >= 3.0 and d <= 5.0 :
        m = 2
    elif d >= 10.0 and d <= 12.0 :
        m = 3

    return m

def points(arg):
    if d >= 76.5 and d < 85.5:
        p = 1
    elif d >= 283.5 and d < 292.5:
        p = 2
    elif d >= 265.5 and d < 274.5:
        p = 3
    elif d >= 13.5 and d < 22.5:
        p = 4
    elif d >= 94.5 and d < 103.5:
        p = 5
    elif d >= 355.5 and d < 4.5:
        p = 6
    elif d >= and d < :
        p = 7
    elif d >= and d < :
        p = 8
    elif d >= and d < :
        p = 9
    elif d >= and d < :
        p = 10
    elif d >= and d < :
        p = 11
    elif d >= and d < :
        p = 12
    elif d >= and d < :
        p = 13
    elif d >= and d < :
        p = 14
    elif d >= and d < :
        p = 15
    elif d >= and d < :
        p = 16
    elif d >= and d < :
        p = 17
    elif d >= and d < :
        p = 18
    elif d >= and d < :
        p = 19
    elif d >= and d < :
        p = 20

    return p

score = points(arg) * multiple(d)

print(score)