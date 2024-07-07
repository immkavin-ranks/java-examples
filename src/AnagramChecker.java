import java.util.HashMap;
import java.util.Set;

public class AnagramChecker {
    public static void main(String[] args) {
        if (args.length < 1) return;
        System.out.println(isAnagram(args[0], args[1]));
    }
    private static boolean isAnagram(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (map.containsKey(c)) map.put(c, map.get(c) + 1);
            else if (c != ' ') map.put(c, 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (map.containsKey(c)) map.put(c, map.get(c) - 1);
            else if (c != ' ') return false;
        }
        Set<Character> keys = map.keySet();
        for (Character key : keys) if (map.get(key) != 0) return false;
        return true;
    }
}
