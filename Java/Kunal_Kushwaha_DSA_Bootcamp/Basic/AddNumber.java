import java.util.ArrayList;

public class AddNumber {

  public static void main(String[] args) {
    int num[] = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
    int k = 1;
    ArrayList<Integer> ls = new ArrayList<>();
    int i = 0, j = 0, r = 0;
    long temp = 0L, rev = 0L;
    for (i = 0; i < num.length; i++) {
      temp = temp * 10 + num[i];
    }
    temp = temp + k;
    while (temp > 0) {
      r = (int) temp % 10;
      rev = rev * 10 + r;
      temp = temp / 10;
    }
    while (rev > 0) {
      r = rev % 10;
      ls.add(r);
      rev = rev / 10;
    }
    System.out.println(ls);
  }
}
