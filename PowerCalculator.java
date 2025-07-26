import java.util.*;
public class PowerCalculator {
    // returntype type function name (arg ..)
public static int Power(int x, int n) {
int result = 1;
for(int i = 1; i<=n; i++) {
    // result = result * x
    result*= x;
}
return result;
}  

// main method
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.println("Enter base (x):");
    int x = sc.nextInt();
    System.out.println("Enter exponent(n):");
    int n = sc.nextInt();

    // call the function
    int answer = Power ( x,n);
    System.out.println(x + "raised to the power"+ n + "is:" + answer);


}
}
