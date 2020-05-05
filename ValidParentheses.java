import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return true;

        Map<Character, Character> validParaentheses = new HashMap<>();
        validParaentheses.put('(', ')');
        validParaentheses.put('{', '}');
        validParaentheses.put('[', ']');
        Stack<Character> element = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (validParaentheses.containsKey(ch)) {
                element.add(ch);
            } else if (element.isEmpty() || validParaentheses.get(element.pop()) != ch) {
                return false;
            }
        }

        return element.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("valid " + isValid("(([]){})"));
    }
}