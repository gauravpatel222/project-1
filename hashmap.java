import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        int nums[] = { 1, -1, 0 };
        int k = 0;

        HashMap<Integer, Integer> ss = new HashMap<>();
        int sum = 0;
        ss.put(0, 1);
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (ss.containsKey(sum - k)) {
                c += ss.get(sum - k);
            }
            ss.put(sum, ss.getOrDefault(sum, 0) + 1);
        }
        System.out.println(c);

    }
}
