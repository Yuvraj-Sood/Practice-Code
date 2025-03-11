class Student:
    def __init__(self,rno,name,course):
        self.rno = rno
        self.name = name
        self.course = course
    def __str__(self):
        return "Name : {0}, Course : {1}".format(self.name, self.course)
    
data = []
try:
    with open('students.txt','r') as f:
        data = f.readlines()
except(FileNotFoundError):
    print('The file does not exist')

students = {}
 
for line in data:
    values = line.replace('\n','').split(',')
    s = Student(values[0],values[1],values[2])
    students[s.rno] = s
    
while(True):
    rno = input('Roll Number(Enter 0 to quit) : ')
    if(rno=='0'):
        break
    if(rno in students.keys()):
        print(students[rno])
    else:
        print('Roll Number does not exist')