// https://leetcode.com/problems/reverse-integer/description/

package medium;

public class ReverseInteger {

    public static int reverse(int x) {
        if (Math.abs(x) == 0)
            return 0;
        if ((int) Math.log10(Math.abs(x)) + 1 == 10) {
            if (Math.abs(x) % 10 > 2)
                return 0;
            else if ((Math.abs(x) / 10) % 10 > 1)
                return 0;
            else if ((Math.abs(x) / 100) % 10 > 4)
                return 0;
            else if ((Math.abs(x) / 1000) % 10 > 7)
                return 0;
            else if ((Math.abs(x) / 100000) % 10 > 8)
                return 0;
            else if ((Math.abs(x) / 10000000) % 10 > 6)
                return 0;
            else if ((Math.abs(x) / 100000000) % 10 > 4)
                return 0;
        }
        int rev = 0;
        while (Math.abs(x) > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (x < 0)
            return -rev;
        else
            return rev;
    }

    public static void main(String[] args) {
        int num = -1563847412;
        System.out.println(reverse(num));
    }
}
