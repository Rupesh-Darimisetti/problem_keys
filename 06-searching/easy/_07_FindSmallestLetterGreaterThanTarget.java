package easy;

public class _07_FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char greaterAlphabetThanTarget = nextGreatestLetter(letters, target);
        System.out.println(greaterAlphabetThanTarget);
    }

    private static char nextGreatestLetter(char[] letters, char target) {

        int start = 0, end = letters.length;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}