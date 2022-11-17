package easy;

// 10. check if the sentence is pangram
public class _10_CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean cas = checkIfPangram(sentence);
        System.out.println(cas);
    }

    public static boolean checkIfPangram(String sentence) {
        for (int val = 97; val < 123; val++) {
            if (!sentence.contains(String.valueOf((char) val)))
                return false;
        }
        return true;
    }
}