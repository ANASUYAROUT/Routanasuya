import java.util.*;
public class VotingEligibility {
   public static boolean ElegibletoVote(int age) {
    return age >= 18;
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter age");
    int age = sc.nextInt();
//  call
if(ElegibletoVote(age)) {
    System.out.println("you are elegible to vote.");
} else {
    System.out.println("you are not eligible to vote.");
}

 }
}
