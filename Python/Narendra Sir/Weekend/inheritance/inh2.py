#universal parent class : object

class Alpha:
    def show(self):
        print('Alpha - Show')

class Beta(Alpha):
    def display(self):
        print('Beta - Display')
    
a = Alpha()
a.show()

b = Beta()
b.show()
b.display()

print(issubclass(Beta, Alpha))
print(issubclass(Beta, object))
print(issubclass(Alpha, Beta))

