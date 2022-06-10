import java.util.*;
class arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The size of array : ");
        int size = s.nextInt();
        int numbers[] = new int [5];
        System.out.println("Enter The numbers in array : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = s.nextInt();
        }

        System.out.println("Enter The Number to search: ");
        int x= s.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println(x+" is at the "+(i+1)+" position");
            }
        }
    }
}