public class SetMatrixZeroesOptimal {
    public static void main(String[] args){
        int[][] matrix = {{ 1, 1, 1, 1},
                          { 1, 0, 1, 1},
                          { 1, 1, 0, 1},
                          { 0, 1, 1, 1}};

        int m = matrix.length;      // rows
        int n = matrix[0].length;   // col
        int col0 = 1;               // 00 for rowMarker

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;

                    if(j != 0){
                        matrix[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                }
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }

        if(col0 == 0){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
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
