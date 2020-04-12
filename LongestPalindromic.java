public class LongestPalindromic {

	public String longestPalindrome(String s) {

		if (s == null || s.isEmpty())
			return "";

		int start = 0;
		int end = 0;
		for (int i = 0; i < s.length(); i++) {
			int pos1 = findMidddlePosition(s, i, i);
			int pos2 = findMidddlePosition(s, i, i + 1);
			int pos = Math.max(pos1, pos2);
			if (pos > end - start) {
				start = i - ((pos - 1) / 2);
				end = i + (pos / 2);
			}
		}

		return s.substring(start, end + 1);

	}

	public int findMidddlePosition(String s, int left, int right) {

		if (left > right)
			return 0;

		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}

		return right - left - 1;
	}

}
