#universal parent class : object

class Alpha:
    def __init__(self,x):
        self.x = x
    def show(self):
        print('x : ',self.x)  

class Beta(Alpha):
    def __init__(self,x,y):
        super().__init__(x)
        self.y = y
    def show(self):
        super().show()
        print(f'x = {self.x}')  
        
class Gamma(Beta):
    def __init__(self,x,y,z):
        super().__init__(x,y)
        self.z = z
    def show(self):
        super().show()
        print(f'z = {self.z}')  
    
a = Alpha(5)
a.show()

b = Beta(10,20)
b.show()

g = Gamma(1,2,3)
g.show()

