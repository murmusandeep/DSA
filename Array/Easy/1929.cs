namespace Array.Easy
{
    /// <summary>
    /// Concatenation of Array
    /// </summary>
    /// More details: <see href="https://leetcode.com/problems/concatenation-of-array/description/"/>
    /// <example>
    /// <para>Example usage:</para>
    /// <code>
    /// int[] nums = [1,2,1];
    /// int[] result = GetConcatenation(nums);
    /// Output: [1,2,1,1,2,1]
    /// </code>
    /// </example>
    public static class _1929
    {
        public static int[] GetConcatenation(int[] nums)
        {
            int size = nums.Length;
            int[] result = new int[2 * size];

            for (int i = 0; i < nums.Length; i++)
            {
                result[i] = result[size + i] = nums[i];
            }
            return result;
        }
    }
}
