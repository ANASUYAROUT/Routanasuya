import java.util.*;
public class CircleCalculate {
    public static double Circumference(double radius) {
return  2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double radius =sc.nextDouble();
// call
        double result = Circumference(radius);
        System.out.println("Circumference of the circle is :" + result);
    }
}
