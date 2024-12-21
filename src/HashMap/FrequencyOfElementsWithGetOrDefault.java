package HashMap;

import java.util.HashMap;

public class FrequencyOfElementsWithGetOrDefault {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2, 2, 123, 4, 56, 43, 45};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) freq.put(num, freq.getOrDefault(num, 0) + 1);

        System.out.println(freq);
    }


}