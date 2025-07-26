import java.util.*;
public class Factor {
    // return type / functionname / type then arg (n)
    public static void PrintFactorial(int n) {
// loop
int factorial = 1;
for(int i=n; i>=1; i--) {
    factorial = factorial * i;
    // print factorial value
}
System.out.println(factorial);
return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // call
        PrintFactorial(n);
    }
}
