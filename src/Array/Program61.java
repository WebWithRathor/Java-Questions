package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Program61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element " + i + " : ");
            arr[i] = sc.nextInt();
        }
       int i = 0, j = arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--]= temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
