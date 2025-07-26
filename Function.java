// import java.util.*;
// public class Function {
//     // Return type /function name/(type args , args2 different type of arg)
//     public static void PrintMyName(String name) {
//         // print
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name =sc.next();
//         // CALL function
//         PrintMyName(name);
//     }
// }
import java.util.*;
public class Function {
    public static int CalculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // mainfunction return call
        int sum = CalculateSum(a, b);
        System.out.println(sum);
        
    }
}