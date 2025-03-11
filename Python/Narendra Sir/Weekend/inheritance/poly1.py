class Animal:
    def eat(self):
        pass
    
class Fish(Animal):
    def eat(self):
        print('Eating worms')
        
class Dog(Animal):
    def eat(self):
        print('Eating bread')
        

animals = [Fish(),Dog(),Fish(),Dog(),Fish()]

for a in animals:
    a.eat()

