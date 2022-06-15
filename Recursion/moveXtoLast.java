package Recursion;

public class moveXtoLast {
    public static void moveXtoLast(String s,int idx,int count, String n){
        if (idx == s.length()){
            System.out.print(n);
            for (int i = 0; i < count; i++){
                System.out.print('x');
            }
            return;
        }
        char currChar = s.charAt(idx);
        if (currChar == 'x'){
          count++;
          moveXtoLast(s,idx+1,count,n);
        }else{
            n += currChar;
            moveXtoLast(s,idx+1,count,n);
        }
    }
        
    
    
    public static void main(String[] args) {
        String s = "axbxxcxdx";
        String n = "";
        moveXtoLast(s,0,0,n);
    }
}
