class Mythr implements Runnable
{
  public Mythr(Runnable r,String name)
  {
    super(r,name);
  }
  public void run()
  {
    System.out.println("I am a Thread");
  }
}



class MethodsRunnable
{
  public static void main(String args[])
  {
    Mythr t1=new Mythr();
    Thread th=new Thread(Runnable,"Yuvraj")
    t1.start();
    System.out.println(t1.getId());
    System.out.println(t1.getName());
  }
}
