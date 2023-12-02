package Algorithms.Sub_Array_Problems.Kadanes_Algorithm_Maximum_Subarray_Sum;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = kadanesAlgorithm(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }
    public static int kadanesAlgorithm(int[] arr) {
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array is empty");
        }

        int maxCurrent = arr[0];
        int maxGlobal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            /* Update maxCurrent to be the maximum of the current
                element and the sum of maxCurrent and the current element */
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);

            // Update maxGlobal to be the maximum of maxGlobal and maxCurrent
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }

        return maxGlobal;
    }
}
