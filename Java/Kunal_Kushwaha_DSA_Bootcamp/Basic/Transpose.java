import java.util.Arrays;

class Transpose {

  public static void main(String[] args) {
    int[][] matrix = { { 2, 4, -1 }, { -10, 5, 11 }, { 18, -7, 6 } };
    int i = 0, j = 0;
    int n = matrix.length;
    int m = matrix[0].length;
    int arr[][] = new int[n][m];
    for (i = 0; i < n; i++) {
      for (j = 0; j < matrix[i].length; j++) {
        arr[i][j] = matrix[j][i];
      }
    }
    for (i = 0; i < n; i++) {
      for (j = 0; j < n; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
