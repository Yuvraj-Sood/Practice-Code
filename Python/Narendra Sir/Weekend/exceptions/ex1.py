x = int(input('Number 1 : '))
y = int(input('Number 2 : '))
try:
    r = x/y
    print(f'Result = {r:.2f}')
except(ZeroDivisionError):
    print('Divisor can not be zero')
    
print('End of Program..')

