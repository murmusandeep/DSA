using Array.Easy;

namespace Array.Program
{
    public class Program
    {
        public static void Main(string[] args)
        {
            int[] nums = [2, 5, 1, 3, 4, 7];
            int n = 3;
            int[] result = _1470.Shuffle(nums, n);
            Console.WriteLine(string.Join(",", result));
        }
    }
}
