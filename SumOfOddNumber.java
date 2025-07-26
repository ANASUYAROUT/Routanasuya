import java.util.*;
public class SumOfOddNumber {
    public static int sumOfOdd(int n) {
        int sum = 0;
        // i = i+2 jump by 2 no each time i=1 => 1+2=3, i=3 => 3+2 =5...7,9
        for(int i=1; i<=n; i+= 2) {
            // sum = sum + i => 0+1 = 1,sum=1, i=3 => 3+1=4) (sum=4 i=5 4+5=9....)
            sum +=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int result = sumOfOdd(n);
        // sum off odd number 1 to using + that means joint
        System.out.println("sum of odd numbers from 1 to"+ n + "is :" + result);
    }
    
}
