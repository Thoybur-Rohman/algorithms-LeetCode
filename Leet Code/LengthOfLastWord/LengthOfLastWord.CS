public class Solution 
{
    public int LengthOfLastWord(string a) 
    {
        int length = 0;
        string newString = a.Trim();
        for (int i = 0; i < newString.Length; i++) {
            if (newString[i] == ' ') {
                length = 0;
            }
            else {
                length++;
            }
        }
        return length;
    }
 }
