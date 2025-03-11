x=int(input("Enter Number : "))
y=int(input("Enter Number : "))
c=0
for i in range(x,y+1):
    if(i%3==0):
        c+=1
        print(i)
print(c)
        