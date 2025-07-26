import java.util.*;
public class CountNumber {
    // function name 
    public static void countNumbers() {
        Scanner sc = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;
        // choice is a variable of char
        char choice ;

        do {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            if (num > 0) {
            positive++;
          } else if (num < 0) {
            negative++;
          } else {
            zero++;
          }
         
          System.out.println("Do you enter another number?(y/n):");
        //  sc.next() => return y , charAt = gives ,'y'
          choice = sc.next().charAt(0);

        // y and Y two different char 
        } while (choice == 'y' || choice == 'Y') ;
        System.out.println("Total positive numbers:" + positive);
        System.out.println("Total negative numbers:" + negative);
        System.out.println("Total Zeros:" + zero);
  }
// main function call
public static void main(String[] args) {
    // Function
    countNumbers();
}
}
    
        
    

