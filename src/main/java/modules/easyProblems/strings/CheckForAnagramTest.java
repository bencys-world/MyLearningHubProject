package modules.easyProblems.strings;

import java.util.Arrays;

/**
 * Program to check if it is Anagram.
 * Anagram -> a word, phrase, or name formed by rearranging the letters of another.
 */
public class CheckForAnagramTest {

    public static boolean isAnagram(String word1,String word2) {

        if(word1 == null || word2 == null) {
            return false;
        }
        if (word1.trim().length()!= word2.trim().length())  {
            return false;
        }
        char[] w1 = word1.toUpperCase().toCharArray();
        char[] w2 = word2.toUpperCase().toCharArray();

        Arrays.sort(w1);
        Arrays.sort(w2);
       return Arrays.equals(w1,w2);


    }

    public static void main(String[] args) {

        System.out.println(" Bency  & becyn " +isAnagram("Bency","becyn"));

        System.out.println(" 1234  & 4321 " +isAnagram("1234","4321"));

        System.out.println(" 1234  & 9999 " +isAnagram("1234","9999"));

        System.out.println(" aaav  & aa " +isAnagram("aaav","aa"));

        System.out.println(" null  & aa " +isAnagram(null,"aa"));
    }
}
