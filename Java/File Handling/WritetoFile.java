import java.io.FileWriter;
import java.io.IOException;
class WritetoFile
{
public static void main(String args[])
{
try
{
FileWriter F=new FileWriter("Yuvraj.txt");
F.write("A named location used to store related information is referred to as a File.");
F.close();
System.out.println("Content Successfully Wrote");
}
catch (IOException Exp)
{
System.out.println("Error Occurred");
Exp.printStackTrace();
}
}
}