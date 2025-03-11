import time                          #Timestamp
from math import sqrt



n = int(input('Number : '))          #Space Complexity, Time Complexity

count = 0

t1 = time.time()
x = int(sqrt(n))

for i in range(2,x+1):
    if(n%i==0):
        count += 1
        break

if(count==0):    
    print('Prime number')
else:
    print('Not a Prime number')
    
t2 = time.time()

print((t2-t1)*1000)
    
    