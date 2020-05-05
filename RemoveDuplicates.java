public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int l = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[l]) {
                l++;
                nums[l] = nums[i];
            }
        }
        return l + 1;
    }

    public static void main(String[] args) {
        int[] numbers = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println("lenght after removing duplicates" + removeDuplicates(numbers));
    }
}

