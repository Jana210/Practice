import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSubString {

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> positions = new ArrayList<>();
        if (s.length() == 0 || words.length == 0) {
            return positions;
        }

        final Map<String, Integer> wordsCount = new HashMap<>();
        for (final String word : words) {
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }

        int n = s.length(), num = words.length, len = words[0].length();
        for (int i = 0; i < n - num * len + 1; i++) {
            final Map<String, Integer> seen = new HashMap<>();
            int j = 0;
            while (j < num) {
                final String word = s.substring(i + j * len, i + (j + 1) * len);
                if (wordsCount.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    if (seen.get(word) > wordsCount.getOrDefault(word, 0)) {
                        break;
                    }
                } else {
                    break;
                }
                j++;
            }
            if (j == num) {
                positions.add(i);
            }
        }
        return positions;
    }

    public static void main(String[] args) {
        String[] words = { "word", "good", "best", "word" };
        System.out.println("Positions " + findSubstring("wordgoodgoodgoodbestword", words));
    }
}
