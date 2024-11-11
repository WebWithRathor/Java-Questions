package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Program58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element " + i + " : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
}
