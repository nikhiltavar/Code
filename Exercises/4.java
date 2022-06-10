package Exercises;
import java.util.*;
class exercise4{


    public static double circumference(float a){
        double x = 2*a*(3.14159265);
        return x;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle below");
        float a = s.nextInt();
        

        double x = circumference(a);
        System.out.println(x);

    }
    }