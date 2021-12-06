package core.week_2.palindrome_checker;

import java.util.Locale;

public class PalindromeChecker
{
    public PalindromeChecker()
    {

    }

    public boolean checkPalindrome(String word)
    {
        String palindrome = word.toLowerCase(Locale.ROOT);
        char[] palindromeArray = palindrome.toCharArray();

        for(int i = 0; i < palindromeArray.length - i; i++)
        {
            int indexOfArray = palindromeArray.length - (i + 1);
            boolean isLettersIdentical = palindromeArray[i] == palindromeArray[indexOfArray];
            if(!isLettersIdentical)
            {
                return false;
            }
        }

        return true;
    }


}
