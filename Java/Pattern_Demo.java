import java.util.*;
class Pattern_Demo
{
public static void main(String args[])
{
Pattern ob=new Pattern();
int i=0,n=5;
for(i=0;i<=n;i++)
{
ob.pattern(i);
}
ob.pattern();
for(i=4;i>=0;i--)
{
ob.pattern(i,'Y');
}
}
}