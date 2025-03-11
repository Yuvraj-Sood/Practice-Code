class Circle:                         
    def __init__(self, radius):               #Parametrized Constructor
        if(radius<=0):
            raise ValueError('The radius can not be negative')            
        self.radius = radius
    def area(self):
        return 3.14*self.radius*self.radius
    def peri(self):
        return 2*3.14*self.radius 
    
try:
    c = Circle(5)
    print('Area = ',c.area())
except ValueError as e:
    print(e)

try:
    c = Circle(-2)
    print('Area = ',c.area())
except ValueError as e:
    print(e)
    
print('End of Program..')

