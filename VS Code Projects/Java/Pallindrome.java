import java.util.*;
public class Pallindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        int t=n, r=0, rev=0;
        while(t>0)
        {
            r=t%10;
            rev=(rev*10)+r;
            t=t/10;
        }
        if(rev==n)
        {
            System.out.println("Pallindrome");
        }
        else 
        {
            System.out.println("Not Pallindrome");
        }
    }
}
