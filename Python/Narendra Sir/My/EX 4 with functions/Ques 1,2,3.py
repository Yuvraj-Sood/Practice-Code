def fact(n):
    for i in range(1,n+1):
        if(n%i==0):
            print(i)
def countfact(n):
    c=0
    for i in range(1,n+1):
        if(n%i==0):
            c+=1
    print(c)
def factexno(n):
    for i in range(1,n):
        if(n%i==0):
            print(i)
    c=0
    for i in range(1,n):
        if(n%i==0):
            c+=1
    print(c)
def line():
    print("_____________")

n=int(input('Enter No. : '))

fact(n)
line()
countfact(n)
line()
factexno(n)
line()