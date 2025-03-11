n=int(input('Enter n Terms : '))
s=0
a=1
b=2
for i in range (1,n+1):
   s=(a+1)/(b+1)
   a+=2
   b+=2
print(s)