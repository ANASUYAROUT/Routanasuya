import java.util.*;
public class CheckArrayOrder {
public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);

    // size of array as input
    System.out.println("Enter the size of the array:");
    int size = sc.nextInt();
    int numbers[] = new int[size];

    // input array element
    System.out.println("Enter" + size + "numbers:");
    for(int i = 0; i<size; i++) {
        numbers[i] = sc.nextInt();
 }

    //   array is in ascending order
    boolean isAscending = true;

    //  each element is smaller than next (number.length-1 as termination condition)
    for(int i = 0; i < numbers.length - 1; i++) {
        // this condition is descending order
        if (numbers[i] > numbers[i + 1]) {

            isAscending = false;
 }
}

// Display result
if (isAscending) {
    System.out.println("The array is sorted in ascending order" );

} else {
     System.out.println("The array is not sorted in ascending order");
}

}
}
