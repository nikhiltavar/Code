package Recursion;

public class xPowerN {
    public static int xPn(int x, int n){
        if (x==0) return 0;
        if (n==0) return 1;
        
        int m1 = xPn(x, n-1);
        int ans = x*m1;
        return ans;
    }
    public static void main(String[] args) {
      int x =   xPn(2,8);
      System.out.println(x);
    }
}