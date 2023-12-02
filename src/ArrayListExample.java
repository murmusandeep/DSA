import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);

        for(int i = 0 ; i < 2; i++) {
            arr.add(sc.nextInt());
        }

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }

        System.out.println(arr);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list); 
    }
}
