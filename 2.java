import java.util.*;


class two {
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            if (a%2==0) {
                System.out.println("This number is even");
            } else {
                System.out.println("This number is odd");
            }
        }
    }
}
