def line():
    print('###___@@@___***')
    
for i in range(1,6):
    for j in range(1,6):
        print('*',end='')
    print()
line()
for i in range(1,6):
    for j in range(1,6):
        print(i,end='')
    print()
line()
for i in range(1,6):
    for j in range(1,6):
        print(j,end='')
    print()
line()
for i in range(1,6):
    for j in range(5,0,-1):
        print(j, end='')
    print()
line()
for i in range(1,6):
    for j in range(1,i+1):
        print(i,end='')
    print()
line()
for i in range(1,6):
    for j in range(1,i+1):
        print(j,end='')
    print()
line()
for i in range(1,6):
    for j in range(i,0,-1):
        print(j,end='')
    print()
line()
for i in range(5,0,-1):
    for j in range(i,0,-1):
        print(j,end='')
    print()
line()
for i in range(1,6):
    for j in range(5,i-1,-1):
        print(j,end='')
    print()
line()
for i in range(1,6):
    for j in range(5,i,-1):
        print(" ",end='')
    for k in range(1,i+1):
        print(k,end='')
    print()
line()
for i in range(1,6):
    for j in range(5,i,-1):
        print(" ",end='')
    for k in range(1,i+1):
        print(k,end='')
    for k in range(i-1,0,-1):
        print(k,end='')
    print()
line()
a=5
b=4
for i in range(1,6):
    for j in range(i-1,0,-1):
        print(" ",end='')
    for k in range(1,a+1):
        print(k,end='')
    for k in range(b,0,-1):
        print(k,end='')
    print()
    a-=1
    b-=1
line()
a=5
for i in range(1,6):
    for j in range(1,i+1):
        print(j,end='')
    print()
for i in range(1,5):
    for j in range(1,a):
        print(j,end='')
    print()
    a-=1
line()