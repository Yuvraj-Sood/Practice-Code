import java.io.File;
class FileInfo
{
public static void main(String args[])
{
File F=new File("Yuvraj.txt");
if(F.exists())
{
System.out.println("The Name of the File is : " + F.getName());
System.out.println("The Absolute Path of the File is : " + F.getAbsolutePath());
System.out.println("Is File Writeable ? - " + F.canWrite());
System.out.println("Is File Readable ? - " + F.canRead());
System.out.println("Size of the File is : " + F.length());
}
else
{
System.out.println("FIle does not exist");
}
}
}