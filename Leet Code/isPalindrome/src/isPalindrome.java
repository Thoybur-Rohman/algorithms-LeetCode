public class isPalindrome {

    public static void main(String[] args) {
        int n = 121;

        isPalindrome(n);

    }
    public static boolean isPalindrome(int x) {
            String str = String.valueOf(x);
            int start = 0;
            int end = str.length() -1;
            while(start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            System.out.print("True");
            return true;
        }
    }


