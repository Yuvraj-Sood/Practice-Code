def prime(n):
    from math import sqrt
    x=int(sqrt(n))
    c=0
    for i in range(2,x+1):
        if(n%i==0):
            c+=1
            break
    if(c==0):
        return c
    
n=int(input('Enter a Number'))
for i in range(n,0,-1):
    a=prime(i)
    print(a)
