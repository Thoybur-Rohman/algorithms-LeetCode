class Solution {
    public int romanToInt(String s) {
        int intsum = 0;
        char previous = 0;
        char next = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if (i != 0) {
			 previous = s.charAt(i-1);
		}
            if (i < s.length() - 1) {
			 next = s.charAt(i+1);
		}

            if(s.charAt(i) == 'I')
            {
                if (next == 'V'){
                    intsum += 4;
                    continue;
                }
                else if ( next == 'X'){
                    intsum += 9;
                    continue;
                }else{
                  intsum = intsum + 1;  
                }                
            }
            if(s.charAt(i) == 'V')
            {
                if (previous == 'I'){
                    continue;
                }else {
                    intsum = intsum + 5;
                }                
            }
            if(s.charAt(i) == 'X')
            {
                if(previous == 'I')
                {
                    continue;
                }
                else if (next == 'L'){
                    intsum += 40;
                    continue;
                }if (next == 'C') {
					intsum += 90;
                    continue;
                }
                
                else {
                      intsum = intsum + 10;
                }
            }
            if(s.charAt(i) == 'L')
            {
                if (previous == 'X'){
                    continue;
                }else {
                    intsum  += 50;
                    continue;
                }
   
            }
         
        if(s.charAt(i) == 'C')
            {
             if (previous == 'X'){
                    continue;
                }
                if (next == 'D'){
                    intsum += 400;
                    continue;
                }
                else if ( next == 'M'){
                    intsum += 900;
                    continue;
                }else{
                  intsum = intsum + 100;  
                }                
            }
            if(s.charAt(i) == 'D')
            {
                if (previous == 'C'){
                    continue;
                }
                intsum = intsum + 500;
            }
            if(s.charAt(i) == 'M')
            {
                if (previous == 'C'){
                    continue; 
                }
                intsum = intsum + 1000;
            }
       
        }
        return intsum;
    }
}
