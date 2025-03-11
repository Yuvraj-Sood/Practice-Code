//WORST TIME COMPLEXITY = O(n)
//Best TIME COMPLEXITY = O(1)
import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("Enter Elements of the Array : ");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Number to be found : ");
        int n=sc.nextInt();
        int i=0,f=0;
        for(i=0;i<10;i++)
        {
            if(n==a[i])
            {
                f=1;
                System.out.println("Found at "+ (i+1));
                break;
            }
        }
        if(f==0)
        {
            System.out.println("Not Found");
        }
    }
}
