def ac(a,b):
    if a%b == 0:
        mdc = b
    else:
        mdc = b
        while (a%mdc)!=0 and (b%mdc)!=0 and (a//mdc)!=(b//mdc):
            mdc = mdc - 1

    return mdc

a = int(input())
b = int(input())
print(ac(a,b))