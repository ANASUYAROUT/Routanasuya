// // // // public class Loop {
// // // //     public static void main(String args[]) {
// // // //         for(int counter = 0; counter < 100; counter = counter + 1) {
// // // //             System.out.println("I LOVE KHADUSS");
// // // //         }
// // // //     }
// // // // }
// // // public class Loop {
// // //     public static void main(String args[]) {
// // //         for(int i = 0; i<60; i++) {
// // //             System.out.println(i);
// // //         }
// // //     }
// // // }
// // public class Loop {
// //     public static void main(String args[]) {
// //         int i = 0;
// //         while(i < 10 ) {
// // System.out.println(i);
// // i = i + 1;
// //         }
// //     }
// // }
// public class Loop {
// public static void main(String arg[]) {
//    int i = 0;
//     do {
//      System.out.println(i);  
//      i = i + 1;
//       } while(i < 10);

//       }
// }

import java.util.*;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<100; i++) {
            System.out.println(i*n);
        }
    }
}