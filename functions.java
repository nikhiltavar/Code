import java.util.*;


public class functions {

    public static int squareNumber(int a){
        int square = a*a;
        return square;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            int square = squareNumber(a);
            System.out.println(square);
        }
    }
}
