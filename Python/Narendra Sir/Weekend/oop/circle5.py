#  eq    gt   lt  ge   le  ne

class Circle:                         
    def __init__(self, radius=0):               
        self.radius = radius
    def area(self):
        return 3.14*self.radius*self.radius
    def peri(self):
        return 2*3.14*self.radius      
    def __str__(self):
        return('Circle of Radius : '+str(self.radius))
    def __eq__(self, other):
        if(self.radius==other.radius):
            return True
        else:
            return False
    


c1 = Circle(2.3)
c2 = Circle(2.3)
#c2 = c1

print(c1==c2)
print(c1 is c2)

    
    