import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {

        String s = "pwwkew";
        lengthOfLongestSubstring(s);

    }
// My code
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), length = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        int i = 0;
        for (int j = 0; j < n; j++) {
            if ( map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            length = Math.max(length, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return length;

    }
    // Philipps code
    int lengthOfLongestSubstring(String s) {
        // 0 / 1
        if (s.length() < 2) {
            return s.length();
        }

        int max = 1;
        for (int length = 2; length <= s.length(); length++) {
            for (int index = 0; index + length <= s.length(); index++) {
                boolean[] chars = new boolean[128];
                boolean unique = true;

                // pwwb
                for (char c : s.substring(index, index + length - 1).toCharArray()) {
                    if (chars[c]) { // p=false; w=false; w=true
                        unique = false; // u=false
                        break; // break
                    }
                    chars[c] = true; // p=true; w=true
                }
                if (unique)
                    max = length;
            }
        }
        return max;
    }
}




