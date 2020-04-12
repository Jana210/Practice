
public class IntegerToRoman {
	public static String intToRoman(int num) {
		if (num <= 0)
			return "";

		StringBuilder convertedRoman = new StringBuilder();
		int[] div = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanNumbers = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int i = 0;
		while (i < div.length) {
			if (num >= div[i]) {
				convertedRoman.append(romanNumbers[i]);
				num -= div[i];
			} else {
				i++;
			}
		}

		return convertedRoman.toString();
	}

	public static void main(String[] args) {
		System.out.println(intToRoman(3));
	}
}
