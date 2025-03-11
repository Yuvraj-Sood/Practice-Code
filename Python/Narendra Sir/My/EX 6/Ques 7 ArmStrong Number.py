def count(a):
    c=0
    while(a>0):
        c+=1
        a=a//10
    return c



n=int(input("Enter a Number : "))
r=0
t=n
s=0
c=count(n)
while(t>0):
    r=t%10
    s=r**c+s
    t=t//10
if(s==n):
    print("Armstrong Number")
else:
    print("Not a Armstrong Number")

