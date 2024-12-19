package HashSet;

import java.util.HashSet;

// non unique elements should occur even times
public class OnlyUniqueElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2,2,1,3,4,5};
        HashSet<Integer> uni = new HashSet<>();
        for(int num : arr){
            if(uni.contains(num))uni.remove(num);
            else uni.add(num);
        }
        System.out.println(uni);

    }
}
