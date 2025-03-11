while(True):
    n = int(input('Number : '))
    count = 0
    
    while(n>0):
        count += 1
        n = n//10 
    print(f'It is a {count} digit number')
    
    choice = input('Repeat (Y/N) : ')
    if(choice=='N' or choice=='n'):
        break
    
    