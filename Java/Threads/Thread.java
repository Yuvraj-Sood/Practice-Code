class ThreadA extends Thread
{
  public void run()
  {
    for(int i=1;i<=5;i++)
    {
      System.out.println("From ThreadA with i=" + i);
    }
    System.out.println("Exiting from ThreadA");
  }
}
class ThreadB extends Thread
{
  public void run()
  {
    for(int j=1;j<=5;j++)
    {
      System.out.println("From ThreadB with j=" + j);
    }
    System.out.println("Exiting from ThreadB");
  }
}
class ThreadC extends Thread
{
  public void run()
  {
    for(int k=1;k<=5;k++)
    {
      System.out.println("From ThreadC with k=" + k);
    }
    System.out.println("Exiting from ThreadC");
  }
}