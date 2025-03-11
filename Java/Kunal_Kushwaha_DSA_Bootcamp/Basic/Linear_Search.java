import java.util.*;

public class Linear_Search {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = { 18, 9, 4, 56, 44, 75, 247, 88 };
    int n = 56;
    int f = 0, i = 0;
    for (i = 0; i < a.length; i++) {
      if (a[i] == n) {
        System.out.println("Found at :" + (i + 1) + "th position");
        f = 1;
        break;
      }
    }
    if (f == 0) {
      System.out.println("Not Found");
    }
  }
}
