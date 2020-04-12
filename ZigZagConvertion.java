import java.util.ArrayList;
import java.util.List;

public class ZigZagConvertion {

	public String convert(String s, int numRows) {

		if (numRows == 1)
			return s;

		List<StringBuilder> rows = new ArrayList<>();

		for (int i = 0; i < numRows; i++) {
			rows.add(new StringBuilder());
		}
		
		int row = 0;
		boolean downwards = false;
		for (char c : s.toCharArray()) {
			rows.get(row).append(c);
			if (row == 0 || numRows - 1 == row) {
				downwards = !downwards;
			}
			row += downwards ? 1 : -1;
		}

		StringBuilder zigZagString = new StringBuilder();
		for (StringBuilder rowData : rows) {
			zigZagString.append(rowData.toString());
		}

		return zigZagString.toString();
	}

}
