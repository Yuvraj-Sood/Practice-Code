public class MultiThreadRunnable extends Thread
{
  public static void main(String args[])
  {
    System.out.println("MultiThreadRunnable is running");
    ThreadX a=new ThreadX();
    Thread t1=new Thread(a);
    ThreadY b=new ThreadY();
    Thread t2=new Thread(b);
    ThreadZ c=new ThreadZ();
    Thread t3=new Thread(c);
    t1.start();
    t2.start();
    t3.start();
    System.out.println("Exiting from MultiThreadRunnable");
  }
}
