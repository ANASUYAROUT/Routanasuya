import java.util.*;
public class BuilderString {
 public static void main(String[] args) {
 StringBuilder sb = new StringBuilder("sony");
 System.out.println(sb);   

// char at index 0
System.out.println(sb.charAt(0));

// set char at index 0
sb.setCharAt(3,'a');
System.out.println(sb);

// insert index 
sb.insert(1,'o');
System.out.println(sb);

// delete the extra 'o'
sb.delete(1,'3');
System.out.println(sb);
 }   
}
