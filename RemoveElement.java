
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[l] = nums[i];
                l++;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] numbers = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println("lenght after removing duplicates" + removeElement(numbers, 2));
    }
}
