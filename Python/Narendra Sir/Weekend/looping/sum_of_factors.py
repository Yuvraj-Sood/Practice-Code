n = int(input('Number : '))

total = 0

for i in range(1,n//2+1):
    if(n%i==0):
        print(i)
        total += i
        
print('Sum = ',total)
    
    