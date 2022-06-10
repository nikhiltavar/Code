package Exercises;
import java.util.*;
class exercise2{


    public static void sumOfEven(int n){
        int x=0;
        for (int i=1;i<=n;i++){
            if (i%2==1){
                x=x+i;
            }
        }

        
        System.out.println("The Sum of Even numbers is: "+x);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        

        sumOfEven(n);

    }
    }