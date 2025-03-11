import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimArrayList {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> List = new ArrayList<>();
    int i, j;

    // initilization
    for (i = 0; i < 3; i++) {
      List.add(new ArrayList<>());
    }

    System.out.println("Enter Values :");

    // add elements
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        List.get(i).add(sc.nextInt());
      }
    }
    System.out.println(List);
  }
}
