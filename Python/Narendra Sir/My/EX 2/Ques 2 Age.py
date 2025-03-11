age=int(input('Enter Age : '))
if(age<=12):
    print('Child')
elif(age>=13 and age<21):
    print('Young')
elif(age>=21 and age<50):
    print('Adult')
else:
    print('Old')