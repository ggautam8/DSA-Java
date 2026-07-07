public class RotateMatrixBy90BF {
    public static void main(String[] args){
        int[][] matrix = {{ 1, 2, 3},
                          { 4, 5, 6},
                          { 7, 8, 9}};

        int n = matrix.length;
        int [][] matrix2 = new int[n][n];

        for(int j = 0; j < n; j++){
            System.out.print("[");
            for(int i = n - 1; i >= 0; i--){
                matrix2[j][n - 1 - i] = matrix[i][j];
            }
            System.out.print("]\n");
        }

        for(int i = 0; i < n; i++){
            System.out.print("[");
            for(int j = 0; j < n; j++){
                System.out.print(" " + matrix2[i][j] + " ");
            }
            System.out.print("]\n");
        }
    }
}
