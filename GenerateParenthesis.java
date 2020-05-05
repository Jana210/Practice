import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> parenthesis = new ArrayList<>();
        if (n == 0) {
            return parenthesis;
        }
        parenthesisCombinations(parenthesis, "", 0, 0, n);
        return parenthesis;

    }

    private void parenthesisCombinations(List<String> parenthesis, String values, int i, int j, int n) {
        if (values.length() == n * 2) {
            parenthesis.add(values);
            return;
        }

        if (i < n)
            parenthesisCombinations(parenthesis, values.concat("("), i + 1, j, n);
        if (j < i)
            parenthesisCombinations(parenthesis, values.concat(")"), i, j + 1, n);
    }
}
