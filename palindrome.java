import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(s.nextLine());
        StringBuilder rvsb = sb.reverse();
        System.out.println(rvsb);
        if (sb.equals(rvsb)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        
    }
}