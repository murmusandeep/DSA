namespace Array.Easy
{
    /// <summary>
    /// Shuffle the Array
    /// </summary>
    /// More details: <see href="https://leetcode.com/problems/shuffle-the-array/description/"/>
    /// <example>
    /// <para>Example usage:</para>
    /// <code>
    /// int[] nums = [2,5,1,3,4,7], n = 3
    /// int result = Shuffle(nums, n)
    /// Output: [2,3,5,4,1,7] 
    /// </code>
    /// </example>
    public static class _1470
    {
        public static int[] Shuffle(int[] nums, int n)
        {
            int[] result = new int[2 * n];

            for (int i = 0, j = 0; i < n; i++, j += 2)
            {
                result[j] = nums[i];
                result[j + 1] = nums[i + n];
            }

            return result;
        }
    }
}
