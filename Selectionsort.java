import java.util.*;
public class Selectionsort {
    // using function = datatype fun name (data type arg [])
    public static void Arraysort( int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
   
   
   
     public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        // Selection sort /  represent of n = array.length 
        for(int i=0; i<arr.length-1; i++) {
            // store smallest element
            int smallest = i;
            //  next value increase 
            for(int j=i+1; j<arr.length; j++) {
        // check smallest element / jis smaleest 
        if(arr[smallest] > arr[j]) {
            smallest = j;
        }
         }

        //  swap
        int temp = arr[smallest];
        arr[smallest] =  arr[i];
        // smallest element = i store temp
        arr[i] = temp;


        }
        // function call 
        Arraysort(arr);
    }
}
