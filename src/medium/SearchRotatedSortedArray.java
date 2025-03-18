package medium;

public class SearchRotatedSortedArray {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 1)
            return nums[0] == target ? 0 : -1;
        int start = 0, end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        int peak = start;
        if (target >= nums[0]) {
            start = 0;
            end = peak;
        } else {
            start = peak + 1;
            end = n - 1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        int target = 3;
        System.out.println(search(nums, target));
    }
}
