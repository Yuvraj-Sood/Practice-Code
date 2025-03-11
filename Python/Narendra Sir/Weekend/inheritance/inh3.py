#universal parent class : object

class Alpha:
    def show(self):
        print('Alpha - Show')
    def view(self):
        print('Alpha - View')        

class Beta(Alpha):
    def display(self):
        print('Beta - Display')
    def view(self):                 #Hiding / Overriding
        print('Beta - View')         
    
b = Beta()
b.show()
b.display()
b.view()


