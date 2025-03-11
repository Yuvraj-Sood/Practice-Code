import java.util.Arrays;

public class Change {

  public static void main(String[] args) {
    int arr[] = { 1, 23, 5, 76, 88 };
    System.out.println(Arrays.toString(arr));
    swap(arr, 2, 4);
    System.out.println(Arrays.toString(arr));
    rev(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void rev(int arr[]) {
    int start = 0, end = arr.length - 1;
    while (start <= end) {
      swap(arr, start, end);
      start++;
      end--;
    }
  }

  static void swap(int arr[], int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
}
