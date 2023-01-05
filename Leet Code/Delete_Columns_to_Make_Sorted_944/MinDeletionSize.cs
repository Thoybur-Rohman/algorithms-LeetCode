public class Solution {
    public int MinDeletionSize(string[] strs) {


        int firstWordLength = strs[0].Length;
        int lengthOfArray = strs.Length-1;
        int columnsDeleted = 0;

        for(int i = 0; i < firstWordLength; i++)
        {
            for(int j = 0; j < lengthOfArray; j++)
            {
                if(strs[j][i] > strs[j+1][i])
                {
                    columnsDeleted++;
                    
                    break;
                }
            }
        }
        return columnsDeleted;
    }
}
