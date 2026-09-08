public class SetMatrixZeroes {
    public static void main(String[] args){
        int[][] matrix = {{ 1, 1, 1, 1},
                          { 1, 0, 1, 1},
                          { 1, 1, 0, 1},
                          { 0, 1, 1, 1}};

        Solution73 sol = new Solution73();
        sol.setZeroes(matrix);

        System.out.print("\nRearranged Matrix : \n");
        for(int i = 0; i < matrix.length; i++){
            System.out.print("[");
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("]\n");
        }
    }
}

class Solution73{
    public void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int col0 = 1;

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

    }
}
