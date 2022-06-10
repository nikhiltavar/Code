package Recursion;

public class sumOfNum {
    public static void sumOfNum(int i,int n,int sum){
        if (i ==n){
            sum+=i;
            System.out.println("sum is "+sum);
            return;
        }

        sum += i;
        sumOfNum(i+1,n,sum);

    }
    public static void main(String[] args) {
        sumOfNum(1,10,0);
    }
}
