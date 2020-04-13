import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public int romanToInt(String s) {
		if (s == null || s.isEmpty())
			return 0;

		Map<String, Integer> romanIntValues = new HashMap<>();
		romanIntValues.put("M", 1000);
		romanIntValues.put("D", 500);
		romanIntValues.put("C", 100);
		romanIntValues.put("L", 50);
		romanIntValues.put("X", 10);
		romanIntValues.put("V", 5);
		romanIntValues.put("I", 1);

		int convertedNumber = 0;

		try {
			for (int i = 0; i < s.length(); i++) {
				if (i == 0) {
					convertedNumber += romanIntValues.get(String.valueOf(s.charAt(i)));
				} else if (romanIntValues.get(String.valueOf(s.charAt(i))) > romanIntValues
						.get(String.valueOf(s.charAt(i - 1)))) {
					convertedNumber += romanIntValues.get(String.valueOf(s.charAt(i)))
							- 2 * romanIntValues.get(String.valueOf(s.charAt(i - 1)));
				} else {
					convertedNumber += romanIntValues.get(String.valueOf(s.charAt(i)));
				}
			}
		} catch (NullPointerException ne) {
			return 0;
		}

		return convertedNumber;
	}

	public static void main(String[] args) {
		RomanToInteger rmi = new RomanToInteger();
		System.out.println("Integer number " + rmi.romanToInt("K"));
	}

}
