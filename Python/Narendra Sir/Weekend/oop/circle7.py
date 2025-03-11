def change(c):
    c.radius -= 2

class Circle:                         
    def __init__(self, radius=0):               
        self.radius = radius
    def area(self):
        return 3.14*self.radius*self.radius
    def peri(self):
        return 2*3.14*self.radius      
    def __str__(self):
        return('Circle of Radius : '+str(self.radius))
    def __add__(self, other):
        r = self.radius+other.radius
        return Circle(r)
    
x = 5           #int, float, str, tuple    :   immutable
y = x

print(y is x)
print(y is not x)

x = x + 1
print(x, y)

c1 = Circle(3.4)
c2 = c1;
print(c2 is c1)
c1.radius += 1
print(c2 is c1)

change(c1)
print(c2 is c1)

    
    