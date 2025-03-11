class Circle:                         #Define a real world entity - object(property+behaviour)
    def __init__(self):               #Constructor
        self.radius = 0
    def area(self):
        return 3.14*self.radius*self.radius
    def peri(self):
        return 2*3.14*self.radius        



c = Circle()
c.radius = float(input('Radius : '))

#area = c.area()
#peri = c.peri()

area = Circle.area(c)
peri = Circle.peri(c)

print(f'Area of Circle : {area:.2f}')
print(f'Peri of Circle : {peri:.2f}')



    
    