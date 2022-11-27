public class Solution {
    public bool IsPalindrome(string a) {
        string s = a.ToLower();
        int start = 0 ;
        int end = s.Length - 1 ; 
        
        //r aceca r

        do {

            if (!Char.IsLetterOrDigit(s[start])){
                start ++ ;
                continue;
            }
             if (!Char.IsLetterOrDigit(s[end])){
                end -- ;
                continue;
            }
            if (s[start] != s[end]){
                return false ; 
            }
            start++;
            end --;

        } while(start <= end);
       return true ; 
}
}
