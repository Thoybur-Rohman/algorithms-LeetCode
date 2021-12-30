import java.util.Stack;

public class ListNode {

    public static void main(String[] args) {
        String s = "){";

        isValid(s);

    }

    public static boolean isValid(String s) {

        /*
        using a stack
        check through each stack if what we find is in our stack
        */
        if (s.length() % 2 != 0)
            return false;
        // checking if its an even number


        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){

             if ( c ==')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if ( c =='}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if ( c ==']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        System.out.println(stack.isEmpty());
        return stack.isEmpty();
    }

}