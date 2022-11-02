import java.util.HashMap;

public class max_subarraydivbyk {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 0, -2, -3, 1 };
        int k = 5;

        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 0;
        int sum = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int t;
            t = sum % k;
            while (t <= sum) {

                if (map.containsKey(sum - t)) {
                    c += map.get(sum - t);
                }
                t = t + k;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(c);
    }
}