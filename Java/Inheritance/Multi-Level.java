class Shape
{
void display()
{
System.out.println("Shape Class");
}
}
class Rectangle extends Shape
{
void area()
{
System.out.println("Rectangle Class");
}
}
class Cube extends Rectangle
{
void volume()
{
System.out.println("Cube Class");
}
}
class demo
{
public static void main(String args[])
{
Cube ob=new Cube();
ob.display();
ob.area();
ob.volume();
}
}