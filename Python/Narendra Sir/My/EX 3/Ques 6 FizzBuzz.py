x=int(input("Enter Number : "))
y=int(input("Enter Number : "))
for i in range(x,y+1):
    if(i%3==0 and i%5==0):
        print(f'{i} is a FizzBuzz Number')
    elif(i%3==0):
        print(f'{i} is a Buzz Number')
    elif(i%5==0):
        print(f'{i} is a Fizz Number')
