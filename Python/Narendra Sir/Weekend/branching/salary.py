bs = float(input('Basic Salary : '))

if(bs>=30000):
    da = bs * 0.50
    hra = bs * 0.20
    ta = bs * 0.10
    ts = bs+da+hra+ta
    tax = ts * 0.08
    ns = ts-tax
elif(bs>=15000):
    da = bs * 0.45
    hra = bs * 0.18
    ta = bs * 0.08
    ts = bs+da+hra+ta
    tax = ts * 0.06
    ns = ts-tax
else:
    da = bs * 0.40
    hra = bs * 0.15
    ta = bs * 0.05
    ts = bs+da+hra+ta
    tax = ts * 0.04
    ns = ts-tax
    
print(f'DA            : {da:0.2f}')
print(f'HRA           : {hra:0.2f}')
print(f'TA            : {ta:0.2f}')
print(f'Total Salary  : {ts:0.2f}')
print(f'Tax           : {tax:0.2f}')
print(f'Net Salary    : {ns:0.2f}')
    

