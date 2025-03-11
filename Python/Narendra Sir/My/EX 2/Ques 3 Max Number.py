a=int(input('Number 1 : '))
b=int(input('Number 2 : '))
c=int(input('Number 3 : '))
if(a>b and a>c):
    print(f'{a} is the Greatest Number')
elif(b>a and b>c):
    print(f'{b} is the Greatest Number')
else:
    print(f'{c} is the Greatest Number')