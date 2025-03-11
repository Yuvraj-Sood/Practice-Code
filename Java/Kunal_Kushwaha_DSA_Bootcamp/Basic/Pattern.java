public class Pattern {

  public static void P1() {
    int i = 0, j = 0, t = 2;
    for (i = 1; i <= 10; i++) {
      for (j = 1; j <= i; j++) {
        System.out.print(t + " ");
        t++;
      }
      System.out.println();
    }
  }

  public static void P2() {
    int i = 0, j = 0, a = 4, b = 0;
    for (i = 1; i <= 10; i++) {
      a = 4;
      b = i;
      for (j = 1; j <= i; j++) {
        System.out.print(b + " ");
        b = b + a;
        a--;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    /* 54321
     * 54322
     * 54333
     * 54444
     * 55555
     */

    int i = 0, j = 0, a = 0, b = 1;
    for (i = 1; i <= 5; i++) {
      for (j = 5; j >= i; j--) {
        System.out.print(j + " ");
      }
      for (j = 1; j <= a; j++) {
        System.out.print(b + " ");
      }
      System.out.println();
      a++;
      b++;
    }
  }
}
