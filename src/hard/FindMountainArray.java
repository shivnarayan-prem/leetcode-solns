package hard;

public class FindMountainArray {

    public static int findInMountainArray(int target, int[] mountainArr) {
        int n = mountainArr.length;
        int start = 0, end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] < mountainArr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        int peak = start;
        System.out.println(peak);

        int restart = 0, reend = peak;
        int firstIndex = -1;
        while (restart <= reend) {
            int mid = restart + (reend - restart) / 2;
            if (mountainArr[mid] == target) {
                firstIndex = mid;
                reend = mid - 1;
            } else if (mountainArr[mid] <= target) {
                restart = mid + 1;
            } else {
                reend = mid - 1;
            }
        }

        if (target == mountainArr[peak] && firstIndex < 0)
            return peak;

        if (firstIndex >= 0)
            return firstIndex;

        restart = peak;
        reend = mountainArr.length - 1;
        while (reend >= restart) {
            int mid = reend + (restart - reend) / 2;
            if(mountainArr[mid] == target) return mid;
            if (mountainArr[mid] <= target) {
                reend = mid - 1;
            } else {
                restart = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] mountainArr = new int[] { 0, 1, 2, 4, 5, 4, 3, 1 };
        int target = 3;
        System.out.println(findInMountainArray(target, mountainArr));
    }

}
