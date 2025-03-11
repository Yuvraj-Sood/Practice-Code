import java.util.Arrays;

public class Binary_Search_withFunctions {

  public static void Bubble(int a[]) {
    int i = 0, j = 0, t = 0;
    //Bubble Sort
    for (i = 0; i < a.length; i++) {
      for (j = i + 1; j < a.length - 1; j++) {
        if (a[i] > a[j]) {
          t = a[i];
          a[i] = a[j];
          a[j] = t;
        }
      }
    }
  }

  public static void Binary(int a[], int n) {
    int start = 0, end = a.length - 1, mid = 0, found = 0;
    while (start <= end) {
      mid = (start + end) / 2;
      if (a[mid] == n) {
        found = 1;
        System.out.println("Found At " + (mid + 1) + "th Position");
        break;
      } else if (a[mid] > n) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    if (found == 0) {
      System.out.println("Element not found");
    }
  }

  public static void main(String[] args) {
    int a[] = { 34, 68, 22, 45, 12, 80, 65, 46, 9, 90 };
    int n = 45;
    Bubble(a);
    System.out.println(Arrays.toString(a));
    Binary(a, n);
  }
}
