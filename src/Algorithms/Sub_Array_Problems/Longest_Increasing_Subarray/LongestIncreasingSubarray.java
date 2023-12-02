package Algorithms.Sub_Array_Problems.Longest_Increasing_Subarray;

public class LongestIncreasingSubarray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 5, 7, 8, 9, 1, 2};
        int result = longestIncreasingSubarray(arr);
        System.out.println("Length of the longest increasing subarray: " + result);
    }
    public static int longestIncreasingSubarray(int[] arr) {
        int n = arr.length;
        int maxLength = 1;  // Initialize the length of the longest increasing subarray
        int currentLength = 1;  // Initialize the length of the current increasing subarray

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                // If the current element is not greater than the previous one,
                // update the current length and reset it to 1
                currentLength = 1;
            }

            // Update the maximum length if the current length is greater
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
