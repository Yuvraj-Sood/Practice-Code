import java.util.*;
public class Prime_Pallindrome {
    public static void main(String[] args)
    {
        System.out.println("Prime Pallindrome from 1-1000 are : ");
        int i=0,j=0,rev=0,r=0,t=0,c=0;
        for(i=1;i<=1000;i++)
        {
            if(isPrime(i) && isPallindrome(i))
            {
                System.out.print(i + " ");
            }
        }
    }

public static boolean isPrime(int n) {
    if(n<=1)
        return false;
    else 
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}

public static boolean isPallindrome(int n) {
    int t=n,r=0,rev=0;
    while(t>0)
    {
        r=t%10;
        rev=rev*10+r;
        t=t/10;
    }
    if(rev==n)
        return true;
    return false;
    }
}