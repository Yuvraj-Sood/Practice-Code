import java.util.Arrays;

public class FirstandLastPosition {

  public static void main(String[] args) {
    int arr[] = { 5, 7, 7, 8, 8, 10, 10 };
    int target = 10;
    int ans[] = searchRange(arr, target);
    System.out.println(Arrays.toString(ans));
  }

  public static int[] searchRange(int[] nums, int target) {
    int ans[] = { -1, -1 };
    ans[0] = search(nums, target, true);
    ans[1] = search(nums, target, false);
    return ans;
  }

  public static int search(int nums[], int target, Boolean firstIndex) {
    int ans = -1;
    int start = 0, end = nums.length - 1, mid = 0;
    while (start <= end) {
      mid = (start + end) / 2;
      if (nums[mid] == target) {
        ans = mid;
      } else if (nums[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
      if (firstIndex == true) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return ans;
  }
}
