def sumofdig(a):
    s=0
    t=a
    r=0
    while(t>0):
        r=t%10
        s=s+r
        t=t//10
    return s

n=int(input("Enter a Number : "))
while(n>9):
    s=sumofdig(n)
    n=s
if(n==1):
    print("Magic Number")
else:
    print("Not a Magic Number")