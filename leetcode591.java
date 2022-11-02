import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.*;

public class leetcode591 {
    public static void main(String[] args) {
        String s = "tree";

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put((s.charAt(i)), map.getOrDefault(s.charAt(i), 0) + 1);

        }
        String ans = "";
        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(map.entrySet());  
//sorting the list elements  
Collections.sort(list, new Comparator<Entry<String, Integer>>(); 


        
    }
}
