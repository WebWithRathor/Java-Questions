package TreeMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {

        TreeMap<Integer, String> tree = new TreeMap<>(Collections.reverseOrder());
//        String[] result = new String[heights.length];

        for (int i = 0; i < heights.length; i++) {
            tree.put(heights[i], names[i]);
        }

//        int i = 0;
//        for (int key : tree.keySet()){
//            result[i++]=tree.get(key);
//        }

        return tree.values().toArray(new String[0]);
    }

    public static void main(String[] args) {

        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        System.out.println(Arrays.toString(sortPeople(names, heights)));

    }
}
