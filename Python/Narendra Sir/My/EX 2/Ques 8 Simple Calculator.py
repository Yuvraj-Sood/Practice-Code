a=int(input("Number 1 : "))
b=int(input("Number 2 : "))
op=str(input("Enter a Operator : "))
if(op=='+'):
    c=a+b
elif(op=='-'):
    c=b-a
elif(op=='/'):
    c=a/b
elif(op=='%'):
    c=a%b
elif(op=='*'):
    c=a*b
else:
    print('Wrong Input')
print(c)