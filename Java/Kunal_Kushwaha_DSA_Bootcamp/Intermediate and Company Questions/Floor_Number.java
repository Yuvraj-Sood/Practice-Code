public class Floor_Number {

  public static void main(String[] args) {
    int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
    int n = 3, f = 0;
    int start = 0, end = arr.length, mid = 0;
    while (start <= end) {
      mid = (start + end) / 2;
      if (arr[mid] == n) {
        f = 1;
        System.out.println("Floor Number : " + arr[mid]);
        break;
      } else if (n > arr[mid]) {
        start = mid + 1;
      } else if (n < arr[mid]) {
        end = mid - 1;
      }
    }
    if (f == 0) {
      System.out.println("Floor Number : " + arr[end]);
    }
  }
}
