import java.util.Scanner;

class Armstrong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        int t=n, r=0, sum=0;
        while(t>0)
        {
            r=t%10;
            sum=sum+(r*r*r);
            t=t/10;
        }
        if(n==sum)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}