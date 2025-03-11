package Basic;

import java.util.Scanner;

public class Factorial {

  public static int fact(int a) {
    if (a == 1 || a == 0) {
      return 1;
    } else {
      int f = 1;
      int i = 0;
      for (i = 1; i <= a; i++) {
        f = f * i;
      }
      return f;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number : ");
    int n = sc.nextInt();
    int result = fact(n);
    System.out.println("Factorial of " + n + " : " + result);
  }
}
