class ThreadX implements Runnable
{
  public void run()
  {
    for(int i=1;i<=5;i++)
    {
      System.out.println("From ThreadX with i=" + i);
    }
    System.out.println("Exiting from ThreadX");
  }
}
class ThreadY implements Runnable
{
  public void run()
  {
    for(int j=1;j<=5;j++)
    {
      System.out.println("From ThreadY with j=" + j);
    }
    System.out.println("Exiting from ThreadY");
  }
}
class ThreadZ implements Runnable
{
  public void run()
  {
    for(int k=1;k<=5;k++)
    {
      System.out.println("From ThreadZ with k=" + k);
    }
    System.out.println("Exiting from ThreadZ");
  }
}
