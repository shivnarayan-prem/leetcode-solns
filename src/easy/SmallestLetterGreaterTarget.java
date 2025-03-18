package easy;

public class SmallestLetterGreaterTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }   
        return letters[start % letters.length];

    }

    public static void main(String[] args) {
        // char a = '\0';
        // System.out.println(a);

        char target = 'c';
        // System.out.println(target);

        char[] letters = new char[] { 'c', 'f', 'j' };
        System.out.println(nextGreatestLetter(letters, target));

        // System.out.println(Arrays.toString(letters));

    }

}
