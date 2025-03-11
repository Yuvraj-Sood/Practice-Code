def prime(a):
    from math import sqrt
    x=int(sqrt(a))
    c=0
    for i in range(2,x+1):
        if(a%i==0):
            c+=1
            break
    if(c==0):
        print(a)
def primecount(a,b):
    from math import sqrt
    x=int(sqrt(a))
    c=0
    b=0
    for i in range(2,x+1):
        if(a%i==0):
            c+=1
            break
        if(c==0):
            b+=1
                     
x=int(input("Enter Starting Point : "))
y=int(input("Enter Ending Point : "))
b=0
for i in range(x,y+1):
    prime(i)
    primecount(i, b)
    

        