def buddy(x,y):
    a=0
    b=0
    for i in range(1,x):
        if(x%i==0):
            a=a+i
    for j in range(1,y):
        if(y%j==0):
            b=b+j
    if(a==y and b==x):
       print(f'{x,y} are buddy Numbers')
    else:
       print(f'{x,y} are not buddy Numbers')
        
n=int(input("Enter a Number : "))
m=int(input("Enter a Number : "))
buddy(n,m)
