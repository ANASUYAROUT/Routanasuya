import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // a ans b are two fibonacci series
        int a = 0, b = 1;
        // print a = 0
        System.out.println(a + " ");

        if(n > 1) {
            for(int i = 2; i <= n; i++) {
                System.out.println(b + " ");
                int temp = b;
                // a=3,b=2 (temp = b=2) ,b = a+b=5 /(b=5) then  a=temp 2 and 2+5 = 7
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
    }
}
