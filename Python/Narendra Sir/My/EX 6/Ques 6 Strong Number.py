def factorial(a):
    f=1
    for i in range(1,a+1):
        f=f*i
    return(f)

n=int(input("Enter a Number : "))
r=0
t=n
s=0
while(t>0):
    r=t%10
    s=factorial(r)+s
    t=t//10
if(s==n):
    print("Strong Number")
else:
    print("Not a Strong Number")
   
    