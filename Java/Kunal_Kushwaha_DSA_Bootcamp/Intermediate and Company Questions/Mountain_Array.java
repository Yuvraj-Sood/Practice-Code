import java.util.ArrayList;

public class Mountain_Array {

  public static void main(String[] args) {}

  // Mountain Array is an API interface, this is a leetcode ques ans is correct but the time limit is exceeding.
  public int findInMountainArray(int target, MountainArray mountainArr) {
    int start = 0, end = mountainArr.length() - 1;
    int mid = (start + end) / 2;
    ArrayList<Integer> index = new ArrayList<>();
    while (start < end) {
      if (mountainArr.get(mid) == target) {
        index.add(mid);
      } else if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
        end = mid;
      } else {
        start = mid + 1;
      }
    }
    int i = 0, min = index.get(0);
    for (i = 1; i < index.size(); i++) {
      if (index.get(i) > min) {
        min = index.get(i);
      }
    }
    return min;
  }
}
