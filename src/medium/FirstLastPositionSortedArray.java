package medium;

import java.util.Arrays;

public class FirstLastPositionSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int firstIndex = -1, lastIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                firstIndex = mid;
                end = mid - 1;
            } else if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                lastIndex = mid;
                start = mid + 1;
            } else if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[] { firstIndex, lastIndex };
    }

    public static void main(String[] args) {
        int[] nums = new int[] {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
