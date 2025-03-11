import java.util.*;
public class Armstrong1to1000 {
    public static void main(String[] args) {
        int i=0,r=0,t=0,sum=0;
        System.out.println("Armstrong Numbers from 1-1000 are : ");
        for(i=1;i<=5000;i++)
        {
            sum=0;
            t=i;
            while(t>0)
            {
                r=t%10;
                sum=sum+(r*r*r);
                t=t/10;
            }
            if(sum==i)
            {
                System.out.print(i + " ");
            }
        }
    }
}
