package Questions.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
    int[] numbs = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(numbs));
    }

    public static int removeDuplicates(int[] numbs) {
        ArrayList<Integer> arr = new ArrayList<>();
        int j = 0;
        for(int i : numbs){
            if(!arr.contains(i)){
                arr.add(i);
                numbs[j] = i;
                j++;
            }
        }
        System.out.println(Arrays.toString(numbs));
        return arr.size();
    }
}
