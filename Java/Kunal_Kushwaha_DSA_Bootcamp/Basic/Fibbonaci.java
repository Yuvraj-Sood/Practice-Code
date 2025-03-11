package Basic;

public class Fibbonaci {

  public static void main(String[] args) {
    int a = 0, b = 1, s = 0, n = 0;
    System.out.print(a + "," + b + ",");
    while (n < 10) {
      s = a + b;
      System.out.print(s + ",");
      a = b;
      b = s;
      n++;
    }
  }
}
