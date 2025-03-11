import java.util.*;
class bsort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int i,j,t;
System.out.println("Enter Elements in Array : ");
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<5-1;i++)
{
for(j=0;j<5-1-i;j++)
{
if(a[j+1]<a[j])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
System.out.println("Array After Sorting :");
for(i=0;i<5;i++)
{
System.out.print(a[i] + ",");
}
}
}