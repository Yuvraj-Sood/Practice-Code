n = int(input('Number : '))         #20
i = 2
while(n>1):
    if(n%i==0):
        print(i)
        n = n//i
    else:
        i += 1

    
    