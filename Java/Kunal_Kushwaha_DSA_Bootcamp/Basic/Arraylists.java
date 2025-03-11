import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> List = new ArrayList<Integer>();
    List.add(10);
    List.add(20);
    List.add(30);
    List.add(40);
    List.add(50);
    List.add(60);
    System.out.println(List);
    List.remove(4);
    List.set(3, 44);
    System.out.println(List);
    System.out.println(List.get(2));
  }
}
