import java.util.Arrays;
import java.util.Scanner;

public class Search_in_2D {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[][] = {
      { 34, 76, 24, 99 },
      { 23, 98, 66, 96 },
      { 12, 5, 1 },
      { 956, 111, 89 },
    };
    int n = 1;
    int[] ans = Search(arr, n);
    System.out.println(Arrays.toString(ans));
  }

  public static int[] Search(int a[][], int n) {
    int i = 0, j = 0;
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[i].length; j++) {
        if (a[i][j] == n) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] { -1, -1 };
  }
}
