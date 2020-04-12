import java.util.Arrays;

public class MedianOfArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		if (nums1.length > nums2.length) {
			return findMedianSortedArrays(nums2, nums1);
		}

		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int lengthX = nums1.length;
		int lengthY = nums2.length;
		double medianValue = 0;

		int start = 0;
		int end = lengthX;

		while (start <= end) {
			int partitionX = (start + end) / 2;
			int partitionY = (start + end + 1) / 2 - partitionX;

			int maxLefttX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
			int minRightX = (partitionX == lengthX) ? Integer.MAX_VALUE : nums1[partitionX];

			int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
			int maxRightY = (partitionY == lengthY) ? Integer.MAX_VALUE : nums2[partitionY];

			if (maxLefttX <= maxRightY && maxLeftY <= minRightX) {
				if ((start + end) % 2 == 0) {
					medianValue = ((double) Math.max(maxLeftY, maxLefttX) + Math.max(maxRightY, minRightX)) / 2;
				} else {
					medianValue = (double) Math.max(maxLefttX, maxLeftY);
				}
			} else if (maxLefttX > maxRightY) {
				end = partitionX - 1;
			} else {
				start = partitionX + 1;
			}
		}

		return medianValue;
	}

}
