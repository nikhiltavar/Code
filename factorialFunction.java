import java.util.*;


 class factorials {

    public static int factorial(int a){
        int x=1;
        for (int i = a;i>=1;i--){
            x = x*i;
        }
        return x;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            System.out.println(factorial(a));
        }
    }
}
