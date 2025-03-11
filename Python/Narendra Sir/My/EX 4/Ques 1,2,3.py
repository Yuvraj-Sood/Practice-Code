n=int(input('Enter a number : '))
c=0
a=0
for i in range(1,n+1):
    if(n%i==0):
        c+=1
        print(i)
print(c)

for i in range(1,n):
    if(n%i==0):
        a+=1
        print(i)
print(a)