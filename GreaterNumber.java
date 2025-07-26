import java.util.*;
public class GreaterNumber {
public static int Greater(int a, int b) {
    // if a is greater than b /return a otherwise return b 
    // using ternary operator
   return (a > b) ? a : b;
}  
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two number");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    // call the greater function
    int result = Greater (num1, num2);
    System.out.println("Greater number is:" + result);

}  
}
