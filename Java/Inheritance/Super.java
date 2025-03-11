class Animal
{
void eat()
{
System.out.println("Eating...");
}
}
class Dog extends Animal
{
void eat()
{
System.out.println("Eating Bread...");
}
void bark()
{
System.out.println("Barking...");
}
void work()
{
super.eat();
bark();
eat();
}
}
class SuperTest
{
public static void main(String args[])
{
Dog d=new Dog();
d.work();
}
}