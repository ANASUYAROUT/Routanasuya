import java.util.*;
public class BasicsStrings {
    public static void main(String[] args) {
        // String name = "sony";
        // String fullName = "anasuya rout";
        // // store sentence , valid spaces
        // String sentence = "My name is anasuya rout.";

        // scanner = class , sc = object , new = keyword , non premitive data type
        // Scanner sc = new Scanner(System.in);
        // next() = total single line , nextln()= with space
        // String name = sc.next();
        // output
        // System.out.println("Your name is :" + name);

        // concatenation = add two different string
        // String firstName = "sony";
        // String lastName ="anasuya";
        // String fullName = firstName +"@" + lastName;
        // pass ," " = using space
        // using length = call length function()
        // System.out.println(fullName.length());

        // chatAt = method(already charAt in java reuse) , repetation using for loop
        // for(int i=0; i<fullName.length(); i++) {
            // index = i pass under charAt(i)function
        // System.out.println(fullName.charAt(i));
        // }

       
        // compare
        // String name1 = "sony";
        // String name2 = "sony";
        // using compareTo function : condition 
        // s1>s2 = +ve value
        // s1<s2 = -ve value
        //  s1 = s2 = 0

//         if(name1.compareTo(name2) == 0) {
// System.out.println("Strings are equal");
//         } else {
//             System.out.println("Strings are not equal");
//         }



// substrings function (beg index , end index)
String sentence = "anasuyasony";
String name = sentence.substring(0,7);
// store name
System.out.println(name);
    }
}

// String are immutable , once create string in a memory it will be not change , edit , not modify , change = new string