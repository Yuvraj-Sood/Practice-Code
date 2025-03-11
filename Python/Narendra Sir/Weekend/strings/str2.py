#string is an iterable - 0 based index

#   h     e      l     l     o

#   0     1      2     3     4

#   -5    -4    -3    -2     -1

text = 'This is a simple message'
print(text)
print(text[1])
print(text[-1])

for ch in text:
    print(ch, end=',')
print()

print(len(text))

    
    