import math as m

n = int(input('Number : '))

x = int(m.sqrt(n))
  
if(x**2==n):    
    print('Perfect Square')
else:
    print('Not a Perfect Square')


