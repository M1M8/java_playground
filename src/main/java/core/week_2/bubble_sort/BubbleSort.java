package core.week_2.bubble_sort;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort
{
    public static ArrayList<Integer> sort(ArrayList<Integer> bubbleSortArray)
    {
        if(!bubbleSortArray.isEmpty())
        {
            for(int i = 0; i < bubbleSortArray.size(); i++)
            {
                for(int j = i + 1; j < bubbleSortArray.size(); j++)
                {
                    boolean isLessThan = bubbleSortArray.get(i) < bubbleSortArray.get(j);
                    if(!isLessThan)
                    {
                        Collections.swap(bubbleSortArray, i, j);
                    }
                }
            }
        }

        return bubbleSortArray;
    }
}
