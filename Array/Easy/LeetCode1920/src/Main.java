import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{ 0, 2, 1, 5, 3, 4 };

        var result = Solution.BuildArray(nums);
        System.out.println(Arrays.toString(result));
    }
}