def perfect(n):
    s=0
    t=n
    for i in range(1,n):
        if(n%i==0):
            s=s+i
    if(s==t):
        print('Perfect Number')
    elif(s>t):
        print('Access Number')
    elif(s>t):
        print('Deficient Number')

        
n=int(input('Enter Number : '))
perfect(n)
