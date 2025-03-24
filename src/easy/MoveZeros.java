package easy;

import java.util.Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0) {
                if(i != j){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeros move = new MoveZeros();
        int[] nums = new int[]{1, 0, 0, 2, 3, 4, 0, 0 , 22, 2, 2 , 11, 2, 222, 4};
        move.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
