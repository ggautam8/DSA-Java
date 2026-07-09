import java.util.*;

public class PrintSpiralMatrix {
    public static void main(String[] args){
        int[][] matrix = {{ 1, 2, 3, 4},
                          { 5, 6, 7, 8},
                          { 9,10,11,12},
                          {13,14,15,16},
                          {17,18,19,20}};

        List<Integer> li = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                li.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                li.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    li.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    li.add(matrix[i][left]);
                }
                left++;
            }
        }

        System.out.print("Spiral List : " + li);
    }
}
