//WORST TIME COMPLEXITY = O(log n)
//Best TIME COMPLEXITY = O(1)
import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        int a[]=new int[10];
        for(i=0;i<a.length;i++)
        {
            System.out.println("Enter Elements of the array : ");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Number to be found : ");
        int n=sc.nextInt();
        int high=9,low=0,mid=(high+low)/2,f=0;
        while(high>=low)
        {
            if(a[mid]==n)
            {
                f=1;
                System.out.println("Found at " + (mid+1));
                break;
            }
            else if(a[mid]>n)
            {
                high=mid-1;
            }
            else 
            {
                low=mid+1;
            }
            mid=(high+low)/2;
        }
        if(f==0)
        {
            System.out.println("Not Found");
        }
    }
}
