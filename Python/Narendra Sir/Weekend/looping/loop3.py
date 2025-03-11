#Iterable
x = int(input('Number 1 : '))
y = int(input('Number 2 : '))

if(x>y):
    x,y = y,x
    
count = 0
for i in range(x,y+1):
    if(i%2==0 and i%3==0):
        print(i)
        count += 1
        
print('Count = ',count)
    
    


