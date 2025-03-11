from math import sqrt

def is_prime(n):
    x = int(sqrt(n))
    status = True
    for i in range(2,x+1):
        if(n%i==0):
            status = False
            break   
    return status

n = int(input('Number : ')) 
lp = n-1
while(True):
    if(is_prime(lp)):
        break  
    lp -= 1 
    
hp = n+1
while(True):
    if(is_prime(hp)):
        break  
    hp += 1 

if(n-lp==hp-n):
    print('Nearest Primes : ',lp, hp)
elif(n-lp>hp-n):
    print('Nearest Prime : ',hp)    
else:
    print('Nearest Prime : ',lp)    


    
    