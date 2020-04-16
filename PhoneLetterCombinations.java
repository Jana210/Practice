import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneLetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> letterCombinations = new ArrayList<>();
        if (digits.length() == 0) {
            return letterCombinations;
        }

        Map<Character, String> mappedAlphaNumeric = new HashMap<>();
        mappedAlphaNumeric.put('2', "abc");
        mappedAlphaNumeric.put('3', "def");
        mappedAlphaNumeric.put('4', "ghi");
        mappedAlphaNumeric.put('5', "jkl");
        mappedAlphaNumeric.put('6', "mno");
        mappedAlphaNumeric.put('7', "pqrs");
        mappedAlphaNumeric.put('8', "tuv");
        mappedAlphaNumeric.put('9', "wxyz");

        letterCombinations.add("");
        for (char ch : digits.toCharArray()) {
            letterCombinations = createLetterCombinations(letterCombinations, mappedAlphaNumeric.get(ch));
        }

        return letterCombinations;
    }

    private List<String> createLetterCombinations(List<String> alphabets, String anotherAlphabet) {

        List<String> combinations = new ArrayList<>();
        for (String alphabet : alphabets) {
            for (char c : anotherAlphabet.toCharArray()) {
                combinations.add(alphabet + c);
            }
        }

        return combinations;
    }

    public static void main(String[] args) {
        // [-1,0,1,2,-1,-4]
        PhoneLetterCombinations pl = new PhoneLetterCombinations();
        System.out.println("Combinations" + pl.letterCombinations("2"));
    }

}
