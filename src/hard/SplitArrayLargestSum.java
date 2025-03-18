package hard;

public class SplitArrayLargestSum {
    public static int splitArray(int[] nums, int k) {
        int start = 0, end = 0;
        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(iscut(nums, k, mid)) end = mid;
            else start = mid + 1;
        }
        return start;
    }

    public static boolean iscut(int[] nums, int k, int mid) {
        int count = 1, thissum = 0;
        for(int i = 0; i < nums.length; i++) {
            if( thissum + nums[i] > mid) {
                thissum = nums[i];
                count++;
                if(count > k) return false;
            } else thissum += nums[i];
        }
        return true;
    }
}
