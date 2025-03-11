public class Position_In_Infinite_Array {

  public static void main(String[] args) {
    int a[] = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
    int n = 10;
    System.out.println(arrayRange(a, n));
  }

  public static int arrayRange(int a[], int n) {
    int start = 0, end = 1;
    while (n > a[end]) {
      int newstart = end + 1;
      end = end - start + 1;
      start = newstart;
    }
    return Binary(a, n, start, end);
  }

  public static int Binary(int a[], int n, int start, int end) {
    int mid = 0;
    while (start <= end) {
      mid = start + (start + end) / 2;
      if (a[mid] == n) {
        return mid;
      } else if (a[mid] > n) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }
}
