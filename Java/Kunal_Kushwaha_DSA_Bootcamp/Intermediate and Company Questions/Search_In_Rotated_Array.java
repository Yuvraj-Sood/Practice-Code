// {3,4,5,6,7,0,1,2}
// 1st find pivot - pivot is the point where sorted array is getting changed. We can also say that pivot is the largest number in the array.

public class Search_In_Rotated_Array {

  public static void main(String[] args) {
    int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
    System.out.println(findPivot(arr));
  }

  public static int search(int[] nums, int target) {
    int pivot = findPivot(nums);
    if (
      pivot == -1
    ) // if pivot =-1 then it means that it is not rotated array  then just do normal binary search
    {
      return Binary(nums, target, 0, nums.length - 1);
    } else // if pivot is found then we have 2 asc arrays
    {
      if (nums[pivot] == target) {
        return pivot;
      } else if (target >= nums[0]) {
        return Binary(nums, target, 0, pivot - 1);
      } else {
        return Binary(nums, target, pivot + 1, nums.length - 1);
      }
    }
  }

  public static int Binary(int a[], int n, int start, int end) {
    while (start <= end) {
      int mid = (start + end) / 2;
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

  public static int findPivot(int arr[]) {
    int start = 0, end = arr.length - 1;
    while (start <= end) {
      int mid = (start + (end - start)) / 2;
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      } else if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      } else if (arr[start] >= arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }
  public static int findPivotWithDuplicates(int arr[]) {
    int start = 0, end = arr.length - 1;
    while (start <= end) {
      int mid = (start + (end - start)) / 2;
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      } else if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      } else if (){
        
      }
    }
    return -1;
  }
}
