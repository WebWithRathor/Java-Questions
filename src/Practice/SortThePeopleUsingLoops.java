package Practice;

import java.util.Arrays;

public class SortThePeopleUsingLoops {
    public static String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            for (int j = i+1 ; j < names.length; j++) {
                if (heights[i] < heights[j]) {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                    String tempNames = names[i];
                    names[i] = names[j];
                    names[j] = tempNames;
                }
            }
        }
        return names;
    }

    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
}
