import java.util.*;
public class Magic {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int t=n,sum=0,r=0;
        while(t>9)
        {
            while(t>0)
            {
                r=t%10;
                sum=sum+r;
                t=t/10;
            }
            t=sum;
            sum=0;
        }
        if(t==1)
        {
            System.out.println("Magic ");
        }
        else
        {
            System.out.println("Not Magic");
        }
    }
}