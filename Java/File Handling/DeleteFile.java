import java.io.File;
class DeleteFile
{
public static void main(String args[])
{
File F=new File("Yuvraj.txt");
if(F.delete())
{
System.out.println("File " + F.getName() + " Successfully Deleted");
}
else
{
System.out.println("Error Occurred");
}
}
}