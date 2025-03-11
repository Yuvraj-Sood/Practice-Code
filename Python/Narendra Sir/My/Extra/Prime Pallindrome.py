n=int(input('Enter a Number : '))
rev=0
c=0
t=n
for i in range(1,n+1):
        if(n%i==0):
            c+=1        
while(t>0):
    r=t%10
    rev=rev*10+r
    t=t//10
if(rev==n and c==2):
    print(f"{i} is Prime Pallindrome")
else:
    print("Not Prime Pallindrome")