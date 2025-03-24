package medium;

public class MinInRotatedArray {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[end]) start = mid + 1;
            else end = mid;
        }
        return nums[start];
    }

    public static void main(String[] args) {
        MinInRotatedArray min = new MinInRotatedArray();
        int[] nums = new int[]{4, 5, 6, 7, 8, 9, 10, 0, 1, 2, 3};
        System.out.println(min.findMin(nums));
    }
}
