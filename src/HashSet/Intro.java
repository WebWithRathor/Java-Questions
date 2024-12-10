package HashSet;

import java.util.HashSet;

public class Intro {
    public static void main(String[] args) {
        // Declaration
//        HashSet<Integer> set = new HashSet<>(10);

        // Adding elements
//        set.add(1);



        // int array set
//        int[] arr = {1,2,3,4};
//        for (int num : arr){
//            set.add(num);
//        }

        // char array set

        HashSet<Character> set  = new HashSet<>();

        char[] cArr = {'a','b','c','d','d'};

        String name = "Devraj";
        for (int i = 0; i < name.length(); i++) {
            set.add(name.charAt(i));
        }

        System.out.println(set);
    }
}
