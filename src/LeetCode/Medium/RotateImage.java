public class RotateImage {
    public static void main(String[] args){
        int[][] matrix = {{ 0, 1, 1, 2, 10},
                          { 2, 0, 3, 1, 7},
                          { 4, 5, 0, 5, 3},
                          { 5, 6, 7, 0, 6},
                          { 69, 2, 3, 4, 5}};

        Solution48 sol = new Solution48();
        sol.rotate(matrix);

        System.out.print("Rotated image: \n");
        for(int i = 0; i < matrix.length; i++){
            System.out.print("[");
            for(int j = 0; j < matrix.length; j++){
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.print("]\n");
        }
    }
}

class Solution48{
    public void rotate(int[][] matrix){
        // symmetrical swap
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // row elements reverse
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
    }
}
