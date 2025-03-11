#iterable can be sliced

text = 'This is a simple message'
print(text[0:5])
print(text[5:])
print(text[:10])
print(text[-3:])

for ch in text[0:10]:
    print(ch, end=' ')
print()

for ch in text[10:5:-1]:
    print(ch, end=' ')
print()

for ch in text[1:10:2]:
    print(ch, end=' ')
print()

for ch in text[::-1]:
    print(ch, end=' ')
print()

temp = text[::-1]
print(temp)

    
    