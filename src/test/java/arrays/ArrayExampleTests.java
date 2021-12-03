package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayExampleTests
{
    ArrayExamples arrayExample = new ArrayExamples();
    private int[] originalGameMenu = {1, 2, 3, 4, 5};

    @Test
    public void originalMenuTest()
    {
        Assertions.assertArrayEquals(arrayExample.getGameMenuItems(), originalGameMenu);
    }

    @Test
    public void arrayLengthTest()
    {
        Assertions.assertEquals(arrayExample.getGameMenuItems().length, 7);
    }
}
