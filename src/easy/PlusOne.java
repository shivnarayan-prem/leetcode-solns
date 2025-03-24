package easy;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--){
            if (digits[i]<9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] gigaDigit = new int[digits.length + 1];
        gigaDigit[0] = 1;
        return gigaDigit;
    }

    public static void main(String[] args) {
        PlusOne plus = new PlusOne();
        int[] digits = new int[] {1, 9, 9, 9, 9};
        System.out.println(Arrays.toString(plus.plusOne(digits)));
    }
}
