import java.util.Stack;

public class LongestVaildParentheses {

    public static int longestValidParentheses(String s) {
        if (s.length() == 0)
            return 0;
        Stack<Integer> count = new Stack<>();
        count.push(-1);
        int validCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count.push(i);
            } else {
                count.pop();
                if (count.isEmpty()) {
                    count.push(i);
                } else {
                    validCount = Math.max(validCount, i - count.peek());
                }
            }
        }
        return validCount;
    }

    public static void main(String[] args) {
        System.out.println("valid count" + longestValidParentheses("))()()(())"));
    }
}
