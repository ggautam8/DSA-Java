import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

public class SpiralMatrix {
    public static void main(String[] args){
        int[][] matrix = {{ 1, 2, 3, 4},
                          { 5, 6, 7, 8},
                          { 9,10,11,12},
                          {13,14,15,16},
                          {17,18,19,20}};

        Solution54 sol = new Solution54();
        List res = sol.spiralOrder(matrix);

        System.out.print(res);
    }
}

class Solution54{
    public List<Integer> spiralOrder(int[][] matrix){

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

        return  li;
    }
}
