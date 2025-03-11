#   int     float    str

x = 10
y = 4.5

z = x + y
print(z, type(z))

z = x + int(y)
print(z, type(z))

x = 10
y = '20'

z = str(x) + y
print(z, type(z))