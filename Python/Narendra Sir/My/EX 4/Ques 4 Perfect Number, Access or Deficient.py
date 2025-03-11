n=int(input('Enter a number : '))
s=0
t=n
for i in range(1,n):
    if(n%i==0):
        s=s+i
if(s==t):
    print("Perfect No.")
elif(s>t):
    print("Access No.")
elif(s<t):
    print("Deficient No.")