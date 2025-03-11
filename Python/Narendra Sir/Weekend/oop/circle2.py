class Circle:                         
    def __init__(self, radius):               #Parametrized Constructor
        self.radius = radius
    def area(self):
        return 3.14*self.radius*self.radius
    def peri(self):
        return 2*3.14*self.radius        


r = float(input('Radius : '))
c = Circle(r)

area = c.area()
peri = c.peri()

print(f'Area of Circle : {area:.2f}')
print(f'Peri of Circle : {peri:.2f}')



    
    