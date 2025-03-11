import java.util.*;
class Student
{
String name;
int regno;
int m1,m2,m3;
Student()
{
name="Yuvraj";
regno=1927;
m1=70;
m2=69;
m3=89;
}
Student(String n,int r,int mk1,int mk2,int mk3)
{
name=n;
regno=r;
m1=mk1;
m2=mk2;
m3=mk3;
}
Student(Student s)
{
name=s.name;
regno=s.regno;
m1=s.m1;
m2=s.m2;
m3=s.m3;
}
void Display()
{
System.out.println(name+ "\t" + regno + "\t" + m1 + "\t" + m2 + "\t" + m3);
}
}
class StudentDemo
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student("John",984,45,76,86);
Student s3=new Student(s2);
s1.Display();
s2.Display();
s3.Display();
}
}