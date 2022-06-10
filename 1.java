import java.util.*;


class one {
    public static void main(String[] args){
    
        try (Scanner s = new Scanner(System.in)) {
            int age = s.nextInt();

            if (age >= 18){
                System.out.println("You are an adult");

            }
            else {
                System.out.println("You are not an adult");
            }
        }

    }
}
