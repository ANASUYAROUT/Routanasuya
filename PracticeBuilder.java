public class PracticeBuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("H");
        // // using appends = add or using string (str = str + H)
        // sb.append("E"); 
        // sb.append("L");
        // sb.append("L");
        // sb.append("o");
        // System.out.println(sb.length());
        StringBuilder sb = new StringBuilder("hello");
// half index (lenght/2) i to length
        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            // 5-1-0 = 4
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            // using set char

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
System.out.println(sb);
    }
}
