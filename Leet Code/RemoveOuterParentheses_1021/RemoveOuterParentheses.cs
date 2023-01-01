using System;
public class Solution {
    
    public string RemoveOuterParentheses(string S) {
        
  // Stores the resultant string
  string res = "";
  
  // Stores the count of opened parentheses
  int count = 0;
  
  // Traverse the string
  for(int c = 0; c < S.Length; c++)
  {
     
    // If opening parentheses is encountered and their count exceeds 0
    if (S[c]== '(' && count++ > 0)
        res += S[c];
      // Include the character
      
  
    // If closing parentheses is encountered and their count is less than count of opening parentheses
    if (S[c]== ')'  && count-- > 1)
  
      // Include the character
      res += S[c];
  }
  
  // Return the string
  return res;
    }
}
