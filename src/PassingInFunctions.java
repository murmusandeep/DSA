import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] numbs = { 1, 2, 3, 4, 5 };

        System.out.println(Arrays.toString(numbs));
        Change(numbs);
        System.out.println(Arrays.toString(numbs));
    }

    public static void Change(int[] arr){
        arr[1] = 99;
    }
}
