package Recursion;
import java.util.*;
class recursion1 {

    public static void num(int n,int i){
        if (i==n+1){
            return;
        }
        System.out.println(i);
        num(n,i+1);

    }
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       num(n,1);
   }
}