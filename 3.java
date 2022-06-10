import java.util.*;


class three {
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            int b = s.nextInt();
            if (a==b) {
                System.out.println("This numbers are equal");
            } else if (a>b){
                System.out.println("Number "+a+" is greater than "+b);
            }else{
                System.out.println("Number "+a+" is lower than "+b);
            }
        }
    }
}
