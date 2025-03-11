import java.util.*;
import java.math.*;
public class Prime1to100 {
    public static void main(String[] args) {
        int i=0,j=0,c=0;
        System.out.println("Prime Numbers from 1-100 are : ");
        for(i=2;i<=100;i++)
        {
            c=0;
            for(j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    c+=1;
                    break;
                }
            }
            if(c==0)
                {
                    System.out.print(i + " ");
                }
        }
    }
}


//write a program in java to print prime numbers from 1 - 100 ? 
