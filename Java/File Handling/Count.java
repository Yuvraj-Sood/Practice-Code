import java.io.*;
class Count
{
	public static void main(String args[] ) throws FileNotFoundException, IOException
	{
		FileReader fin = new FileReader("Yuvraj.txt");
		int s, x=0, l=1;
		BufferedReader br = new BufferedReader(fin);
		while((s = br.read()) != -1 )
		{
			if ( s !=' ')
			x++;
			if ( s =='\n')
			   l++;
		}
		System.out.println("Numbers of characters in this file =" + x);
		System.out.println("Numbers of lines in this file =" + l);
		fin.close();
	}
}
