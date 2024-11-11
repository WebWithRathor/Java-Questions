package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Program59 {
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
        int temp = arr[0];
        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));

    }
}
