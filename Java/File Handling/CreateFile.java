import java.io.File;
import java.io.IOException;
class CreateFile
{
public static void main(String args[])
{
try
{
File F=new File("Yuvraj.txt");
if(F.createNewFile())
{
System.out.println("File " + F.getName() + " is created successfully");
}
else
{
System.out.println("File Already Exists");
}
}
catch (IOException Exp)
{
System.out.println("Error Occurred");
Exp.printStackTrace();
}
}
}