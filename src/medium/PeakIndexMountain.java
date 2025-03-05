package medium;

public class PeakIndexMountain {
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0, end = n-1;
        while (start<end){
            int mid = start + (end - start) / 2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else {
                end = mid;
            } 
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 5, 7, 9, 23, 45, 15, 6, 2, 1 };
        System.out.println(peakIndexInMountainArray(arr));
    }
}
