public class Floor_Number_withFunctions {

  public static int Floor_Number(int a[], int n) {
    int start = 0, end = a.length - 1, mid = 0, found = 0;
    while (start <= end) {
      mid = (start + end) / 2;
      if (a[mid] == n) {
        found = 1;
        return a[mid];
      } else if (a[mid] > n) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    if (found == 0) {
      return a[end];
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
    int n = 1;
    int ans = Floor_Number(arr, n);
    System.out.println(ans);
  }
}
