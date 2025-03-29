namespace Array.Easy
{
    public static class _1920
    {
        /// <summary>
        /// Build Array from Permutation
        /// </summary>
        /// More details: <see href="https://leetcode.com/problems/build-array-from-permutation/description/"/>
        /// <example>
        /// <para>Example usage:</para>
        /// <code>
        /// int[] nums = { 0, 2, 1, 5, 3, 4 };
        /// int[] result = BuildArray(nums);
        /// Output: [0, 1, 2, 4, 5, 3]
        /// </code>
        /// </example>
        public static int[] BuildArray(int[] nums)
        {
            int[] result = new int[nums.Length];

            for (int i = 0; i < nums.Length; i++)
            {
                result[i] = nums[nums[i]];
            }

            return result;
        }
    }
}
