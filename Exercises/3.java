package Exercises;
import java.util.*;
class exercise3{


    public static void greaterNumber(int a,int b){
        if (a > b){
            System.out.println("The Greater numbers is: "+a); 
        } else if (a < b){
            System.out.println("The Greater numbers is: "+b);
        }else{
            System.out.println("The Numbers are Equal");
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        

        greaterNumber(a,b);

    }
    }