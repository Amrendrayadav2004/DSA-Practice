import java.util.*;

public class Dice {
    public static void main(String[] args) {
        System.out.println(dice("", 4));
    }

    static ArrayList<String> dice(String p, int target) {

        // Base case
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> result = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            // collect results from recursion
            result.addAll(dice(p + i, target - i));
        }

        return result;
    }
}