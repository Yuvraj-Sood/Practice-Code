x=int(input("Enter a number : "))
y=int(input("Enter a number : "))
a=0
b=0
for i in range(1,x):
    if(x%i==0):
        a=a+i
for k in range(1,y):
    if(y%k==0):
        b=b+k
print(a,b)
if(a==y and b==x):
    print(f'{x,y} are buddy Numbers')
else:
    print(f'{x,y} are not buddy Numbers')