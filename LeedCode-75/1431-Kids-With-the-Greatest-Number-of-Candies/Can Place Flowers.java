class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length =flowerbed.length;

        for (int i = 0 ; i < length && n > 0 ; i++){

            if (flowerbed[i] == 0){
                boolean prevVar = (i == 0) || (flowerbed[i-1] ==0);
                boolean nextVar =  (i ==length-1) || (flowerbed[i+1] ==0);

                if (prevVar && nextVar) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n == 0 ;
    }
}
