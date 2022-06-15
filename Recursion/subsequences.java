package Recursion;

public class subsequences {
    public static void subsequences(String s, int idx, String n ) {
        if (idx == s.length()){
            System.out.println(n);
            return;
        }
        char currChar = s.charAt(idx);
        
        subsequences(s, idx+1, n+currChar);

        subsequences(s, idx+1, n);
    }
    public static void main(String[] args) {
        subsequences("abc", 0, "");
    }
}
