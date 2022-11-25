public class Solution
{
    public bool CheckOnesSegment(string s)
    {
        bool zeroAlreadyFound = false;
        bool gap = false;
        bool findOne = false;
        for (int index = 0; index < s.Length; index++)
        {
            if (s[index] is '1')
            {
                findOne = true;
            }
            else if (s[index] is '0'&& findOne )
            {
                gap = true;
            }
            if (s[index] is '1'&& gap){
                return false;
            }
        }
        return true;
    }
}
