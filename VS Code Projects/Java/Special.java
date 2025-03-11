import java.util.*;
public class Special {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        int t=n,r=0,sum=0,i=0,f=1;
        while(t>0)
        {
            r=t%10;
            f=1;
            for(i=1;i<=r;i++)
            {
                f=f*i;
            }
            sum=sum+f;
            t=t/10;
        }
        if(sum==n)
        {
            System.out.println("Special");
        }
        else
        {
            System.out.println("Not Special");
        }
    }
}
