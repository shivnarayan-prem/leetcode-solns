package easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        return x == reverse(x);
    }

    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) 
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) 
                return 0;
            rev = rev * 10 + digit;
        }
        return rev;
    }

    public static void main(String[] args) {
        PalindromeNumber palin = new PalindromeNumber();
        int n = 121;
        int m = -121;
        System.out.println(palin.isPalindrome(n));
        System.out.println(palin.isPalindrome(m));
    }
}
