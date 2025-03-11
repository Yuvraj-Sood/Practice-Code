package Basic;

import java.util.*;

public class Area_Perimeter {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Circle :");
    System.out.println("Enter Radius of Circle :");
    float r = sc.nextFloat();
    float area = 3.14f * r * r;
    float peri = 2 * 3.14f * r;
    System.out.println("Area : " + area + "\n" + "Perimeter : " + peri + "\n");

    System.out.println("Triangle :");
    System.out.println("Enter Height and Base of Triangle :");
    float h = sc.nextFloat(), b = sc.nextFloat();
    float areaT = 0.5f * h * b;
    System.out.println("Area : " + areaT + "\n");

    System.out.println("Rectangle :");
    System.out.println("Enter Length and width of Rectangle :");
    float l = sc.nextFloat(), w = sc.nextFloat();
    float areaR = l * w;
    System.out.println("Area : " + areaR + "\n");

    System.out.println("Pallelogram :");
    System.out.println("Enter Height and Base of Pallelogram :");
    float hP = sc.nextFloat(), bP = sc.nextFloat();
    float areaP = bP * hP;
    System.out.println("Area : " + areaP + "\n");
  }
}
