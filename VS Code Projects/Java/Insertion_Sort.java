/*
Best Case = O(n)
Worst Case = O(n^2)
*/

import java.util.*;
public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Elements of Array : ");
        int i=0,j=0,t=0;
        int a[]=new int[10];
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=1;i<a.length;i++)
        {
            t=a[i];
            j=i-1;
            while(j>=0 && a[j]>t)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=t;
        }
        System.out.println("After Sorting : ");
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
