package easy;

public class FirstBadVersion {
    public static int firstBadVersion(int n, int bad) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(isBadVersion(mid, bad)) end = mid;
            else start = mid + 1;
        }
        return start;
    }

    public static boolean isBadVersion(int mid, int bad){
        return mid >= bad;
    }
    public static void main(String[] args) {
        int n = 6, bad = 2;
        System.out.println(firstBadVersion(n, bad));
    }
}
