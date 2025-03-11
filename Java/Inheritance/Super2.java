class Animal2
{
Animal2()
{
System.out.println("Animal is Created..");
}
}
class Dog2 extends Animal2
{
Dog2()
{
super();
System.out.println("Dog is Created..");
}
}
class SuperTest2
{
public static void main(String args[])
{
Dog2 d=new Dog2();
}
}