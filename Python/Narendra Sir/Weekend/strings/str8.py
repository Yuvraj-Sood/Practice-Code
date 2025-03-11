s1 = 'Nagendra,Aman,Yuvraj,Gaurav,Deepak,Akshat'

names = s1.split(',')

for name in names:
    print(name)
print('---------------------') 
names = s1.split(',',3)

for name in names:
    print(name)
    
name = 'Nagendra'
age = 45
score = 6.7

message = "Hello {0}, Your age is {1}, Your score is {2}".format(name,age,score)
print(message)

name = 'Nagendra'

text = ' '.join(name)
print(text)

text = ' '.join(reversed(name))
print(text)

for ch in reversed(name):
    print(ch)


    
    