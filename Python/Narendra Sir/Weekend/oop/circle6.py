#  add   sub   mul   div         #Operator Overloading

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
    
c1 = Circle(2.1)
c2 = Circle(2.3)
c3 = c1 + c2
print(c3)

lst = [1,2,3]
print(dir(lst))

    
    