package Questions.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbersMatrix {
    public static void main(String[] args) {
    int[][] numbs = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(numbs));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int[][] minValue = new int[matrix.length][2];
        for(int row = 0; row < matrix.length; row++) {
            minValue[row][0] = Integer.MAX_VALUE;
            for(int col = 0; col < matrix[0].length; col++){
                if(matrix[row][col] < minValue[row][0]){
                    minValue[row][0] = matrix[row][col];
                    minValue[row][1] = col;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int minVal = minValue[i][0];
            int colIndex = minValue[i][1];

            boolean isLucky = true;
            for (int[] ints : matrix) {
                if (ints[colIndex] > minVal) {
                    isLucky = false;
                    break;
                }
            }

            if (isLucky) {
                result.add(minVal);
            }
        }

        for (int[] ints : minValue) {
            System.out.println(Arrays.toString(ints));
        }
        return result;
    }
}
