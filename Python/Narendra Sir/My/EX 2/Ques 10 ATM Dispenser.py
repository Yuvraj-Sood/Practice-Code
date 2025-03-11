amt=int(input('Enter a Amount that should be a multiple of 10 : '))
t=amt
if(amt%10==0):
    while(amt>0):
        if(amt>2000):
            a=amt//2000
            amt=amt-(2000*a)
            print(f'There are {a} 2000 note in {t}')
        elif(amt>500):
            b=amt//500
            amt=amt-(500*b)
            print(f'There are {b} 500 note in {t}')
        elif(amt>100):
            c=amt//100
            amt=amt-(100*c)
            print(f'There are {c} 100 note in {t}')
        elif(amt>10):
            d=amt//10
            amt=amt-(10*d)
            print(f'There are {d} 10 note in {t}')
else:
    print('Enter a valid number !!')
print(t)