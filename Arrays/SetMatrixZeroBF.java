import java.util.Scanner;

public class SetMatrixZeroBF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int [][] matrix = new int[m][n];

        System.out.print("Enter elements of matrix: \n");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("[" + i + "] [" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.print("\n");
        }

        System.out.print("Matrix : \n");
        for(int i = 0; i < m; i++){
            System.out.print("[");
            for(int j = 0; j < n; j++){
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("]\n");
        }

        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    //Mark row = -1
                    for (int row = 0; row < m; row++) {
                        if (matrix[row][j] != 0) {
                            matrix[row][j] = -1;
                        }
                    }
                    //Mark col = -1
                    for (int col = 0; col < n; col++) {
                        if (matrix[i][col] != 0) {
                            matrix[i][col] = -1;
                        }
                    }
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.print("\nRearranged Matrix : \n");
        for(int i = 0; i < m; i++){
            System.out.print("[");
            for(int j = 0; j < n; j++){
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("]\n");
        }
    }
}

