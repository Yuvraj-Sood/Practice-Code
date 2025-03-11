import java.util.Scanner;

public class Pythagorean_Triplet {

  public static void triplet(int a, int b, int c) {
    int sum = (a * a) + (b * b);
    int sq = c * c;
    if (sum == sq) {
      System.out.println("Pythagorean_Triplet");
    } else {
      System.out.println("Not a Pythagorean_Triplet");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 3 sides of a triangle : ");
    int s1 = sc.nextInt();
    int s2 = sc.nextInt();
    int s3 = sc.nextInt();
    triplet(s1, s2, s3);
  }
}
