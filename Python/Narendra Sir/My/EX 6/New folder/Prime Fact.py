def fact(n):
    for i in range(1,n+1):
        if(n%i==0):
            return i
def prime(n):
    from math import sqrt
    x=int(sqrt(a))
    c=0
    for i in range(2,x+1):
        if(a%i==0):
            c+=1
            break
    if(c==0):
        print(a)

n=int(input("enter a number: "))
while(True):
    a=fact(n)
    prime(a)
