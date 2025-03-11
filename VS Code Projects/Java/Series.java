import java.util.*;
// n=2749=(2+7+4+9)+(2+7+4)+(2+7)+(2)
public class Series {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        // int n=2749;
        int t=n,r=0,sum=0;
        while(n>0)
        {
           while(t>0)
            {
                r=t%10;
                sum+=r;
                t=t/10;
            }
            n=n/10;
            t=n;    
        }
        System.out.println("Sum of above series is = " + sum);
    }
}
