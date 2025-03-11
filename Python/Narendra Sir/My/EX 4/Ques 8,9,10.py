n=int(input("Enter a number :"))
c=0
t=n
s=0
while(t>0):
    r=t%10
    s=s+r
    c+=1
    t=t//10
print(f'There are {c} digits in {n}')
print(f'The Sum of Digits is {s}')

m=int(input("Enter a number :"))
a=m
r=0
rev=0
while(a>0):
    r=a%10
    rev=rev*10+r
    a=a//10
if(rev==m):
    print('Pallindrome')
else:
    print('Not Pallindrome')