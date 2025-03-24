package easy;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0, maxOccur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                maxOccur = nums[i];
            }
            if (nums[i] != maxOccur) count--;
            else count++;
        }
        return maxOccur;
    }

    public static void main(String[] args) {
        MajorityElement major = new MajorityElement();
        int[] nums = new int[]{2,2,2,2,2,2,1,1,1,1,1};
        System.out.println(major.majorityElement(nums));
    }
}
