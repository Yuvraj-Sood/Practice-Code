x=int(input('Enter amount in Rupees :'))
op=int(input('Select an Option'))
if(op==1):
    y=x*73.05
    print(f'{x} Rupee in Dollar is :',y)
elif(op==2):
    y=x*89.70
    print(f'{x} Rupee in Euro is :',y)
elif(op==3):
    y=x*99.20
    print(f'{x} Rupee in Pound is :',y)
else:
    print('Wrong Option')