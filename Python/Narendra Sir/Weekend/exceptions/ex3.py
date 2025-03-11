try:
    x = int(input('Number 1 : '))
    y = int(input('Number 2 : '))
    r = x/y
    print(f'Result = {r:.2f}')
except(ZeroDivisionError,ValueError):
    print('Divisor can not be zero..')
except:                                  #must be the last
    print('Unknown error occurred..')
    
print('End of Program..')

