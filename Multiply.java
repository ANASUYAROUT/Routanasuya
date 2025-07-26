// import java.util.*;
// public class Multiply {
//     // return type then function name then type(arg1, arg2... multiple arg)
//     public static int CalculateProduct(int a, int b) {
//         return a * b;
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     System.out.println(+ CalculateProduct(a, b));
// }
// }
import java.util.*;
public class Multiply {
    // return type then function name then type arg / input (multiple value)
    public static int CalculateProduct(int a, int b) {
        int Product = a * b;
 return Product;
}
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    // call main function
    int Product = CalculateProduct(a, b);
    System.out.println(Product);
}
}