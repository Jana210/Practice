public class AtoI {

	public static int myAtoi(String str) {

		if (str == null || str.trim().isEmpty())
			return 0;

		str = str.trim();
		String strRegx = "^[0-9+-]{0,1}[0-9]+$";
		if (str.charAt(0) != '-' && str.charAt(0) != '+' && !Character.isDigit(str.charAt(0))) {
			return 0;
		}

		StringBuilder num = new StringBuilder();
		int count = 0;
		for (char c : str.toCharArray()) {

			if ((c == '+' || c == '-') && num.length() > 0) {
				count++;
			}

			if (count > 0 || !Character.isDigit(c) && c != '+' && c != '-') {
				break;
			}
			num.append(c);
		}


		if (!num.toString().matches(strRegx)) {
			return 0;
		}

		if (num.charAt(0) == '-') {
			try {
				return Integer.parseInt(num.toString().trim());
			} catch (NumberFormatException e) {
				return Integer.MIN_VALUE;
			}
		} else {
			try {
				return Integer.parseInt(num.toString().trim());
			} catch (NumberFormatException e) {
				return Integer.MAX_VALUE;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Int value" + myAtoi("-13+"));
	}
}
