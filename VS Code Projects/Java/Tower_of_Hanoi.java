import java.util.*;
public class Tower_of_Hanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n;
        System.out.println("Enter Number of Rings : ");
        n=sc.nextInt();
        if(n>0)
        {
            toh(n,'A','B','C');
        }
    }
    public static void toh(int n, char A , char B , char C )
    {
        if(n>0)
        {
            toh(n-1, A, C, B);
            System.out.println("Move disk from " + A + "-->" + C);
            toh(n-1, B, A, C);
        }
    }
}
