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
       print(x,y) 

for i in range(1,1000):
    buddy