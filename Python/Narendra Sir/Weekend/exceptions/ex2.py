x = int(input('Number 1 : '))
y = int(input('Number 2 : '))
try:
    r = x/y
    print(f'Result = {r:.2f}')
except ZeroDivisionError as e:
    print(dir(e))
    
print('End of Program..')

