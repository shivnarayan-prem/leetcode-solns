package medium;

public class TrailingZeros {
    public int trailingZeroes(int n) {

        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n = n / 5;
        }
        return count;


        // if (n == 0 || n < 0)
        //     return 0;
        // n = factorial(n);
        // int count = 0;
        // while (n > 0) {
        //     if(n%10 == 0) count++;
        //     else return count;
        //     n /= 10;
        // }
        // return count;
    }

    public int factorial(int n) {
        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        TrailingZeros trail = new TrailingZeros();
        int n = 3;
        int m = 5;
        int o = 1000;
        System.out.println(trail.trailingZeroes(n));
        System.out.println(trail.trailingZeroes(m));
        System.out.println(trail.trailingZeroes(o));
    }
}
