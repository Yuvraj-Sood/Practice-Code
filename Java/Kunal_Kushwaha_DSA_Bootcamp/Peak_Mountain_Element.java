/**
 * Peak_Mountain_Element
 */
public class Peak_Mountain_Element {

  public static void main(String[] args) {
    int[] arr = { 0, 2, 5, 6, 7, 4, 3, 1 };
    int max = peakIndexInMountainArray(arr);
    System.out.println("Peak Element : " + max);
  }

  public static int peakIndexInMountainArray(int[] a) {
    int start = 0, end = a.length - 1, mid = 0;
    mid = (start + end) / 2;
    while (start < end) {
      if (a[mid] > a[mid + 1]) {
        if (a[mid] > a[mid - 1]) {
          return mid;
        } else {
          end = mid;
        }
      } else {
        start = mid + 1;
      }
    }
    return start;
  }
}
