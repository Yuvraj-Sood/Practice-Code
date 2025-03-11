import java.util.*;
public class Merge {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two numbers : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0,t=n;
        while(t>0)
        {
            c++;
            t=t/10;
        }
        int d=(int)Math.pow(10,c);
        int new_no=(n*d)+m;
        System.out.println("Merged Numbers are : " + new_no);
    }
}
