import java.util.Scanner;
// 5^2 = 25 , 25^2=625  
public class AutoMorphic {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt();
        // int n=25598;
        int sq=(int)Math.pow(n,2);
        int t=n,c=0;
        while(t>0)
        {
            c++;
            t=t/10;
        }
        int div=(int)Math.pow(10,c);
        int rem=sq%div;
        if(n==rem)
        {
            System.out.println("AutoMorphic");
        }
        else
        {
            System.out.println("Not AutoMorphic");
        }
    }
}


