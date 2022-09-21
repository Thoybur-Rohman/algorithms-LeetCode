 public int trap(int[] height) {
 
		 // Step 1 : we initilize our max unit of water variable 
        int unitsOfWater  = 0;

		// Step 2 : we then using  a for loop itterate through the entire height ( input ) array - This is explained at the bottom why 
        for (int i = 0; i < height.length; i++) {

			// step 3 : we initilize our max left height variable 
            int leftMaxHeight = 0;
			
			// step 4 : we make sure that it does not exceed our i as we want to store the left pointer variable 
            for (int j = 0; j <= i; j++) {
				// step 5 : using math.max we always want to update our larest left pointer varibale , why ? because this means more water that can be stored ( alos explained more in depth below ) 
                leftMaxHeight = Math.max(leftMaxHeight, height[j]);
            }

			// step 6 :  we initilize our max right height variable
            int rightMaxHeight = 0;
			
			// This is differnt to the left pointer as we want to find the tallest height ( explained below ) 
            for (int k = i; k < height.length; k++) {
			
			// Using math.max we again update our varible 
                rightMax = Math.max(rightMaxHeight, height[k]);
            }
			
				// step 7 : we then using math.min find the lowest number as this willl prevent the water over splilling and then - the height to get ourlevel of water
            unitsOfWater += Math.min(leftMaxHeight, rightMaxHeight) - height[i];
			
	// we then i ++ and move across the array 
        }

        return units;
    }```
	

Using an example of a small array height = [0,1,0,2] 
	
step 1 : our i starts at 0 , our leftMaxHeight stays 0 as 0 in math.max stays 0 ( in the first itteration ) our max height is 2 for the second for loop so rightMaxHeight  = 2 , and then our units = Math.min ( 0 , 2 ) - 0 so units is 0 
	
step 2 : our i moves to 1  , our leftMaxHeight becomes 1  as 0 < 1 in math.max = 1 ,  our max height is still 2 for the second for loop so rightMaxHeight  = 2 , and then our units = Math.min ( 1 , 2 ) - 1 so units is 0 

step 3 : our i moves to 2  , our leftMaxHeight is still 1  as 0 in math.max = 1 ,  our max height is still 2 for the second for loop so rightMaxHeight  = 2 , and then our units = Math.min ( 1 , 2 ) - 0 so units is 1  UPDATED TO 1  

step 4 : our i moves to 3  , our leftMaxHeight is UPDATED TO 2  as 1 < 2 in math.max = 2 ,  our max height is still 2 for the second for loop so rightMaxHeight  = 2 , and then our units = Math.min ( 2 , 2 ) - 2  = 0 

unitsOfWater  = 1
