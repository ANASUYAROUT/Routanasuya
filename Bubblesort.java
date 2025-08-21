import java.util.*;
public class Bubblesort {
   
   
    // using function
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
       
        // bubble sot arrange n-1 , n= arr.length
        // outer loop
        for(int i=0; i<arr.length-1; i++) {
            // inner loop
            for(int j=0; j<arr.length-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                   
                    // swap (change the value) , temp (store the value j)
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        // function call
        printArray(arr);
    }
}
