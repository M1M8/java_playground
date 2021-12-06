package core.week_1.arrays;

public class ArrayExamples
{
    private int[] gameMenuItems = {1, 2, 3, 4, 5};

    public void amendValue(int indexOfArray,  int value)
    {
        this.gameMenuItems[indexOfArray] = value;
    }

    public int[] getGameMenuItems()
    {
        return gameMenuItems;
    }
}
