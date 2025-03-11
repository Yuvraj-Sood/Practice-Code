s1 = 'Unisoft Technologies'

#interable : membership operator (in)

print('t' in s1)
print('t' not in s1)

count = 0
for ch in s1.lower():
    if ch in 'aeiou':
        count += 1
        
x = s1.lower().count('o')
print(x)

x = s1.find('o')
while(x != -1):
    print(x)
    x = s1.find('o', x+1)
    
s2 = s1.replace('o','?')
print(s2)


    
    