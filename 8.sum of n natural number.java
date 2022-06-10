import java.util.*;


class sumofn {
    public static void main(String[] args){
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++){
                sum = sum +i;
            }
            System.out.println(sum);
            
        }
    }
}
