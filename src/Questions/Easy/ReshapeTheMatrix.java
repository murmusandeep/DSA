package Questions.Easy;

import java.util.ArrayList;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
    int[][] mat = {{1,2},{3,4}};
    mat = matrixReshape(mat, 2, 2);

        for (int[] numb : mat) {
            for (int i : numb) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr1 = new int[r][c];
        // int i = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int[] ints : mat) {
            for (int anInt : ints) {
                arr.add(anInt);
            }
        }
        if( (r * c) == arr.size()){
//            for(int row = 0; row < r; row++){
//                for(int col = 0; col < c; col++){
//                    arr1[row][col] = arr.get(i);
//                    i++;
//                }
//            }
            for (int row = 0; row < r; row++) {
                for (int col = 0; col < c; col++) {
                    arr1[row][col] = arr.get(row * c + col);
                }
            }
            return arr1;
        }

        return mat;
    }
}
