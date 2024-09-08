public class Solution {

    public static int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size * 2];

        for(int i = 0; i < size; i++) {
            ans[i] = ans[size + i] = nums[i];
        }

        return ans;
    }
}
