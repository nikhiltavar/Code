package Recursion;

public class reverseString {
    public static void revstr(String s, int idx){
        if (idx == -1){
            return;
        }
        System.out.print(s.charAt(idx));
        revstr(s, idx-1);

   }
    public static void main(String[] args) {
        String s = "abcd";
        int idx = s.length()-1;
        revstr(s, idx);
    }
}
