import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a values");

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Method 1
        System.out.print(Arrays.toString(arr) + " ");

        System.out.println();

        // Method 2
        for(int a : arr){
            System.out.print(a + " ");
        }

        System.out.println();

        // Method 3
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}