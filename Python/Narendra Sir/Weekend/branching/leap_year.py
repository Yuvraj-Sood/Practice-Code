y = int(input('Year : '))

if(y%400==0):
    print('Leap Year')
elif(y%4==0 and y%100 != 0):
    print('Leap Year')
else:
    print('Not a Leap Year')

