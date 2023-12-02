package Questions.Easy;

public class MaximumSubArray {
    public static void main(String[] args) {
    int[] numbs = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(numbs));
    }

    public static int maxSubArray(int[] numbs) {

        int maxCurrent = numbs[0];
        int maxGlobal = numbs[0];

        for(int i = 1; i < numbs.length; i++){

            maxCurrent = Math.max(numbs[i] , maxCurrent + numbs[i]);
            maxGlobal = Math.max(maxCurrent, maxGlobal);
        }

        return maxGlobal;
    }
}
