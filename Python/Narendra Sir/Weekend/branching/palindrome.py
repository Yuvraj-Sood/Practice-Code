import math as m

n = int(input('4- Digit Number : '))   #21       12 

x = n//100
y = n%100
  
if(x//10==y%10 and x%10==y//10):    
    print('Palindrome')
else:
    print('Not a Palindrome')


