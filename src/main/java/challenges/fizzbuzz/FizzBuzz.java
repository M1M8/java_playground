package challenges.fizzbuzz;

import java.util.Arrays;

public class FizzBuzz
{
    /*
        Print integers 1 to N, but print “Fizz” if an integer is divisible by 3,
        “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is divisible by both 3 and 5.
     */

    public static Boolean isDivisibleBy(int number, int multiple)
    {
        return number % multiple == 0;
    }

    public static Boolean isDivisibleBy(int number, int multipleA, int multipleB)
    {
        return ((number % multipleA == 0) && (number % multipleB == 0));
    }

    public static void printMessage(int message)
    {
        System.out.println(message);
    }

    public static void printMessage(String message)
    {
        System.out.println(message);
    }

    public static void printFizzBuzz(int maxNumber)
    {
        for(int index = 1; index <= maxNumber; index++)
        {
            if(isDivisibleBy(index, 3, 5))
            {
                printMessage("FizzBuzz");
            }
            else if(isDivisibleBy(index, 5))
            {
                printMessage("Buzz");
            }
            else if(isDivisibleBy(index, 3))
            {
                printMessage("Fizz");
            }
            else
            {
                printMessage(index);
            }

        }
    }

    public static void main(String[] args)
    {
        printFizzBuzz(1000);
    }
}
