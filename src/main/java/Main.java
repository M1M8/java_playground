import core.week_2.bubble_sort.BubbleSort;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(2);
        newList.add(5);
        newList.add(1);
        newList.add(7);

        BubbleSort.sort(newList);
    }

}