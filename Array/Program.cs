using Array.Easy;

namespace Array.Program
{
    public class Program
    {
        public static void Main(string[] args)
        {
            int[] nums = [1, 2, 3, 4];
            int[] result = _1480.RunningSum(nums);
            Console.WriteLine(string.Join(",", result));
        }
    }
}
