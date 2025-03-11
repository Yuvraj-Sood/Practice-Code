/*
Best Case = O(n)
Worst Case = O(n^2)

60 70 40 65 80 10 

60 40 70 65 80 10 

60 40 65 70 80 10 

60 40 65 70 10 80 1st Pass

40 60 65 70 10 80 

40 60 65 10 70 80 2nd Pass

40 60 10 65 70 80 3rd Pass

40 10 60 65 70 80 4th Pass

10 40 60 65 70 80 5th Pass*/


import java.util.*;
public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Elements of Array : ");
        int i=0,j=0,t=0;
        int a[]=new int[10];
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length-1;i++)
        {
            for(j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("After Sorting : ");
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}