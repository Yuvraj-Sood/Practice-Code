import java.util.*;
class ssort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int i=0,j=0,p=0,min=0,t=0;
System.out.println("Enter Values in Array");
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<5;i++)
{
min=a[i];
p=i;
for(j=i+1;j<5;j++)
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
System.out.println("After Sorting ");
for(i=0;i<5;i++)
{
System.out.print(a[i] + ",");
}
}
}
