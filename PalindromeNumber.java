
public class PalindromeNumber {

	public boolean isPalindrome(int x) {

		String normal = new StringBuilder().append(Math.abs(x)).toString();
		String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();

		if (x < 0) {
			normal = "-".concat(normal);
			reversed = reversed.concat("-");
		}

		return normal.equals(reversed);
	}

}
