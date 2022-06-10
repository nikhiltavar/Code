import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Nikhil");
        System.out.println(sb);

        //charAt
        System.out.println(sb.charAt(0));
        
        // set char 
        sb.setCharAt(0,'P');
        System.out.println(sb);

        //Insert
        sb.insert(0,'A');
        System.out.println(sb);

        //Delete
        sb.delete(0,2);
        sb.insert(0,'N');
        System.out.println(sb);

        //Append
        sb.append("nh");
        System.out.println(sb);

        //length
        System.out.println(sb.length()); 

        //reverse
        System.out.println(sb.reverse());


    }
}
