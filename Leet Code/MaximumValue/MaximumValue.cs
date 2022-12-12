public class Solution {
    public int MaximumValue(string[] strs) {
        //Step 1 : Initialize variables
        int count = 0;
        var ch = strs;
        int maxTotal = 0 ; 

        //Step 2 - Loop through the word 
        for(var i= 0 ; i < ch.Length ; i ++){
            //Initialize boolean
            bool letterFound = false; #
            // Loop through each letter IN the word 
              for(var  j = 0; j < ch[i].Length; j++){
                // If the current digit is a string 
                   if (ch[i][j] >= 'a' && ch[i][j] <= 'z')
                    {        
                            letterFound = true;    
                            count++;          
                    }
                // If the current digit is a number  
                    if (ch[i][j] >= '0' && ch[i][j] <= '9')
                    {         
                           
                            count++;
                    }
              }
            // checks if a letter was found 
            if (letterFound){
                 maxTotal =  Math.Max(maxTotal, count);
            }else {
                 maxTotal =  Math.Max(maxTotal, Convert.ToInt32(ch[i]));
            }
           
            // resets count. 
            count = 0;
       
    }
    
    return maxTotal;
}
}
