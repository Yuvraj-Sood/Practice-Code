pr=int(input('Enter Previous Reading : '))
cr=int(input('Enter Current Reading : '))
ct=str(input('Enter Connection type : '))
units=cr-pr
if(ct=='C'):
    if(units<=300):
        amt=units*4.2
    elif(units>300 and units<=500):
        amt=300*4.2 + (units-300)*4.9
    else:
        amt=300*4.2 + 200*4.9 + (units-500)*5.7
    gst=(8/100)*amt
elif(ct=='R'):
    if(units<=300):
        amt=units*3.4
    elif(units>300 and units<=500):
        amt=300*3.4 + (units-300)*3.8
    else:
        amt=300*3.4 + 200*3.8 + (units-500)*4.3
    gst=(5/100)*amt
else:
    print('Wrong Connection Type')
tb=amt+gst
print(f'Previous Reading : {pr}')
print(f'Current Reading  : {cr}')
print(f'Connection Type  : {ct}')
print(f'Units            : {units}')
print(f'Amount           : {amt}')
print(f'gst              : {gst}')
print(f'Total Bill       : {tb}')
