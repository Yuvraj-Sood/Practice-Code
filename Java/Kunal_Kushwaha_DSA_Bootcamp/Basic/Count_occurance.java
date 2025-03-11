package Basic;

public class Count_occurance {

  public static void main(String[] args) {
    int n = 17797;
    int c = 0;
    int r = 0;
    int rev = 0;
    while (n > 0) {
      r = n % 10;
      if (r == 7) {
        c++;
      }
      rev = (rev * 10) + r;
      n = n / 10;
    }
    System.out.println(rev);
    System.out.println("Number of occurances is " + c);
  }
}
