public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int end = nums.length - 2;
        int start = end;

        while (start >= 0 && nums[start + 1] <= nums[start]) {
            start--;
        }

        if (start >= 0) {
            int j = end + 1;
            while (j >= 0 && nums[j] <= nums[start]) {
                j--;
            }
            swapNumbers(nums, start, j);
        }
        reverseNumbers(nums, start + 1, end + 1);

    }

    private void reverseNumbers(int[] nums, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            swapNumbers(nums, i, j);
            i++;
            j--;
        }
    }

    private void swapNumbers(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();
        int[] nums = { 3, 2, 1 };
        np.nextPermutation(nums);
    }

}
