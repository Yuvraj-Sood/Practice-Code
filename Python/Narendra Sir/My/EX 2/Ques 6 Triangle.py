a=int(input('Side 1: '))
b=int(input('Side 2: '))
c=int(input('Side 3: '))
if((a+b)>=c or (b+c)>=a or (a+c)>=b):
    print('Triangle is Possible')
    if(a==b and a==c):
        print('Equi Triangle')
    elif(a==b or b==c or a==c):
            print('Iso Triangle')
    else:
                print('Scalene Triangle')
else:
    print('Triangle is Not Possible')