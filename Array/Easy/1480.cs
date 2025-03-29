namespace Array.Easy
{
    public static class _1480
    {
        /// <summary>
        /// Running Sum of 1d Array
        /// </summary>
        /// More details: <see href="https://leetcode.com/problems/running-sum-of-1d-array/description/"/>
        /// <example>
        /// <para>Example usage:</para>
        /// <code>
        /// int[] nums = [1,2,3,4]
        /// int[] result = RunningSum(nums);
        /// Output: [1,3,6,10]
        /// </code>
        /// </example>
        public static int[] RunningSum(int[] nums)
        {
            int sum = 0;
            int[] result = new int[nums.Length];
            for (int i = 0; i < nums.Length; i++)
            {
                sum += nums[i];
                result[i] = sum;
            }
            return result;
        }
    }
}
