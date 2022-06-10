import java.util.*;

class test{
    public static void main(String[] args) {

        String a = "nikhil";
        int b = 98;
        int c = 100;
        System.out.println(a);

        System.out.println(b*c+b);

        try (Scanner s = new Scanner(System.in)) {
            // String nik = s.nextLine();
            int x = s.nextInt();
            int y = s.nextInt();

            int sum = x+y;
            System.out.println(sum);
            // System.out.println("This is the output : " + nik);
        }


    }
}
