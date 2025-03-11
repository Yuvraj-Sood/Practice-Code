public class Ceiling_Number_withFunctions {

  public static void Ceiling_Number(int a[], int n) {
    int start = 0, end = a.length - 1, mid = 0, found = 0;
    while (start <= end) {
      mid = (start + end) / 2;
      if (a[mid] == n) {
        found = 1;
        System.out.println("Ceiling Number : " + a[mid]);
        break;
      } else if (a[mid] > n) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    if (found == 0) {
      System.out.println("Ceiling Number : " + a[start]);
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
    int n = 16;
    Ceiling_Number(arr, n);
  }
}
