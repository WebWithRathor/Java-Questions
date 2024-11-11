package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Program62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the element " + i + 1 + " : ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int find = sc.nextInt();
        int start = 0, end = arr.length - 1 , mid = (start+end)/2;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == find)
                break;
            else if (arr[mid] > find) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (arr[mid] != find) mid = -1;
        System.out.println("The number found at " + mid);
    }
}
