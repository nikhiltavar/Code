import java.util.*;
class array2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();

        int matrix[][] =  new int[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                matrix[i][j] = s.nextInt();
            }

        }

        // for (int i = 0; i < rows; i++){
        //     for (int j = 0; j < cols; j++){
        //         System.out.print(matrix[i][j]+" ");

        //     }
        //     System.out.println();
        // }


        System.out.println("Enter the number to search");
        int x = s.nextInt();
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if (matrix[i][j]==x){
                    System.out.println("Found "+x+" at ("+i+","+j+") Position");
                }
            }
        }
        System.out.println("Not Found the entered Number");

    }   
}