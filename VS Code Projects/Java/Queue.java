import java.util.*;
public class Queue {
    static int q[];
    static int n;
    static int f=-1;
    static int r=-1;
    static int ch;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        n=sc.nextInt();
        q=new int[n];
        do{
            System.out.println("\n Enter Your Choice \n 1-Insert \n 2-Delete \n 3-Display \n 4-Exit ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1: insert();
                        break;
                case 2: delete();
                        break;
                case 3: display();
                        break;
            }
        }while(ch != 4);
    }
    public static void insert()
    {
        if(r==n-1)
        {
            System.out.println("Queue is Full");
        }
        else
        {
            Scanner sc=new Scanner(System.in);
            if(f==-1)
            {
                f=0;
            }
            int ele;
            System.out.println("Enter a element : ");
            ele=sc.nextInt();
            r++;
            q[r]=ele;
        }
    }
    public static void delete()
    {
        if(f==-1 || f>r)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("Element Deleted : " + q[f]);
            f++;
        }
    }
    public static void display()
    {
        if(f==-1 || f>r)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            for(int i=f;i<=r;i++)
            {
                System.out.print(q[i] + " ");
            }
        }    
    }
}
