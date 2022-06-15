package Recursion;

public class removeDuplicates {
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String s,int idx,String n) {
        if (idx == s.length()){
            System.out.println(n);
            return;
        }
        char currChar = s.charAt(idx);
        if (map[currChar-'a']== true){
            removeDuplicates(s,idx+1,n);
        }else {
            n += currChar;
            map[currChar-'a'] = true;
            removeDuplicates(s,idx+1,n);
        }

    }
    public static void main(String[] args) {
        String s = "aabbcdaxcdd";
        removeDuplicates(s,0,"");
    }
}
