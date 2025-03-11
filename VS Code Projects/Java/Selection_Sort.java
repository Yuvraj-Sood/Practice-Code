/* 
Best Case = O(n)
Worst Case = O(n^2)

60 70 40 65 80 10       min=60

10 70 40 65 80 60 1st Pass    min=70

10 40 70 65 80 60 2nd Pass    min=70

10 40 60 65 80 70 3rd Pass    min=65

10 40 60 65 80 70 4th Pass    min=80

10 40 60 65 70 80 5th Pass
*/

import java.util.*;
public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements of Array : ");
        int i=0,j=0,p=0,min=0,t=0;
        int a[]=new int[10];
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length-1;i++)
        {
            min=a[i];
            p=i;
            for(j=i+1;j<a.length;j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    p=j;
                }
            }
            t=a[i];
            a[i]=a[p];
            a[p]=t;
        }
        System.out.println("After Sorting : ");
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
