package easy;

public class CountDigitDivideNumber {
    public static int countDigits(int num) {
        int count = 0;
        int n = num;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && num % digit == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 126;
        System.out.println(countDigits(n));
    }
}
