package leetCode;

import java.util.Scanner;

public class Q_2206 {
    public static boolean divideArray(int[] nums) {
        int arr[]= new int[501];
        for(int i =0 ; i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int i =0; i<501;i++){
            if(arr[i]%2!=0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Equal Paired array : " + divideArray(arr));
    }
}
