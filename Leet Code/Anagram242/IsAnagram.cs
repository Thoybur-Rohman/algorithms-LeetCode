public class Solution {
    public bool IsAnagram(string a, string b) {
         // Check if length of both strings is same or not
        if (a.Length != b.Length) {
            return false;
        }
        // Loop over all character of String a and put in Dictionary.
         Dictionary<char, int> map = new();
          for (int i = 0; i < a.Length; i++) {
            // Check if Dictionary already contain current
            if (map.ContainsKey(a[i])) {
 
                // If contains increase count by 1
                 map[a[i]] = map[a[i]] + 1;
            }
            else {
                // else put that character in map and set
                map.Add(a[i], 1);
            }
        }
        // Now loop over String b
        for (int i = 0; i < b.Length; i++) {
 
            // Check if current character already exist
            if (map.ContainsKey(b[i])) {
                map[b[i]] = map[b[i]] - 1;
            }
            else {
                return false;
            }
        }
        // Extract all keys of Dictionary/map
        var keys = map.Keys;

         foreach(char key in keys)
        {
            if (map[key] != 0) {
                return false;
            }
        }
        return true;
 
    }
}
