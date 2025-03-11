def hcf(x,y):
    s=0
    gcd=0
    if(x>y):
        s=x
    else:
        s=y
    for i in range(1,s+1):
        if(x%i==0) and (y%i==0):
            gcd=i    
    return gcd


x=int(input("Enter a Number : "))
y=int(input("Enter a Number : "))
print(hcf(x,y))