package Questions.Easy;

//1217. Minimum Cost to Move Chips to The Same Position
public class MinimumCostToMoveChipsToTheSamePosition {
    public static void main(String[] args) {
        int[] position = { 2,2,2,3,3 };

        System.out.println(minCostToMoveChips(position));
    }

    public static int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;

        for(int p: position){
            if(p % 2 == 0) even++;
            else odd++;
        }

        return Math.min(even, odd);
    }
}
