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
        print(f'x = {self.x}, y = {self.y}')       
    
a = Alpha(5)
a.show()

b = Beta(10,20)
b.show()

