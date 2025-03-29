namespace Array.Easy
{
    /// <summary>
    /// Richest Customer Wealth
    /// </summary>
    /// More details: <see href="https://leetcode.com/problems/richest-customer-wealth/description/"/>
    /// <example>
    /// <para>Example usage:</para>
    /// <code>
    /// int[][] nums = [[1,2,3],[3,2,1]]
    /// int result = MaximumWealth(accounts)
    /// Output: 6
    /// </code>
    /// </example>
    public static class _1672
    {
        public static int MaximumWealth(int[][] accounts)
        {
            int result = int.MinValue;

            for (int i = 0; i < accounts.Length; i++)
            {
                int sum = 0;
                for (int j = 0; j < accounts[i].Length; j++)
                {
                    sum += accounts[i][j];
                }

                result = Math.Max(result, sum);
            }

            return result;
        }
    }
}
