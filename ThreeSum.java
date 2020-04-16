import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSum = new ArrayList<>();
        if (nums.length < 3) {
            return threeSum;
        }

        Arrays.sort(nums);
        Set<Integer> numbers = new HashSet<>();
        Set<List<Integer>> threeDiffNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (numbers.contains(-sum)) {
                    List<Integer> innerList = new ArrayList<>();
                    innerList.add(nums[i]);
                    innerList.add(nums[j]);
                    innerList.add(-sum);
                    if (!threeDiffNums.contains(innerList)) {
                        threeSum.add(innerList);
                        threeDiffNums.add(innerList);
                    }
                }

            }
            numbers.add(nums[i]);
        }
        return threeSum;
    }

    public static void main(String[] args) {
        // [-1,0,1,2,-1,-4]
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        System.out.println("Set of sum list" + threeSum(arr));
    }
}
