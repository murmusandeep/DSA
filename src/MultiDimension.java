import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
            };

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        int[][] numbs = new  int[rows][];

        System.out.println("Enter the elements of the array:");

        for (int row = 0; row < numbs.length; row++) {

            System.out.print("Enter the number of columns for row " + row + ": ");
            int columns = sc.nextInt();

            numbs[row] = new int[columns];

            for (int col = 0; col < numbs[row].length; col++) {
                System.out.print("Enter element at position [" + row + "][" + col + "]: ");
                numbs[row][col] = sc.nextInt();
            }
        }

        for (int[] numb : numbs) {
            for (int i : numb) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

//        for(int row = 0; row < numbs.length; row++){
//            for (int col = 0; col < numbs[row].length; col++) {
//                System.out.print(numbs[row][col] + "");
//            }
//            System.out.println();
//        }
    }
}
