package ArrayList;

import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(4,50);
        System.out.println(arr);
//        arr.remove(Integer.valueOf(1));
//        arr.remove((Integer)(50));
        arr.set(4,100);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        arr.forEach((e)->{
            System.out.println(e);
        });
        arr.clear();
        System.out.println(arr);
    }
}
