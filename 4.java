import java.util.Scanner;

class four {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int button = s.nextInt();
            
            switch (button) {
                case 0: System.out.println("Nikhil");
                break;
                case 1: System.out.println("Dilip");
                break;
                case 2: System.out.println("Tavar");
                break;
                default: System.out.println("Invalid button");
            }
        }
    }
    
}
