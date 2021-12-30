public class lengthOfLongestSubstring {
    public static void main(String[] args) {

        String s = "pwwkew";
        lengthOfLongestSubstring(s);

    }

    public static int lengthOfLongestSubstring(String s) {

        int length = 0;
        int max = 0;
        int A = 0;
        int B ;
        int n = s.length();
         if (n < 2 )
         {
            return n;
         }
// pwwkew
// A
// 0123456
//  B
// 1
        boolean[] hasAppeared = new boolean[128];

         for ( B =  1 ; B < n ;B++) {
             if (s.charAt(A) == s.charAt(B)) {
                 length = Math.max(length, B - A);
                 A++;
             } else {
                 length = Math.max(length, B - A);
             }
             if (max < length) {
                 max = length;
             }
         }
         System.out.println(max);
        return max;
    }











/*    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), length = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j)))
            {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            length = Math.max(length, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return length;
    }*/
}



//    //My solution
//    public int lengthOfLongestSubstring11(String s) {
//
//        if (s.length() == 0) return 0;
//
//        int maxCount = 0;
//        int currentCount = 0;
//        HashSet<Character> set = new HashSet();
//        int left = 0;
//
//        for (int right = 0; right < s.length(); right++) {
//            Character currChar = s.charAt(right);
//            while (set.contains(currChar)) {
//                set.remove(s.charAt(left));
//                left++;
//                currentCount--;
//            }
//            set.add(currChar);
//            currentCount++;
//            maxCount = Math.max(currentCount, maxCount);
//        }
//
//        return maxCount;
//    }
//
//
//    // Solution 1 - HashMaps
//    public static int lengthOfLongestSubstring12(String s) {
//        int i = 0;
//        int j = 0;
//        int max = 0;
//
//        HashSet<Character> hashSet = new HashSet();
//
//        while (j < s.length()) {
//            if (!hashSet.contains(s.charAt(j))) {
//
//                hashSet.add(s.charAt(j));
//                j++;
//                max = Math.max(hashSet.size(), max);
//            } else {
//                hashSet.remove(s.charAt(i));
//                i++;
//            }
//
//        }
//        System.out.print(max);
//        return max;
//    }
//
//
//    //Solution 2
//    public int lengthOfLongestSubstring2(String s) {
//        int n = s.length(), ans = 0;
//        Map<Character, Integer> map = new HashMap<>(); // current index of character
//        // try to extend the range [i, j]
//        for (int j = 0, i = 0; j < n; j++) {
//            if (map.containsKey(s.charAt(j))) {
//                i = Math.max(map.get(s.charAt(j)), i);
//            }
//            ans = Math.max(ans, j - i + 1);
//            map.put(s.charAt(j), j + 1);
//        }
//        return ans;
//    }
//
//    //Solution 3
//    public static int lengthOfLongestSubstring(String s) {
//        Set<Character> set = new HashSet<>();
//        int i = 0, j = 0, max = 0;
//        while (j < s.length()) {
//            if (!set.add(s.charAt(j))) {
//                set.remove(s.charAt(i++));
//            } else j++;
//            max = Math.max(max, set.size());
//        }
//        return max;
//    }

