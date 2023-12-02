package Algorithms.Sub_Array_Problems.Maximum_Product_Subarray;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4, -1};
        int result = maxProduct(nums);
        System.out.println("Maximum Product Subarray: " + result);
    }
    public static int maxProduct(int[] nums) {
        // Check if the array is empty
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Input array is empty");
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                // Swap maxProduct and minProduct when encountering a negative number
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            // Update the overall result
            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
