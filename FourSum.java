import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> fourSum = new ArrayList<>();
        if (nums.length < 4) {
            return fourSum;
        }

        Arrays.sort(nums);
        Set<List<Integer>> fourDiffNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int k = j + 1;
                int l = nums.length - 1;
                while (k < l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        List<Integer> innerList = new ArrayList<>();
                        innerList.add(nums[i]);
                        innerList.add(nums[j]);
                        innerList.add(nums[k]);
                        innerList.add(nums[l]);
                        if (!fourDiffNums.contains(innerList)) {
                            fourSum.add(innerList);
                            fourDiffNums.add(innerList);
                        }
                        k++;
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }

                }
            }
        }
        return fourSum;
    }

    public static void main(String[] args) {
        // [-1,0,1,2,-1,-4]
        int[] arr = { 1, 0, -1, 0, -2, 2 };
        System.out.println("Set of sum list" + fourSum(arr, 0));
    }

}
