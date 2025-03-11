class Circle:
    def area(r):
        return 3.14*r*r
    def peri(r):
        return 2*3.14*r

class Rectangle:
    def area(h,w):
        return h*w
    def peri(h,w):
        return 2*(h+w)

radius = float(input('Radius : '))
height = float(input('Height : '))
width = float(input('Width : '))

print('Area of Circle : ',Circle.area(radius))
print('Peri of Circle : ',Circle.peri(radius))

print('Area of Rect   : ',Rectangle.area(height,width))
print('Peri of Rect   : ',Rectangle.peri(height,width))


    
    