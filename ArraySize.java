import java.util.*;
public class ArraySize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // syntax : type[]arrayname = new type[size]
        int numbers[] = new int[size] ;

        // input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        // output
        for(int i=0; i<size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
