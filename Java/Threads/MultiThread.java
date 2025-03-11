import java.util.*;
public class MultiThread
{
  public static void main(String args[])
  {
    System.out.println("MultiThreading is running");
    ThreadA a=new ThreadA();
    ThreadB b=new ThreadB();
    ThreadC c=new ThreadC();
    a.start();
    b.start();
    c.start();
  }
}
