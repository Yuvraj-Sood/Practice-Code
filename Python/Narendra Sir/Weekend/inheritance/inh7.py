#universal parent class : object

class Alpha:
    def __init__(self,x):
        self.x = x
    def show(self):
        print('x : ',self.x)  

class Beta():
    def __init__(self,y):
        self.y = y
    def show(self):
        print(f'y = {self.y}')  
        
class Gamma(Alpha, Beta):
    def __init__(self,x,y,z):
        Alpha.__init__(self,x)
        Beta.__init__(self,y)
        self.z = z
    def show(self):
        Alpha.show(self)
        Beta.show(self)
        print(f'z = {self.z}')  
    
g = Gamma(1,2,3)
g.show()

