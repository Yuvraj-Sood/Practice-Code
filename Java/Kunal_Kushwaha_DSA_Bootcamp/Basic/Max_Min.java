package Basic;

import java.util.Scanner;

public class Max_Min {

  public static int Max(int a, int b, int c) {
    int max = a;
    if (b > max) {
      max = b;
    } else if (c > max) {
      max = c;
    }
    return max;
  }

  public static int Min(int a, int b, int c) {
    int min = a;
    if (b < min) {
      min = b;
    } else if (c < min) {
      min = c;
    }
    return min;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 numbers : ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.print("\n Maximum of three number is " + Max(a, b, c));
    System.out.print("\n Minimum of three number is " + Min(a, b, c));
  }
}
