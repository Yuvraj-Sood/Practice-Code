from math import sqrt

n=int(input("Enter a number : "))
c=0
for i in range(1,n+1):
    if(n%i==0):
        c+=1
if(c==2):
    print("Prime No.")
else:
    print("Not a Prime No.")
    
c=0
for i in range(2,n//2):
    if(n%i==0):
        c+=1
        break
if(c==0):
    print('Prime Number')
else:
    print('Not a Prime Number')
    
c=0
x=int(sqrt(n))
for i in range(2,x+1):
    if(n%i==0):
        c+=1
        break
if(c==0):
    print("Prime Number")
else:
    print("Not a Prime Number")