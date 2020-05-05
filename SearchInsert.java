
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int pos = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            for (int i = 0; i < nums.length; i++) {
                if (target < nums[i]) {
                    pos = i;
                    break;
                }
            }
        }

        return pos == -1 ? nums.length : pos;
    }

}
