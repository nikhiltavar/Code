package Exercises;
import java.util.*;
class exercise1{


    public static void average(int a, int b,int c){
        int avg = (a+b+c)/3;
        System.out.println("The average of numbers is: "+avg);

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        average(a, b, c);

    }
    }