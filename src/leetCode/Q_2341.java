package leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Q_2341 {
    public static int[] pairs(int nums[]){
        int max = 0,count=0,leftover=0;
        for(int num : nums){
            max = Math.max(max,num);
        }
        int[] freq = new int[max+1];
        for(int num :nums){
            freq[num]++;
        }
        for (int num : freq){
            if(num > 0){
                count += num/2;
                leftover += num%2;
            }
        }
        return new int[]{count , leftover};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Equal Paired array : " + Arrays.toString(pairs(arr)));
    }
}
