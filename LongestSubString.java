import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public int lengthOfLongestSubstring(String s) {
		int length = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if (allUniqueChar(s, i, j)) {
					length = (j - i) > length ? (j - i) : length;
				}
			}
		}
		return length;
	}

	private boolean allUniqueChar(String s, int i, int j) {
		Set<Character> longChar = new HashSet<>();
		for (int x = i; x < j; x++) {
			if (longChar.contains(s.charAt(x))) {
				return false;
			}
			longChar.add(s.charAt(x));
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("iufhaeouifhaeo"));
	}

}
