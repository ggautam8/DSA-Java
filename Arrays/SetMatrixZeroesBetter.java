public class SetMatrixZeroesBetter {
    public static void main(String[] args){
        int [][] matrix = {{ 1, 2, 2, 3},
                           { 3, 7, 4, 2},
                           { 1, 3, 0, 5},
                           { 2, 0, 0, 5}};

        int m = matrix.length;  // rows
        int n = matrix[0].length;   // col

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(row[i] || col[j]){
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
