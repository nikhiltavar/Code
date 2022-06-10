package Recursion;

public class factorial {
    public static int factorial(int n){
        if(n==0 || n==1) {

            return 1;
        }
        
        int x=factorial(n-1);
        int a = n*x;
        return a;

    }
    public static void main(String[] args) {
        int a = factorial(5);
        System.out.println(a);

    }
}
