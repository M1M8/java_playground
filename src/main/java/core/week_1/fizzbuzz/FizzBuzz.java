package core.week_1.fizzbuzz;

public class FizzBuzz
{
    /*
        Print integers 1 to N, but print “Fizz” if an integer is divisible by 3,
        “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is divisible by both 3 and 5.
     */

    private Boolean isDivisibleBy(int number, int multiple)
    {
        return number % multiple == 0;
    }

    private Boolean isDivisibleBy(int number, int multipleA, int multipleB)
    {
        return ((number % multipleA == 0) && (number % multipleB == 0));
    }

    private void printMessage(int message)
    {
        System.out.println(message);
    }

    private void printMessage(String message)
    {
        System.out.println(message);
    }

    public void printFizzBuzz(int maxNumber)
    {
        for(int number = 1; number <= maxNumber; number++)
        {
            if(isDivisibleBy(number, 3, 5))
            {
                printMessage("FizzBuzz");
            }
            else if(isDivisibleBy(number, 5))
            {
                printMessage("Buzz");
            }
            else if(isDivisibleBy(number, 3))
            {
                printMessage("Fizz");
            }
            else
            {
                printMessage(number);
            }

        }
    }

}
