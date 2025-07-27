import java.util.*;
public class GreatestCommonDivisior {
 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    // while loop using / euclidean algorithm (subtraction method)
    while(n1 != n2) {
        if (n1 > n2) {
            n1 = n1 - n2;
             } else {
                n2 = n2 - n1;
                

             }
    }

    System.out.println("GreatestCommonDivisior is:" + n2 );
 }  
}
