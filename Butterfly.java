public class Butterfly {
    public static void main(String[] args) {
        int n = 5;

        // upper
 for(int i=1; i<=n; i++) {

        // 1st left
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }

        // space 
        int spaces = 2*(n-i);
        for(int j=1; j<=spaces; j++) {
            System.out.print(" ");
        }

// 2nd part right
for(int j=1; j<=i; j++) {
System.out.print("*");
}
System.out.println();
    }
   
   
    // lower
    //  same program copy and n to i--
 for(int i=n; i>=1; i--) {

        // 1st left
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        
        // space 
        int spaces = 2*(n-i);
        for(int j=1; j<=spaces; j++) {
            System.out.print(" ");
        }

// 2nd part right
for(int j=1; j<=i; j++) {
System.out.print("*");
}
System.out.println();
 }


    }
}
