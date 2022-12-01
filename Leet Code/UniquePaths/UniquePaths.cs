public class Solution {
    public int UniquePaths(int m, int n) {
       var arr2d = new int[m,n];

        for (int i = 0 ; i < m;i++){
            for (int j = 0 ; j < n ; j++){
                if (i == 0 || j == 0 ){
                    arr2d[i , j] = 1;
                }else {
                     arr2d[i , j] =  arr2d[i-1 , j] +  arr2d[i , j-1];;
                }
            }
        }
        return arr2d[m-1 , n-1];
}
}
