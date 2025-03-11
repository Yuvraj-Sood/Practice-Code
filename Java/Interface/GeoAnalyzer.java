interface GeoAnalyzer
{
final static float pi=3.14f;
float area();
float peri();
}
class Circle implements GeoAnalyzer
{
float radius;
Circle(float r)
{
radius=r;
}
public float area()
{
return(pi*radius*radius);
}
public float peri()
{
return(2*pi*radius);
}
}
class Ellipse implements GeoAnalyzer
{
float major;
float minor;
Ellipse(float m,float n)
{
major=m;
minor=n;
}
public float area()
{
return(pi*major*minor);
}
public float peri()
{
return(pi*(major+minor));
}
}
class Geometry
{
static void display(float x,float y)
{
System.out.println("Area =" + x + "\t" + "Perimeter =" + y);
}
public static void main(String args[])
{
Circle c=new Circle(5.2f);
Ellipse e=new Ellipse(4.5f,3.6f);
GeoAnalyzer geoItem;
geoItem=c;
display(geoItem.area(),geoItem.peri());
geoItem=e;
display(geoItem.area(),geoItem.peri());
}
}