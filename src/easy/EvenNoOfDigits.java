package easy;

public class EvenNoOfDigits {
    public static int findNumbers(int[] nums) {
        int ctr = 0;
        for(int i = 0, j = nums.length-1; i<=j; i++, j--){
            if(((int) Math.log10(nums[i])+1)%2==0){
                ctr++;
            }
            if(i!=j && ((int) Math.log10(nums[j])+1)%2==0){
                ctr++;
            }
        }
        return ctr;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
