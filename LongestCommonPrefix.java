import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";

		Map<Integer, String> stringSize = new HashMap<>();
		int[] arraySizes = new int[strs.length];
		
		for(int i =0; i < strs.length; i++) {
			stringSize.put(strs[i].length(), strs[i]);
			arraySizes[i] = strs[i].length();
		}

		StringBuilder commonPrefix = new StringBuilder();
		int minSizeString = Arrays.stream(arraySizes).min().getAsInt();
		String minString = stringSize.get(minSizeString);
		for (int i = 0; i < minString.length(); i++) {
			int count = 0;
			for (int n = 0; n < strs.length; n++) {
				if (minString.charAt(i) == strs[n].charAt(i)) {
					count++;
				}
			}
			if (count == strs.length) {
				commonPrefix.append(minString.charAt(i));
			} else {
				break;
			}
		}

		return commonPrefix.toString();
	}

	public static void main(String[] args) {
		// String[] strn = { "flower", "flow", "flight" };
		String[] strn = new String[0];
		System.out.println("longest common prefix" + longestCommonPrefix(strn));
	}
}
