class Mythr extends Thread
{
  public Mythr(String name)
  {
    super(name);
  }
  public void run()
  {
    System.out.println("I am a Thread");
  }
}



class Methods
{
  public static void main(String args[])
  {
    Mythr t1=new Mythr("Yuvraj");
    Mythr t2=new Mythr("Yuvu");
    t1.start();
    t2.start();
    System.out.println(t1.getId());
    System.out.println(t1.getName());
    System.out.println(t2.getId());
    System.out.println(t2.getName());
  }
}
