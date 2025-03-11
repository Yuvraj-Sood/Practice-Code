class Animal:
    def eat(self):
        pass
    
class Fish(Animal):
    def eat(self):
        print('Eating worms')
    def swim(self):
        print('Swimming..')        
        
class Dog(Animal):
    def eat(self):
        print('Eating bread')
    def bark(self):
        print('Barking')        
        

animals = [Fish(),Dog(),Fish(),Dog(),Fish()]

for a in animals:
    a.eat()
    if(isinstance(a,Fish)):
        a.swim()
    elif(isinstance(a,Dog)):
        a.bark()

