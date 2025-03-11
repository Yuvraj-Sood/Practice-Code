#universal parent class : object

class Alpha:
    def show(self):
        print('Alpha - Show')

    
a = Alpha()
a.show()
print(dir(a))
print(a)
#Alpha.show(a)

