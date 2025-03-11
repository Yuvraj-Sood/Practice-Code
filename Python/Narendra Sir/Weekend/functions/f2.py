from math import pi

def area(r,h):
    return 2*pi*r*h
def volume(r,h):
    return pi*r**2*h
def line(ch='-',count=30):                #function with default arguments
    for i in range(count):
        print(ch,end='')
    print()


r = float(input('Radius : '))
h = float(input('Height : '))
a = area(r,h)       #call by value
v = volume(r,h)

line()
print(f'Area = {a:.2f}')
line('*')
print(f'Volume : {v:.2f}')
line('#',40)
line(count=50)                #Keyword Argument




    
    

    
    