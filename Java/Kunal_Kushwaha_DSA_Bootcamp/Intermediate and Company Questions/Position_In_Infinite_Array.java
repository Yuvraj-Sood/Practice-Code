public class Position_In_Infinite_Array {

  public static void main(String[] args) {
    int a[] = { 2, 3, 4, 5, 6, 7, 8, 9, 77, 654, 356, 32, 67, 22, 78, 432, 78 };
    int range[] = arrayRange(a, 77);
    int ans = Binary(a, 77, range[0], range[1]);
    System.out.println(ans);
  }

  public static int[] arrayRange(int a[], int n) {
    int start = 0, end = 1;
    while (n > a[end]) {
      int newstart = end + 1;
      end = end - start + 1;
      start = newstart;
    }
    int range[] = { start, end };
    return range;
  }

  public static int Binary(int a[], int n, int start, int end) {
    int mid = 0;
    while (start <= end) {
      mid = (start + end) / 2;
      if (a[mid] == n) {
        return mid;
      } else if (a[mid] > n) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return mid;
  }
}
