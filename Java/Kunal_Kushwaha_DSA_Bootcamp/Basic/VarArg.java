import java.util.Arrays;

public class VarArg {

  public static void main(String[] args) {
    fun(2, 65, 778, 433, 89, 32);
    multiple(2, 3, "Yuvraj", "Palak", "FYTHJIJKB");
  }

  static void multiple(int a, int b, String... v) {
    System.out.println(a + b);
    System.out.println("array is " + Arrays.toString(v));
  }

  static void fun(int... v) {
    System.out.println("array is " + Arrays.toString(v));
  }
}
