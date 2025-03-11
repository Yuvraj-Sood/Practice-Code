import java.io.File;
import java.io.IOException;
import java.util.*;
class ReadfromFile
{
public static void main(String args[])
{
try
{
File F=new File("Yuvraj.txt");
Scanner sc=new Scanner(F);
while(sc.hasNextLine())
{
String Filedata=sc.nextLine();
System.out.println(Filedata);
}
sc.close();
}
catch(IOException Exp)
{
System.out.println("Error Occurred");
Exp.printStackTrace();
}
}
}