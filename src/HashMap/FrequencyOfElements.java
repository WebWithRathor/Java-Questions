package HashMap;

import java.util.HashMap;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 123, 4, 56, 43, 45};
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            if (freq.containsKey(num)) {
                int val = freq.get(num);
                val++;
                freq.put(num, val);
            } else {
                freq.put(num, 1);
            }
        }

        System.out.println(freq);
    }


}
