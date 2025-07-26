import java.util.*;
public class Calculator {
 public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number (a):");
    int a = sc.nextInt();
    System.out.println("Enter second number (b):");
    int b = sc.nextInt();
    System.out.println("Choose an operation:");
    System.out.println("1:a + b");
    System.out.println("2:a - b");
    System.out.println("3:a * b");
    System.out.println("4:a / b");
    System.out.println("5:a % b");
    int choice = sc.nextInt();
    int result = 0;
    if (choice == 1) {
        result = a + b;
System.out.println("Result =" + result);
    } else if(choice == 2) {
        result = a - b;
        System.out.println("Result =" + result);
    } else if(choice == 3) {
        System.out.println("Result =" + result);
    } else if(choice == 4) {
        if(b != 0) {
            result = a / b;
            System.out.println("Result =" + result);
        } else if(choice == 5) {
            if(b != 0) {
                result = a % b;
                System.out.println("Result =" + result);
            } else {
                System.out.println("Error: modulobby 0 not allowed");
            }
             
        } else {
            System.out.println("Invalid operation choice.");
        }
        sc.close();
 } 
 }
}
 

