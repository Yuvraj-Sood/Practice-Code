import java.util.*;
public class Stack {
    static int top=-1;
    static int n;
    static int ch;
    static int s[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of elements : ");
        n=sc.nextInt();
        s=new int[n];
        do {
            System.out.println("\n Enter Your Choice \n 1-Push \n 2-Pop \n 3-Display \n 4-Peak \n 5-Exit ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1 : push();
                         break;
                case 2 : pop();
                         break;
                case 3 : display();
                         break;
                case 4 : peak();
                         break;
            }
        } while(ch != 5);
    }
        public static void push()
        {
            Scanner sc=new Scanner(System.in);
            int ele;
            if(top==(n-1))
            {
                System.out.println("Stack is full");
            }
            else 
            {
                System.out.println("Enter Element : ");
                ele=sc.nextInt();
                top++;
                s[top]=ele;
                System.out.println("Element Entered : " + ele);
            }
        }
        public static void pop()
        {
            if(top==(-1))
            {
                System.out.println("Stack is Empty");
            }
            else
            {
                System.out.println("Element Deleted : " + s[top]);
                top--;
            }
        }
        public static void display()
        {
            if(top==(-1))
            {
                System.out.println("Stack is Empty");
            }
            else
            {
                for(int i=0;i<=top;i++)
                {
                    System.out.print(s[i] + " ");
                }
            }
        }
        public static void peak()
        {
            if(top==(-1))
            {
                System.out.println("Stack is Empty");
            }
            else
            {
                System.out.println("Element at peak : " + s[top]); 
            } 
    }
}
