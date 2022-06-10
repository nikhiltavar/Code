import java.util.*;
class strings {
    public static void main(String[] args) {
        String a = "Nikhil1" + "tavar";
        System.out.println(a);
        Scanner s = new Scanner(System.in);
        String b = s.nextLine();
        System.out.println(b);

        // Concatenation
        String c = a + b + "god";
        System.out.println(c);

        // Length Function
        System.out.println(c.length());

        // charAt
        for (int i = 0; i < c.length(); i++) {
            System.out.println(c.charAt(i));
        }


        //Comparing Strings
        if (a.equals(b)){
            System.out.println("yes");
        }else{
            System.out.println("no");

        }


    }
}