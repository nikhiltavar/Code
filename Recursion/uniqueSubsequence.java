package Recursion;
import java.util.HashSet;
public class uniqueSubsequence {
    public static void subsequences(String s, int idx, String n, HashSet<String> set ) {
        if (idx == s.length()){
            if(set.contains(n)) {
                return;
                }
                set.add(n);
                System.out.println(n);
                return;
        }
        char currChar = s.charAt(idx);
        
        subsequences(s, idx+1, n+currChar, set);

        subsequences(s, idx+1, n,set);
    }
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();
        subsequences("aaa", 0, "",set);
    }
}
