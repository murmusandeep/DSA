import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int[] nums = new int[] { 1 , 2, 3, 4 };

        int[] result = Solution.runningSum(nums);

        System.out.println(Arrays.toString(result));
    }
}