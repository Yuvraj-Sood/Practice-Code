import java.util.Scanner;

public class Number {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number :");
    int n = sc.nextInt();
    int i = 0, j = 0, t = n, rev = 0, r = 0;
    while (t > 0) {
      r = t % 10;
      rev = rev * 10 + r;
      t = t / 10;
    }
    t = rev;
    while (t > 0) {
      r = t % 10;
      for (i = 1; i <= r; i++) {
        System.out.print(r + " ");
      }
      t = t / 10;
      System.out.println();
    }
  }
}
