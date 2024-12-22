package HashMap;

import java.util.HashMap;

public class UniqueSumUsingHashMap {
    public static int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int num : nums) freq.put(num, freq.getOrDefault(num, 0) + 1);
        int sum = 0;
        for (HashMap.Entry<Integer, Integer> num : freq.entrySet()){
            if(num.getValue() == 1) sum+= num.getKey();
        }

        return sum;
    }

    public static void main(String[] args) {
        int [] num = {1,2,3,2};
        System.out.println(sumOfUnique(num));

    }
}
