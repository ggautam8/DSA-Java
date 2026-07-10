public class RotateMatrixBy90_Optimal {
    public static void main(String[] args){
        int[][] matrix = {{ 0, 1, 1, 2, 10},
                          { 2, 0, 3, 1, 7},
                          { 4, 5, 0, 5, 3},
                          { 5, 6, 7, 0, 6},
                          { 1, 2, 3, 4, 5}};

        int n = matrix.length;

        // symmetrical swap
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // row elements reverse
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }

        System.out.print("Rotated image: \n");
        for(int i = 0; i < n; i++){
            System.out.print("[");
            for(int j = 0; j < n; j++){
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("]\n");
        }
    }
}
