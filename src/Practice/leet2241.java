package Practice;

import java.util.Arrays;

public class leet2241 {
    public static void main(String[] args) {
        int[][] arr1 = {
                 {1, 23}
                ,{1, 12,34,324}
                ,{1, 12,45}
                ,{1, 12,45,4,5,7}
        };
        arr1[0] = new int[3];
        arr1[1] = new int[5];
        System.out.println(Arrays.deepToString(arr1));
    }
}