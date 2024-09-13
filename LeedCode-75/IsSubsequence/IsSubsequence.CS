public class Solution {
    public bool IsSubsequence(string s, string t) {

        if(s.Length == 0){
            return true;
        }
        int sIndex = 0 , tIndex = 0;
        while (tIndex < t.Length){

            if (s[sIndex] == t[tIndex]){
                sIndex ++;
                if (sIndex == s.Length){
                    return true;
                }
            }
            tIndex ++;
        }
        return false;
    }
}
