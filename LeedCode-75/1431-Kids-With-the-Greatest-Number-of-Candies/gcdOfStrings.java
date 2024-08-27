class Solution {
    public String gcdOfStrings(String str1, String str2) {
      if (!(str1 +str2).equals(str2+str1)){
        return "";
      }

      int gcdVar = gcd(str1.length() , str2.length());

      return str1.substring(0 ,gcdVar);


    }

    private int gcd(int a , int b){
        while (b !=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
