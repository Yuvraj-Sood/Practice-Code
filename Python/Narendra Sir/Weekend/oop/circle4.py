class Circle:                         
    def __init__(self, radius=0):               
        self.radius = radius
    def area(self):
        return 3.14*self.radius*self.radius
    def peri(self):
        return 2*3.14*self.radius      
    #Destructor
    def __del__(self):
        print('Circle Deleted : ',self.radius)
    def __str__(self):
        return('Circle of Radius : '+str(self.radius))
    


r = float(input('Radius : '))
c = Circle(r)
area = c.area()
peri = c.peri()
print(f'Area of Circle : {area:.2f}')
print(f'Peri of Circle : {peri:.2f}')
print(c)       
del c
print('End of Program..')
    
    