import java.util.*;

public class Prime {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter starting limit:");
    int start = sc.nextInt();
    System.out.println("Enter Ending Limit :");
    int end = sc.nextInt();
    prime(start, end);
  }

  public static void prime(int start, int end) {
    double sq;
    int i = 0, c = 0, j = 0;
    for (i = start; i <= end; i++) {
      sq = Math.sqrt(i);
      c = 0;
      for (j = 2; j <= sq; j++) {
        if (i % j == 0) {
          c++;
          break;
        }
        if (c == 0) {
          System.out.print(i + ",");
        }
      }
    }
  }
}
