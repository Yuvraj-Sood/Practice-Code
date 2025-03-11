class Circle:
    count = 0                         
    def __init__(self, radius=0):               
        self._radius = radius
        Circle.count += 1
    def area(self):
        return 3.14*self._radius*self._radius
    def peri(self):
        return 2*3.14*self._radius      
    def __str__(self):
        return('Circle of Radius : '+str(self._radius))
    def hello():
        print('Hello')

    
c1 = Circle(2.3)
c2 = Circle(3.4)
c2 = Circle(4.5)

print(c1._radius)
print(c1.count)

print(Circle.count)
Circle.hello();
#print(Circle.radius)   #Error

