
public class FirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] indexes = { -1, -1 };
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                if(count == 0) {
                    indexes[0] = i;
                    indexes[1] = i;
                    count++;
                } else {
                    indexes[1] = i;
                }
            }
        }
        return indexes;
    }
}
