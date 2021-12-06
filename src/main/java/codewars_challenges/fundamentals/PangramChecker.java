package codewars_challenges.fundamentals;

import java.util.Arrays;

public class PangramChecker
{
    public boolean check(String sentence)
    {
        sentence = sentence.replaceAll(" ", "");
        sentence = sentence.toLowerCase();
        char[] sentenceArray = sentence.toCharArray();
        Arrays.sort(sentenceArray);

        return true;
    }


}
