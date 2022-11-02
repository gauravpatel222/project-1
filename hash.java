import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        String s = " ";
        HashMap<Character, Integer> map = new HashMap<>();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int l = i - map.get(s.charAt(i));
                if (c < l) {
                    c = l;
                }
                map.put(s.charAt(i), i);
            }
            map.put(s.charAt(i), i);
        }
        System.out.println(c);
    }

}
