import math
#import math as m
#from math import sqrt

x = int(input('Number 1 : '))
y = int(input('Number 2 : '))

z = x + y                  #    +   -   *    /  %    //    ** 
print('Sum = ',z)
print('Sub = ',y-x)
print('Mul = ',y*x)
z = y/x
print(f'Div = {z:.2f}')
print('FDiv = ',y//x)            #Floor Division
print('Mod = ',y%x)
print('Exp = ',y**x)

z = math.sqrt(z)
print(f'Sqrt = {z:.2f}')

print(dir(math))
print(math.pi, math.tau)

